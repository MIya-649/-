package curriculum_B;

public class Main {

	public static void main(String[] args) {
		
		// Q4 実行例
		Greeting greeting = new Greeting();
			greeting.sayhello();
			System.out.println(); // 空白行
			
			
		// Q5 実行例
		Animal lion = new Animal();
		lion.setName("ライオン");
		lion.setHeight(2.1);
		lion.setSpeed(80);
		
		System.out.println("動物名：" + lion.getName());
		System.out.println("体長：" + lion.getHeight() + "m");	
		System.out.println("速度：" + lion.getSpeed() + "km/h");	
	}
}