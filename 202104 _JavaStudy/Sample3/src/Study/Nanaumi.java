package Study;

public class Nanaumi implements OrderFromMotoki, orderFromShihandai{

	private String name;
	private String date;
	
	public Nanaumi(String n, String yyyyMM) {
		name = n;
		date = yyyyMM;
		}
	
	private void submitOrder(final int shoriFlg) {
		String nameAnd = name + ",";
		
		if(shoriFlg == 0) {
		System.out.println(nameAnd + date + "の勤務表出しました。");
		}
		else if(shoriFlg == 1){
		System.out.println(nameAnd + date + "の交通費も出しました。");
		}
		else {
		System.out.println(nameAnd + "本当はまだ何も出していません。");
		}
	}
	
	public void doNothing() {
		submitOrder(-1);
		}

	
	
	@Override
	public void daseyaKinmuhyo() {
		submitOrder(0);
		// TODO 自動生成されたメソッド・スタブ	
	}

	@Override
	public void daseyaKotsuhi() {
		// TODO 自動生成されたメソッド・スタブ
		submitOrder(1);
		}

	@Override
	public void goToSevenEleven() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("先にセブンイレブン行って来ます。");
	}

	@Override
	public String doCreateJavaCurriculum() {
		// TODO 自動生成されたメソッド・スタブ
		return "Javaカリキュラム完成しました。";
	}
}


