package interface_to_abstractClass_6;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		// ⑥インターフェイスと抽象クラスの実行例
		List<Billable> employees = new ArrayList<>();
		employees.add(new FullTimeEmployee("E002","田中花子"));
		employees.add(new FullTimeEmployee("E003","鈴木健太"));
		employees.add(new ContractEmployee("P002","伊藤武"));
				
		int hours = 9;
		for (Billable emp : employees) {
			Employee e = (Employee)emp; // 社員情報の呼び出し
			System.out.println(e.getId() + ":" + e.getName() + "の給与:" + emp.costForDay(hours) + "円");
		}
	}

}
