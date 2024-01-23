public class Task1_5{
    public static void main(String[] args){
        String[] fruits={"みかん","りんご","ぶどう","メロン"};
        for(int i=0;i<fruits.length;i++){
            System.out.println(fruits[i]);
        }

        //1から100までを出力
        int i=1;
        while(i <=100){
          System.out.print(i);
          i++;
        }
        System.out.println();

        for(int k=1;k<=9;k++){
            for(int j=0;j<=9;j++){
                if(j==0){
                    System.out.print(k+"||");
                }
                else{
                    System.out.print((k*j)+"|");
                }
            }
                System.out.println();
        }
    }
}