package kihon_gainen_1;

public class Employee {

		private String name;

		// 人物の名前(name)のgetterとsetterを定義
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		// "は働いています"を定義するメソッド
		public void work() {
			System.out.println(name + "は働いています");
		}
			
	}

