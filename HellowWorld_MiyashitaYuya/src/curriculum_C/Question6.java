package curriculum_C;

public class Question6 {

	// じゃんけん実行
	public static void main(String[] args) {
		// プレイヤーとCPUのインスタンス
		Player player = new Player();
		CPU cpu = new CPU();
		String[] hands = {"グー", "チョキ", "パー"};
		
		while (true) {
			// プレイヤーとCPUの手を取得
			int playerHand = player.getHand();
			int cpuHand = cpu.getHand();
			
			System.out.println("あなたの手: " + hands[playerHand]);
			System.out.println("CPUの手: " + hands[cpuHand]);
			
			// 勝敗の判定
			int result = Judge.judge(playerHand, cpuHand);
			
			// 勝つまで繰り返し
			if (result == 0) {
				System.out.println("あいこです。もう一度！");
			} else if (result == 1) {
				System.out.println("あなたの勝ち！");
				break;
			} else {
				System.out.println("CPUの勝ち！もう一度！");
			}
		}
	}
}