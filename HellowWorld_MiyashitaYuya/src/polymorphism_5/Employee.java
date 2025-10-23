package polymorphism_5;

// 抽象クラスを定義
abstract class Employee {
	
	protected String id;
	protected String name;
	
	// コンストラクタで社員IDと名前を定義
	public Employee(String id, String name) {
		this.id = id;
		this.name = name;
		}
	// サブクラスで継承させるメソッド
	public abstract int calculateDailyWage(int hoursWorked);
}

// 正社員クラス
 class FullTimeEmployee extends Employee {
	public FullTimeEmployee(String id, String name) {
		super(id, name); // 親クラスのコンストラクタ呼び出し
	}
	// 正社員クラスの時給計算
	@Override
	public int calculateDailyWage(int hoursWorked) {
		int hourlyRate = 1200; // 時給
		int overtime = Math.max(0, hoursWorked - 8); //8時間以降は残業
		int regularHours = hoursWorked - overtime; // 通常勤務時間の定義
		return (regularHours * hourlyRate) + (int)(overtime * hourlyRate * 1.25); // 通常時給と残業自給の合計
		}
	}
// パート社員クラス
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
