package curriculum_C;

import java.util.Scanner;

//プレイヤーの手を入力して表示
 class Player {
	private Scanner scanner = new Scanner(System.in);
	
	public int getHand() {
		System.out.print("グー(0)、チョキ(1)、パー(2) を入力: ");
		return scanner.nextInt();
	}
}