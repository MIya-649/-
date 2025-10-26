package polymorphism_5;

//パート社員クラス
class ContractEmployee extends Employee {
	public ContractEmployee(String id, String name) {
		super(id, name); // 親クラスのコンストラクタ呼び出し
	}
	// パート社員クラスの時給計算
	@Override
	public int calculateDailyWage(int hoursWorked) {
		int hourlyRate = 1000; // 時給
		return hoursWorked * hourlyRate; // パート社員は残業なし計算
	}
}
