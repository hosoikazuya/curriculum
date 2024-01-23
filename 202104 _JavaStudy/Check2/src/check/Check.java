package check;
import constants.Constants;

public class Check extends Constants{

    private static String firstName = "細井";
    private static String lastName = "一哉";
    
    private static String printName (String firstName, String lastName) {
        return firstName + lastName;
        
    }
    
    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        
        System.out.println(
                "printNameメソッド →　" + printName(firstName, lastName));
    
        
        
        Pet pet = new Pet(CHECK_CLASS_JAVA,CHECK_CLASS_HOGE);
        pet.introduce();
        
        RobotPet robotPet = new RobotPet(CHECK_CLASS_R2D2, CHECK_CLASS_R2D2);
        robotPet.introduce();   
    }
}
