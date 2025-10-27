package curriculum_D;


public class Character {
	// キャラクターステータス
	private String name;
	private int hp;
	private int at;
	private int sp;
	
	public Character(String name, int hp, int at, int sp) {
		this.name = name;
		this.hp = hp;
		this.at = at;
		this.sp = sp;
	}
	
	// getterを定義
	public String getName() {
		return name;
	}
	public int getHp(){
		return hp;
	}
	public int getAt() {
		return at;
	}
	public int getSp() {
		return sp;
	}
	
	// setterを定義
		public void setName(String name) {
			this.name = name;
		}
		public void setHp(int hp){
			this.hp = hp;
		}
		public void setAt(int at){
			this.at = at;
		}
		public void setSp(int sp){
			this.sp = sp;
		}
	
}
