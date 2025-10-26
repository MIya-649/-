package curriculum_C;

public class Judge {
	// 手の名前を定義する配列
	static String[] hands = {"グー", "チョキ", "パー"};
	
	// 勝敗判定用メソッド、 0 = あいこ、1 = プレイヤーの勝ち、 2 = CPUの勝ち
	static int judge(int player, int cpu) {
		if (player == cpu) return 0;
		if ((player == 0 && cpu == 1) || (player == 1 && cpu == 2) || (player == 2 && cpu == 0)) return 1;
		return 2;
	}
}