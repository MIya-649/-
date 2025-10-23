package curriculum_B;

public class Main {

	public static void main(String[] args) {
		
		// Q4 実行例
		Greeting greeting = new Greeting(); // 別クラスからを参照
			greeting.sayhello();
			System.out.println(); // 空白行
			
			
		// Q5 実行例
		Animal lion = new Animal(); // 別クラスを参照
		
		lion.setName("ライオン"); // nameにライオンを定義
		lion.setHeight(2.1); // heitghに体長の数字を定義
		lion.setSpeed(80); // speedに速度の数字を定義 
		
		System.out.println("動物名：" + lion.getName());
		System.out.println("体長：" + lion.getHeight() + "m");	
		System.out.println("速度：" + lion.getSpeed() + "km/h");	
		System.out.println();  // 空白行
	}
}