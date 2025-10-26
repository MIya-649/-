package inheritance_4;

//抽象クラスを定義
abstract class Employee {
			
	private String id;
	private String name;
			
	// コンストラクタで社員IDと名前を定義
	public Employee(String id, String name) {
		this.id = id;
		this.name = name;
		}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	// 社員ID(employeeId)のgetterとsetterを定義
	public String getEmployeeId() {
		return this.id;
	}
	public void setEmployeeId(String id) {
		this.id = id;
	}
	// サブクラスで継承させるメソッド
	public abstract int calculateDailyWage(int hoursWorked);
	}