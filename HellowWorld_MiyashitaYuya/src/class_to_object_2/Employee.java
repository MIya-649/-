package class_to_object_2;

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
}
