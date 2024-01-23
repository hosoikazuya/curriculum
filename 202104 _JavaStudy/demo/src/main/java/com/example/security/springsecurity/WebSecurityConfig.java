
package com.example.security.springsecurity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.example.security.springsecurity.account.AccountService;

//セキュリティー
//WebSecurityConfigクラス：認証・認可について設定を記述したクラスファイル。
//認可・Top.htmlへログインなしでアクセスしようとするとlogin.htmlへ遷移すること。
//認証・フォームへ入力されたユーザー名とパスワードの値をDBに格納された値と比較し合致すれば認証成功。


  //Spring-Securityのあれこれを使うためのもの
@EnableWebSecurity

public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private AccountService userService;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
        
          //認証されたユーザーの認証情報の返却。
        .authorizeRequests()
          //指定されたパスパターンに一致するリソースを適用対象にする。
          //permitAll() 常にtrueを返却する。
        .antMatchers("/login", "/login-error").permitAll()
          //hasRole() 引数に指定したロールを保持している場合にtrue1を返却する。
        .antMatchers("/**").hasRole("USER")
        .and()
          //フォームの認証の適用
        .formLogin()
          //loginPage　カスタムログインページへの遷移指定
          //failureUrl　カスタムログインページへの遷移不可時の遷移先指定
        .loginPage("/login").failureUrl("/login-error");
    }


    //変更点 ロード時に、「admin」ユーザを登録する。
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth
        .userDetailsService(userService)
        .passwordEncoder(passwordEncoder());

        if (userService.findAllList().isEmpty()) {
            userService.registerAdmin("admin", "secret", "admin@localhost");
            userService.registerManager("manager", "secret", "manager@localhost");
            userService.registerUser("user", "secret", "user@localhost");
        }
    }
    //変更点 PasswordEncoder(BCryptPasswordEncoder)メソッド
    @Bean
    public PasswordEncoder passwordEncoder() {
        //
        return new BCryptPasswordEncoder();
    }

}