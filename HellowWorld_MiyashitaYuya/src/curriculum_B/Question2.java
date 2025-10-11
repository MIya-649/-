package curriculum_B;

public class Question2 {
	
	public static void main(String[] args) {
		
		// Q1 int型変数scoreを宣言
		int score = 75; // scoreに75を代入
		if(score >= 60) { // scoreが60以上か判定
			System.out.println("合格です！"); // 60以上の場合"合格です！"と表示
			System.out.println(); //空白行
		}
		
		
		// Q2 int型変数ageを宣言
		int age = 25; // ageに25を代入
		if(20 <= age && age <= 30) { //ageが20以上かつ30以下か判定
			System.out.println("適正年齢です"); //上記がtrueなら"適正年齢です"と表示
		}else { // それ以外の場合を判定
			System.out.println("対象外です"); //それ以外の場合は"対象外です"と表示
		}
		System.out.println(); // 空白行
		
		
		// Q3 int型の変数age1を宣言
		int age1 = 18; // age1に18を代入
		if(age1 >= 20) { // age1が20以上か判定(条件1)
			System.out.println("成人です"); // 条件1が正しければ"成人です"と表示
		}else if(age1 >=13 && age1 <= 19) { // age1が13以上かつ19以下か判定(条件2)
			System.out.println("ティーンエイジャーです"); // 条件2が正しければ"ティーンエイジャーです"と表示
		}else if(age1 <= 12) { // age1が12以下か判定(条件3)
			System.out.println("子供です"); // 条件3が正しければ"子供です"と表示
		}
		System.out.println(); // 空白行
		
		
		// Q4 int型の変数x,y,zを定義
		int x = 30, y = 15, z = 50; //xに30,yに15,zに50を代入
		if(x > y && x > z) { //xがy以上かつ、z以上か判定(条件1)
			System.out.println(x); //条件1が正しければxの結果を出力
		}else if(y > x && y > z) { //yがx以上かつ、z以上か判定(条件2)
			System.out.println(y); //条件2が正しければyの結果を出力
		}else if(z > x && z > y) { //zがx以上かつ、y以上か判定(条件3)
			System.out.println(z); //条件3が正しければzの結果を出力
		}
		System.out.println(); // 空白行
		
		
		// Q5 int型の変数numを定義
		int num = 1; // numに任意の数字を代入
		if(num > 0) { //numの値が0より大きいか判定(条件1)
			System.out.println("正の数です"); // 条件1が正しければ"正の数です"と表示
		}else if(num == 0) { // numの値が0か判定(条件2)
			System.out.println("0です"); // 条件2が正しければ"0です"と表示
		}else if(num < 0) { //numの値が0より小さいか判定(条件3)
			System.out.println("負の数です"); // 条件3が正しければ"負の数です"と表示
		}
		System.out.println(); // 空白行
		
		
		// Q6 int型の変数valueを定義
		int value = 1; // valueに任意の数字を代入
		if(value % 2 ==0) { // valueが2で割り切れるか判定(条件1)
			System.out.println("偶数です"); // 条件1が正しければ"偶数です"と表示
		}else { // それ以外の場合
			System.out.println("奇数です"); // 条件1が間違っていれば"奇数です"と表示
		}
		System.out.println(); // 空白行
		
		
		// Q7 int型の変数score1を宣言
		int score1 = 100; // score1に0～100を代入
		if(score1 >= 90){ // scoreが90以上か判定(条件1)
			System.out.println("優"); // 条件1が正しければ"優"と表示
		}else if(score1 >= 70) { // 条件1に当てはまらずscore1が70以上か判定(条件2)
			System.out.println("良"); // 条件2が正しければ"良"と表示
		}else if(score1 >= 50) { // 条件1,2に当てはまらずscore1が50以上か判定(条件3)
			System.out.println("可"); // 条件3が正しければ"可"と表示
		}else { //条件1,2,3以外であるか判定(条件4)
			System.out.println("不可"); // 条件4が正しければ"不可"と表示
		}
		System.out.println(); // 空白行
		
		
		// Q8 String型変数mojiを宣言
		String moji = null; // mojiにnull又は("")を代入
		if(moji == null || moji.isEmpty()) { // mojiにnull又は("")が代入されているか判定(条件1)
			System.out.println("入力が無効です"); // 条件1が正しければ"入力が無効です"と表示
		}
		System.out.println(); // 空白行
		
		
		// Q9 int型変数dayを宣言
		int day = 1; // dayに1～7の数を代入
		switch (day) { // dayが下記条件に当てはまるか判定
			case 1: // 代入された数が1の場合(条件1)
				System.out.println("月曜日"); // 条件1が正しければ"月曜日"と表示
				break;
			case 2: // 代入された数が1の場合(条件2)
				System.out.println("火曜日");// 条件2が正しければ"火曜日"と表示
				break;
			case 3: // 代入された数が1の場合(条件3)
				System.out.println("水曜日");// 条件3が正しければ"水曜日"と表示
				break;
			case 4: // 代入された数が1の場合(条件4)
				System.out.println("木曜日");// 条件4が正しければ"木曜日"と表示
				break;
			case 5: // 代入された数が1の場合(条件5)
				System.out.println("金曜日");// 条件5が正しければ"金曜日"と表示
				break;
			case 6: // 代入された数が1の場合(条件6)
				System.out.println("土曜日");// 条件6が正しければ"土曜日"と表示
				break;
			case 7: // 代入された数が1の場合(条件7)
				System.out.println("日曜日");// 条件7が正しければ"日曜日"と表示
				break;
			default: // dayに代入された数が1～7以外の場合
				System.out.println("無効な入力です"); // 無効な入力ですと表示
		}
		System.out.println(); // 空白行
		
		
		// Q10 int型の変数monthを宣言
		int month = 1; // monthに1～12の数を代入
		switch(month) { // monthが下記条件に当てはまるか判定
		case 1: case 2: case 12: // 代入された数が1,2,12の場合(条件1)
			System.out.println("冬"); // 条件1が正しければ"冬"と表示
			break;
		case 3: case 4: case 5: // 代入された数が3,4,5の場合(条件2)
			System.out.println("春"); // 条件2が正しければ"春"と表示
			break;
		case 6: case 7:	case 8: // 代入された数が6,7,8の場合(条件3)
			System.out.println("夏"); // 条件3が正しければ"夏"と表示
			break;
		case 9:	case 10: case 11: // 代入された数が9,10,11の場合(条件4)
			System.out.println("秋"); // 条件4が正しければ"秋"と表示
			break;
		default: // monthに代入された数が1～12以外の場合
			System.out.println("無効な月です"); // 無効な月ですと表示
			
		}
		
	}

}
