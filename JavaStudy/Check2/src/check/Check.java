package check;

import constants.Constants;

public class Check{

	private static String firstName = "細井";
	private static String lastName = "一哉";
	
	private static String printName (String firstName, String lastName) {
		return firstName + lastName;
		
	}
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		System.out.println(
				"printNameメソッド →　" + printName(firstName, lastName));
	
		
		
		Pet pet = new Pet(Constants.CHECK_CLASS_JAVA,Constants.CHECK_CLASS_HOGE);
		pet.introduce();
		
		RobotPet robotPet = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_R2D2);
		robotPet.introduce();	
	}

	

}
