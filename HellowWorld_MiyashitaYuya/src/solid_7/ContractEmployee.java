package solid_7;

//パート社員クラス	
class ContractEmployee implements Payable{
	private String name;
	private int hours;
			
	 // コンストラクタで名前,勤務時間,社員種別を定義
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
	