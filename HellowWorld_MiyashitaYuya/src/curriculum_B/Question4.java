package curriculum_B;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		
		
		int[] score = {1,2,3,4,5}; // Q1 1~5を格納
		for(int ln: score) { // lnにをコレクションを1つずつ表示
			System.out.println(ln);
		}
		System.out.println(); // 空白行
		
		

		int[] scores = {10, 20, 30, 40, 50};  // Q2 10~50をscoresに格納
		for(int i = scores.length -1; i >= 0; i --) { // socoresを逆順に表示
			System.out.println(scores[i]);
		}
		System.out.println(); // 空白行
		
		
		int[] number = {3,5,7,9,11}; // Q3 numberに3~11の数字を格納
		int sum = 0; 
		for(int ii = 0; ii < number.length; ii++) { // iiに格納した数字を一つずつ表示
			sum += number[ii]; // sumに表示した数字を足していく
		}
		System.out.println(sum);
		System.out.println(); // 空白行
		
		
		int[] arr = {12,7,9,21,5,18}; // Q4 arrに数字を格納
		int max = arr[0]; // maxを定義
		int min = arr[0]; // minを定義
		for (int ia = 1; ia <arr.length; ia++) {
			if(arr[ia] > max) { // コレクションの中から最大値を判定
				max = arr[ia];
			}
			if(arr[ia] < min) { // コレクションの中から最小値を判定
				min = arr[ia];
			}
		}
		System.out.println("最大値：" + max);
		System.out.println("最小値：" + min);
		System.out.println(); // 空白行
		
		
		int[] arr1 = {1,2,3,4,5,}; // Q5 arr1に数字を格納
		for(int ib = 0; ib < arr1.length; ib++) {
			System.out.println(arr1[ib] * 2); // コレクションを2倍して表示
		}
		System.out.println(); // 空白行
		
		
		int[] arr2 = {4, 7, 10, 15, 20}; // Q6 arr2に数字を格納
		Scanner scanner = new Scanner(System.in); // scannerクラスを
		System.out.print("数字を入力してください：");
		int input = scanner.nextInt();
		boolean found = false;  // 入力した数字をコレクション内にあるか判定
		for (int num : arr2) { // 一致してるか判定
			if (num == input) {
				found = true;
				break;
			}
		}
		if (found) {
			System.out.println("入力した値は配列に含まれています");
		} else {
			System.out.println("入力した値は配列に含まれていません");
			}
		scanner.close();
		System.out.println(); // 空白行
		
		
		int[][] array2D_1 = { {1, 2}, {3, 4}, {5, 6} }; // Q7 二次元配列を定義
		for (int ic = 0; ic < array2D_1.length; ic++) { // 各行と各列を繰り返し表示
			for (int jc = 0; jc < array2D_1[ic].length; jc++) {
				System.out.println(array2D_1[ic][jc]);
			}
		}
		System.out.println(); // 空白行
		
		
		int[][] array2D_2 = { {10, 20, 30}, {40, 50, 60}, {70, 80, 90} }; // Q8 二次元配列を定義
		int sum1 = 0;
		for (int id = 0; id < array2D_2.length; id++) { // 格納した数字を一つずつ表示
			for (int jd = 0; jd < array2D_2[id].length; jd++) { // 各行と各列を繰り返し表示
				sum1 += array2D_2[id][jd]; // 各要素を加算
			}
		}
		System.out.println("全要素の合計値: " + sum1);
		System.out.println(); // 空白行
		
		
		int[][] array = {{12, 15, 8},{6, 19, 25},{30, 2, 10}}; // Q9 二次元配列を定義
			int max1 = array[0][0]; // 最大値を定義
			int min1 = array[0][0]; // 最小値を定義
				for (int ie = 0; ie < array.length; ie++) {
					for (int je = 0; je < array[ie].length; je++) {
						if (array[ie][je] > max1) {  // 最大値の確認
							max1 = array[ie][je];
						}
						if (array[ie][je] < min1) { // 最小値の確認
							min1 = array[ie][je];
						}
					}
				}
		System.out.println("最大値: " + max1);
		System.out.println("最小値: " + min1);
		System.out.println(); // 空白行
		
		
		int[][][] array2 = {{ {1, 2}, {3, 4} },{ {5, 6}, {7, 8} }}; // Q10 三次元配列を適宜
		for (int i = 0; i < array2.length; i++) { // 格納した数字を一つずつ表示
			for (int j = 0; j < array2[i].length; j++) {
				for (int k = 0; k < array2[i][j].length; k++) {
					System.out.println(array2[i][j][k]);
				}
			}
		}
	}
}