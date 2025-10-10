package curriculum_A;

public class Question1 {
	
	public static void main(String[] args) {

		// Q1 各型の変数を宣言し、初期値を設定してください。
		// Q2 1で宣言した各型の変数に指定された値を代入してください
		byte byteNum = 10;
		short shortNum = 100;
		int intNum = 1000;
		long longNum = 10000;
		float floatNum = 9.5f;
		double doubleNum = 10.5;
		char letter = 'a';
		String letters = "ハロー";
		boolean isBoolean = true;
		
		
		// Q3 値を代入した変数を用いて出力をしてください
		System.out.println(byteNum + shortNum + intNum + longNum); // 11110を出力
		System.out.println(byteNum + byteNum); // 20を出力
		System.out.println(letter + " " + letters + " " + isBoolean); // a ハロー trueを出力 
		System.out.println(byteNum + shortNum + intNum + longNum + floatNum + doubleNum); // 数字をすべて足して出力
		System.out.println(byteNum * shortNum * intNum * longNum); // 小数点以外の数字を全てかけてを出力
		System.out.println(doubleNum / shortNum); //10.5割る100をして出力
		System.out.println(byteNum - shortNum); //10引く100をして出力
		System.out.println(); // 空白行
		
		
		// Q4 nameというString型の変数を宣言する。
		String name = "山田太郎"; // name変数に"山田太郎"を代入
		System.out.println("こんにちは、" + name + "さん！"); // コンソールに こんにちは、山田太郎さん！を出力
		System.out.println(); // 空白行
		
		
		// Q5 ageというint型の変数を宣言する。
		int age = 25; // ageに25を代入
		System.out.println("年齢:" + age + "歳"); // コンソールに 年齢:25歳 を出力
		System.out.println(); // 空白行
		
		
		// Q6 num1とnum2というint型の変数を宣言する。
		int num1 = 10; // num1に10を代入
		int num2 = 5; // num2nに5を代入
		int sum = (num1 + num2); // num1とnum2を足した結果をsumというint型の変数に代入
		System.out.println(sum); // コンソールにsumの結果を出力
		System.out.println(); // 空白行
		
		
		// Q7 scoreというint型の変数を宣言
		int score = 80; // scoreに80を代入
		System.out.println("最終スコア:" + (score + 20)); // scoreに20を加え、コンソールに 最終スコア:100 を出力
		System.out.println(); // 空白行
		
		
		//Q8 priceというdouble型の変数を宣言
		double price = 99.99; // priceに99.99を代入
		System.out.println("整数価格:" + (int)price); // priceをint型に変換し、コンソールに 整数価格:99と出力 
		System.out.println(); // 空白行
		
		
		//Q9 String型の変数numStrを宣言
		String numStr = "123"; // numStrに"123"を代入
		int numStr2 = Integer.parseInt(numStr); // numStrをint型に変換
		System.out.println("変換後の値" + (numStr2 + 10)); // numStrに10を足した結果をコンソールに出力
		System.out.println(); // 空白行
		
		
		// Q10 int型の変数numを宣言
		int num = 50; // numに50を代入
		String numS = String.valueOf(num); // numをString型に変換
		System.out.println("得点:" + (numS) + "点"); // コンソールに 得点:50点と出力
		System.out.println(); // 空白行
		
		
		// Q11 aがbより小さいかどうかを条件演算子を使用して作成
		int a = 10; // int型変数aに10を代入
		int b = 20; // int型変数bに20を代入
		boolean result = (a < b); // aがbより小さいかboolean変数resultに代入
		System.out.println(result); // コンソールにresultの結果を出力
		System.out.println(); // 空白行	
		
		
		// Q12 条件演算子(三項演算子)を使用すること
		int x = 15; // int型変数xに15を代入
		String message = (x > 10) ? "OK" : "NG"; // String型変数messageにxが10以上なら"OK"そうでなければ"NG"を代入
		System.out.println(message); // messageの結果をコンソールに出力
		System.out.println(); // 空白行	
		
		
		// Q13 String text = "私はJavaが好きです。Javaは楽しい！";という文章の「Java」を「Python」に変換する。
		String java = "Python"; // String型変数javaにPythonを代入
		String text = "私は" + java + "が好きです。" + java + "は楽しい！"; // String型変数textの文章にjavaを代入
		System.out.println(text); // コンソールにtextの結果を出力
		
			
	}	
}
