package curriculum_B;

import java.util.ArrayList;
import java.util.List;

import curriculum_B.Employee.ContractEmployee;
import curriculum_B.Employee.Employee1;
import curriculum_B.Employee.Employee2;
import curriculum_B.Employee.Employee2.ContractEmployee1;
import curriculum_B.Employee.Employee2.ContractEmployee1.FullTimeEmployee2;
import curriculum_B.Employee.Employee2.ContractEmployee1.FullTimeEmployee2.ContractEmployee2;
import curriculum_B.Employee.Employee2.ContractEmployee1.FullTimeEmployee2.SalaryReporter;
import curriculum_B.Employee.Employee2.FullTimeEmployee1;
import curriculum_B.Employee.FullTimeEmployee;

public class Main {

	public static void main(String[] args) {
		
		// Q4 実行例
		Greeting greeting = new Greeting(); // 別クラスからを参照
			greeting.sayhello();
			System.out.println(); // 空白行
			
			
		// Q5 実行例
		Animal lion = new Animal(); // 別クラスを参照
		
		lion.setName("ライオン"); // nameにライオンを定義
		lion.setHeight(2.1); // heitghに体長の数字を定義
		lion.setSpeed(80); // speedに速度の数字を定義 
		
		System.out.println("動物名：" + lion.getName());
		System.out.println("体長：" + lion.getHeight() + "m");	
		System.out.println("速度：" + lion.getSpeed() + "km/h");	
		System.out.println();  // 空白行
		
		
		
		// ①基本概念の実行例
		Employee jinmei = new Employee(); // 別クラスを参照
		jinmei.setName("山田太郎"); // nameに任意の名前を定義
		jinmei.work(); // メソッドを呼び出す
		System.out.println();// 空白行
		
		
		// ②クラスとオブジェクトの実行例
		Employee jinmei1 = new Employee(); // 別クラスを参照
		jinmei1.setName("佐藤太郎"); // nameとemployeedに任意の文字列を定義
		jinmei1.setEmployeeId("E001");
		jinmei1.showInfo(); // メソッドを呼び出す
		System.out.println();// 空白行
		
		
		// ③カプセル化の実行例
		Employee jinmei2 = new Employee(); // 別クラスを参照
		jinmei2.setName("田中花子"); // nameとemployeedに任意の文字列を定義
		jinmei2.setEmployeeId("E002");
		
		// getメソッドで出力
		System.out.println("社員ID：" + jinmei2.getEmployeeId() + "," + "名前：" + jinmei2.getName());
		System.out.println();// 空白行
	
		
		// ④継承の実行例
		// 正社員のインスタンス作成
		Employee1 fullTime = new FullTimeEmployee("", ""); 
		int fullTimeWage = fullTime.calculateDailyWage(9); //勤務時間の定義
		// パートのインスタンス作成
		Employee1 contract = new ContractEmployee("", "");
		int contractWage = contract.calculateDailyWage(9); //勤務時間の定義
		// 結果の表示
		System.out.println("正社員の給与: " + fullTimeWage + "円");
		System.out.println("パート社員の給与: " + contractWage + "円");	
		System.out.println(); // 空白行
	
	
		// ⑤ポリモーフィズムの実行例
		List<Employee1> employeeList = new ArrayList<>(); // 社員リストと定義
		// リストに社員を追加
		employeeList.add(new FullTimeEmployee("E001:","佐藤太郎")); // 正社員 
		employeeList.add(new ContractEmployee("P001:","山田次郎")); // パート社員
		
		for(Employee1 emp : employeeList) {
			int wage = emp.calculateDailyWage(9); // 正社員とパート社員の勤務時間
			System.out.println(emp.id + emp.name + "の給与:" + wage + "円"); 
		}
		System.out.println(); // 空白行
		
		
		// ⑥インターフェイスと抽象クラスの実行例
		List<Billable> employees = new ArrayList<>();
		employees.add(new FullTimeEmployee1("E002","田中花子"));
		employees.add(new FullTimeEmployee1("E003","鈴木健太"));
		employees.add(new ContractEmployee1("P002","伊藤武"));
		
		int hours = 9;
		for (Billable emp : employees) {
			Employee2 e = (Employee2)emp; // 社員情報の呼び出し
			System.out.println(e.getId() + ":" + e.getName() + "の給与:" + emp.costForDay(hours) + "円");
			}
		System.out.println(); // 空白行
		
		
		// ⑦オブジェクト試行の設計原則の実行例
		Payable[] employee2 = { // 配列でポリモーフィズムを使用して処理
				new FullTimeEmployee2("田中花子", 9),
				new ContractEmployee2("鈴木健太", 9) 
		};
		SalaryReporter reporter = new SalaryReporter();
			for (Payable e : employee2) {
				reporter.reportSalary(e); // クラス依存せずに処理
		}
	}
}