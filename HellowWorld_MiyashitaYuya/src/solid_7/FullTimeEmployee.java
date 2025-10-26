package solid_7;

//正社員クラス 
class FullTimeEmployee implements Payable{
	private String name;
	private int hours;
				
	 // コンストラクタで名前,勤務時間,社員種別を定義
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