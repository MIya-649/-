package curriculum_B;

public class Question5 {
	
	public static void helleWorld() { // Holle,Worldを表示するメソッド
		System.out.println("Hello,World!");
	}
	
	
	public static int doubleValue(int num) { // 引数を2倍にするメソッド
		return num *2;
	}
	
	
	public static boolean isEven(int num) { // Q3　偶数か奇数か判定するメソッド
		return num % 2 ==0;
	}
	
	
	public static void main(String[] args) {
	
		// Q1 実行例
		helleWorld();
		System.out.println(); //空白行
		
		
		// Q2 実行例
		int num = 10;
		int doubuled = doubleValue(num);
		System.out.println(doubuled);
		System.out.println(); //空白行
		
		
		// Q3 実行例
		int num1 = 7;
		int num2 = 10;
		if(isEven(num1)) {
			System.out.println(num1 + "は偶数です");
		}else {
			System.out.println(num1 + "は奇数です");
		}
		if(isEven(num2)) {
			System.out.println(num2 + "は偶数です");
		}else {
			System.out.println(num2 + "は奇数です");
		}
	}
}