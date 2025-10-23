package solid_7;

public class Employee{
}
	// 正社員クラス 
	class FullTimeEmployee implements Payable{
		private String name;
		private int hours;
				
		 // コンストラクタで名前と勤務時間を定義
		public FullTimeEmployee(String name, int hours) {
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
		}
				
		// パート社員クラス	
		class ContractEmployee implements Payable{
			private String name;
			private int hours;
			
			public ContractEmployee(String name, int hours) {
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
		class SalaryReporter{
			public void reportSalary(Payable employee) { // インターフェイスのオブジェクトに依存
				System.out.println(employee.getType() +":" + employee.getName() + "の給与は" + 
			employee.caluculateSalaly() + "円です");
			}
		}