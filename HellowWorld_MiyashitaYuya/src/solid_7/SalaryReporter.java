package solid_7;

//給与を出力するクラス
class SalaryReporter{
	public void reportSalary(Payable employee) { // インターフェイスのオブジェクトに依存
		System.out.println(employee.getType() +":" + employee.getName() + "の給与は" + 
		employee.caluculateSalaly() + "円です");
		}
	}