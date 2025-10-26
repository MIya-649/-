package polymorphism_5;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// ⑤ポリモーフィズムの実行例
		List<Employee> employeeList = new ArrayList<>(); // 社員リストと定義
		// リストに社員を追加
		employeeList.add(new FullTimeEmployee("E001:","佐藤太郎")); // 正社員 
		employeeList.add(new ContractEmployee("P001:","山田次郎")); // パート社員
				
		for(Employee emp : employeeList) {
			int wage = emp.calculateDailyWage(9); // 正社員とパート社員の勤務時間
			System.out.println(emp.getEmployeeId() + emp.getName() + "の給与:" + wage + "円"); 
		}
	}

}
