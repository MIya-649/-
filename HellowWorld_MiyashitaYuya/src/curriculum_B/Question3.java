package curriculum_B;

import java.text.DecimalFormat;
import java.text.Format;
import java.util.Random;
import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
	
		for(int i = 1; i <= 10; i++) { // Q1 1~10までの数字をfor分を使って1つずつ表示
			System.out.println(+ i);
		}
		System.out.println(); // 空白行
		
		
		for(int ii = 2; ii <= 20; ii ++) { // Q2 2~20の数字を1つずつ表示
			if(ii % 2 ==0) { // iiが偶数か判定
				System.out.println(ii);
			}
		}
		System.out.println(); // 空白行
		
		
		for(int count = 10; count >= 1; count --) { // Q3 10~1までの数字を1つずつ表示
			System.out.println(count);
		}
		System.out.println(); // 空白行
		
		
		int sum = 0; // Q4 int型の変数sumに0っを代入
		for(int ia =1; ia <= 100; ia ++) { // 1~100までの数字を1つずつ宣言
			sum += ia; // sumに1~100までの数字を１つずつ代入して足していく
		}
		System.out.println(sum);
		System.out.println(); // 空白行
		
		
		String star[] = {"*","**","***","****","*****"};  // Q5 String型変数starに*を1~5個までコレクション
		for(String str: star) { // String型変数strにをコレクションを1つずつ表示
			System.out.println(str);
		}
		System.out.println(); // 空白行
		
		
		int count1 = 1; // Q6 int型変数count1に1を代入
		while(count1 <= 10) { // count1が10以下の場合ループ
			System.out.println(count1);
			count1 ++; // count1を1ずつ増やす
		}
		System.out.println(); // 空白行
		
		
		int j1 = 2;  // Q7 int型変数j1に2を代入
		while(j1 <= 20) { // j1が20以下の場合ループ
			if(j1 % 2 ==0) { // j1が偶数か判定
				System.out.println(j1);
			}
			j1 ++;  // j1を1ずつ増やす
		}
		System.out.println(); // 空白行
		
		
		int count2 = 10; // Q8 int型変数count2に10を代入
		do {
			System.out.println(count2);
			count2-- ; // count2の数を1つずつ減らしていく
		}while(count2 >= 1); // count2が1以下になるまでループ
		System.out.println(); // 空白行
		
		
		int ib =1; // Q9 int型変数ibに1を代入
		int sum1 = 0; //int型変数sum1に100を代入
		while(ib <= 100) { // ibが100以上になるまでループ
			sum1 += ib; // sum1にibを代入
			ib ++; // ibの数字を1ずつ増やしていく
		}
		System.out.println(sum1);
		System.out.println(); // 空白行
		
		
		Scanner scanner1 = new Scanner(System.in); // Q10 scnnerクラスを定義
		int ic;
		do {
			System.out.println("整数を入力してください");
			ic = scanner1.nextInt(); 
			if(ic != 0) { // icが0か判定
				System.out.println(ic);
				}			
			}while(ic != 0); // icが0でない限りループを続ける
		System.out.println("終了しました");
		// scanner1.close();
		System.out.println(); // 空白行
		
		
		Format f = new DecimalFormat("00"); // Q11 Formatクラスを宣言 整数が01などになるように
		for(int t1 =1 ; t1 <= 9; t1++) { // int型変数t1が1~9までの間繰り返し
			for(int y1 = 1; y1 <= 9; y1++) {  // int型変数y1が1~9までの間繰り返し
				System.out.print(" " + f.format(t1) + " * " + f.format(y1) + " = " + f.format(t1 * y1) + "||");
			}
			System.out.println(); // 改行
		}
		System.out.println(); // 空白行
		
		
		Random rand = new Random(); // Q12 ランダムクラス宣言
		Scanner scannerA = new Scanner(System.in); 
		int tvStock = rand.nextInt(11) + 1;  // テレビの残り台数を先に決める

		System.out.println("商品名を入力してください:");
		String inputLine = scannerA.nextLine();
		String[] inputProducts = inputLine.split("、|,"); // カンマまたは全角カンマで分割
		
		for (String product : inputProducts) { 
			product = product.trim(); // productの前後の空白を消す
			String output;
			switch (product) {  // パソコン～加湿器までは同じ処理0~11までの数字がランダムで出力
				case "パソコン":
				case "冷蔵庫":
				case "扇風機":
				case "洗濯機":
				case "加湿器":
					int stock = rand.nextInt(11) + 1;
					output = product + "の残り台数は" + stock + "台です";
					break;
				case "テレビ": // テレビとディスプレイは同じ商品として扱う、合計値が11になるように
				case "ディスプレイ":
					 output = (product.equals("テレビ")
						? "テレビの残り台数は" + tvStock + "台です。\nディスプレイの残り台数は" + (11 - tvStock) + "台です。"
						: "ディスプレイの残り台数は" + (11 - tvStock) + "台です。\nテレビの残り台数は" + tvStock + "台です。");
					 break;
				default:
					output ="『"+ product +"』" + "指定の商品ではありません"; 
					break;
				}
			System.out.println(output);
		}
		scannerA.close();
	}
}	

	

