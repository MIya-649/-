package curriculum_A;

public class Question1 {
	
	public static void main(String[] args) {

		// Q1 &Q2
		byte byteNum = 10;
		short shortNum = 100;
		int intNum = 1000;
		long longNum = 10000;
		float floatNum = 9.5f;
		double doubleNum = 10.5;
		char letter = 'a';
		String letters = "ハロー";
		boolean isBoolean = true;
		
		
		// Q3
		System.out.println(byteNum + shortNum + intNum + longNum); // 11110を出力
		System.out.println(byteNum + byteNum); // 20を出力
		System.out.println(letter + " " + letters + " " + isBoolean); // a ハロー trueを出力 
		System.out.println(byteNum + shortNum + intNum + longNum + floatNum + doubleNum); // 数字をすべて足して出力
		System.out.println(byteNum * shortNum * intNum * longNum); // 小数点以外の数字を全てかけてを出力
		System.out.println(doubleNum / shortNum); //10.5割る100をして出力
		System.out.println(byteNum - shortNum); //10引く100をして出力
		System.out.println(); // 空白行
		
		
		// Q4
		String name = "山田太郎";
		System.out.println("こんにちは、" + name + "さん！");
		System.out.println(); // 空白行
		
		
		// Q5
		int age = 25;
		System.out.println("年齢:" + age + "歳");
		System.out.println(); // 空白行
		
		
		// Q6
		int num1 = 10;
		int num2 = 5;
		int sum = (num1 + num2);
		System.out.println(sum);
		System.out.println(); // 空白行
		
		
		// Q7
		int score = 80;
		System.out.println("最終スコア:" + (score + 20));
		System.out.println(); // 空白行
		
		
		//Q8
		double price = 99.99;
		System.out.println("整数価格:" + (int)price);
		System.out.println(); // 空白行
		
		
		//Q9
		String numStr = "123";
		int numStr2 = Integer.parseInt(numStr);
		System.out.println("変換後の値" + (numStr2 + 10));
		System.out.println(); // 空白行
		
		
		// Q10
		int num = 50;
		String numS = String.valueOf(num);
		System.out.println("得点:" + (numS) + "点");
		System.out.println(); // 空白行
		
		
		// Q11
		int a = 10;
		int b = 20;
		boolean result = (a < b);
		System.out.println(result);
		System.out.println(); // 空白行	
		
		
		// Q12
		int x = 15;
		String message = (x > 10) ? "OK" : "NG";
		System.out.println(message);
		System.out.println(); // 空白行	
		
		
		//Q13
		String Java = "Python";
		String text = "私は" + Java + "が大好きです。" + Java + "は楽しい！";
		System.out.println(text);
		
			
	}	
}
