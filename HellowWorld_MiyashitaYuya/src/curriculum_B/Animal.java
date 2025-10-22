package curriculum_B;

public class Animal {

	public String name;
	public double height;
	public double speed;
	
	// 動物の名前(name)のgetterとsetterを定義
	public String getName() { 
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	// 動物の体長(height)のgetterとsetterを定義
	public double getHeight() {
		return this.height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	
	// 動物の速度(speed)のgetterとsetterを定義
		public double getSpeed() {
			return this.speed;
		}
		public void setSpeed(double speed) {
			this.speed = speed;
		}
}
