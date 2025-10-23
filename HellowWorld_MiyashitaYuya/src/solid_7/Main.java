package solid_7;

public class Main {

	public static void main(String[] args) {
		// ⑦オブジェクト試行の設計原則の実行例
		Payable[] employee = { // 配列でポリモーフィズムを使用して処理
				new FullTimeEmployee("田中花子", 9),
				new ContractEmployee("鈴木健太", 9) 
			};
		SalaryReporter reporter = new SalaryReporter();
		for (Payable e : employee) {
			reporter.reportSalary(e); // クラス依存せずに処理
		}
	}
}
