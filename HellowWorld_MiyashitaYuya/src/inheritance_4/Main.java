package inheritance_4;

public class Main {

	public static void main(String[] args) {
		// ④継承の実行例
		// 正社員のインスタンス作成
		Employee fullTime = new FullTimeEmployee("", ""); 
		int fullTimeWage = fullTime.calculateDailyWage(9); //勤務時間の定義
		// パートのインスタンス作成
		Employee contract = new ContractEmployee("", "");
		int contractWage = contract.calculateDailyWage(9); //勤務時間の定義
		// 結果の表示
		System.out.println("正社員の給与: " + fullTimeWage + "円");
		System.out.println("パート社員の給与: " + contractWage + "円");	
		System.out.println(); // 空白行

	}

}
