package Study;

public class NanaumiMain {
	
	public static void main(String[] args) {
		
		Nanaumi nanaumi = new Nanaumi("七海","2021/06");
		nanaumi.daseyaKinmuhyo();
		nanaumi.daseyaKotsuhi();
		nanaumi.doNothing();
		nanaumi.goToSevenEleven();
		
		final String message = nanaumi.doCreateJavaCurriculum();
		System.out.println("message =" + message);
	}
}
