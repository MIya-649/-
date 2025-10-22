package curriculum_B;

	public class Employee {

	private String name;
	private String employeeId;

	// 人物の名前(name)のgetterとsetterを定義
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	// "は働いています"を定義するメソッド
	public void work() {
		System.out.println(name + "は働いています");
	}
	
	
	// 社員ID(employeeId)のgetterとsetterを定義
	public String getEmployeeId() {
		return this.employeeId;
	}
	public void setEmployeeId(String id) {
		this.employeeId = id;
	}
	
	
	// "社員ID"と"名前"を出力するメソッド
	public void showInfo() {
		System.out.println("社員ID：" + employeeId + "," + "名前：" + name);
		}
	
	// 抽象クラスを定義
	static abstract class Employee1 {
		
		protected String id;
		protected String name;
		
		// コンストラクタで社員IDと名前を定義
		public Employee1(String id, String name) {
			this.id = id;
			this.name = name;
			}
		// サブクラスで継承させるメソッド
		public abstract int calculateDailyWage(int hoursWorked);
	}

	// 正社員クラス
	static public class FullTimeEmployee extends Employee1 {
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
	static public class ContractEmployee extends Employee1 {
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
	
	
	// 抽象クラスを定義
	static abstract class Employee2 implements Billable{
		protected String id;
		protected String name;
		
		public Employee2(String id, String name) {
			this.id = id;
			this.name = name;
		}
		
		// 社員IDと名前を取得
		public String getName() {
			return name;
		}
		public String getId() {
			return id;
		}
		
		
		static public class FullTimeEmployee1 extends Employee2 {
			public FullTimeEmployee1(String id, String name) {
				super(id, name); // 親クラスのコンストラクタ呼び出し
			}
			// 正社員クラスの時給計算
			@Override
			public int costForDay(int hoursWorked) {
				int hourlyRate = 1250; // 時給
				int overtime = Math.max(0, hoursWorked - 8); //8時間以降は残業
				int regularHours = hoursWorked - overtime; // 通常勤務時間の定義
				return (regularHours * hourlyRate) + (int)(overtime * hourlyRate * 1.25); // 通常時給と残業自給の合計
				}
			}
		// パート社員クラス
		static public class ContractEmployee1 extends Employee2 {
			public ContractEmployee1(String id, String name) {
				super(id, name); // 親クラスのコンストラクタ呼び出し
			}
			// パート社員クラスの時給計算
			@Override
			public int costForDay(int hoursWorked) {
				int hourlyRate = 1000; // 時給
				return hoursWorked * hourlyRate; // パート社員は残業なし計算
			}
		
			
			
		// 正社員クラス 
		static public class FullTimeEmployee2 implements Payable{
			private String name;
			private int hours;
			
			 // コンストラクタで名前と勤務時間を定義
			public FullTimeEmployee2(String name, int hours) {
				this.name = name;
				this.hours = hours;
				}
			
			@Override
			public int caluculateSalaly() {
				return hours * 1200;
				}
			@Override
			public String getName() {
				return name;
				}
			@Override
			public String getType() {
				return "正社員";
			}
			
			
		// パート社員クラス	
		static public class ContractEmployee2 implements Payable{
			private String name;
			private int hours;
			
			public ContractEmployee2(String name, int hours) {
				this.name = name;
				this.hours = hours;
				}
			@Override
			public int caluculateSalaly() {
				return hours * 1000;
				}
			@Override
			public String getName() {
				return name;
				}
			@Override
			public String getType() {
				return "パート社員";
			}
			
			}
			// 給与を出力するクラス
			static public class SalaryReporter{
				public void reportSalary(Payable employee) { // インターフェイスのオブジェクトに依存
					System.out.println(employee.getType() +":" + employee.getName() + "の給与は" + 
				employee.caluculateSalaly() + "円です");
					}
				}
			}
		}
	}
}