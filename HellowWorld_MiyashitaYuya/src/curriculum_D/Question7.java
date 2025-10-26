package curriculum_D;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Question7 {
	
	// バトルログの作成
	static void logResult(String log) throws Exception{
		// 出力先のディレクトリ名
		String dir = "curriculum_D battleLog";
		File pakageDir = new File(dir);
		// ディレクトリがなければ作成
		if(!pakageDir.exists()) {
			pakageDir.mkdirs();
		}
		// バトルログのパスを指定
		File logFile = new File(pakageDir, "battle_log.txt");
		// 追記モードで書き込み
		PrintWriter pw = new PrintWriter(new FileWriter(logFile, true));
		pw.println(log);
		pw.close();
	}
	
	// ゲームの実行
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		// プレイヤー名の入力
		System.out.print("プレイヤー名を入力してください：");
		String playerName = sc.nextLine();
		// プレイヤーのステータスをランダムで設定
		int playerHp = 50 + rand.nextInt(51);
		int playerAt = 10 + rand.nextInt(11);
		int playerSp = rand.nextInt(9);
		Character player = new Character(playerName,playerHp,playerAt,playerSp);
		// Daemonのステータスをファイルから読み込み
		Character daemon = DaemonLoader.loadFromFile("Daemon_status.txt");
		
		// ステータスの表示
		System.out.println(player.name + "のHP:" + player.hp + "攻撃力:" + player.at + "速度:" + player.sp);
		System.out.println(daemon.name + "のHP:" + daemon.hp + "攻撃力:" + daemon.at + "速度:" + daemon.sp);
		System.out.println(); // 空白行
		
		// どちらかのHPが0になるまでループ
		while (player.hp > 0 && daemon.hp > 0) {
			Character first, second;
			
			// 速度で順番を決定
			if(player.sp >= daemon.sp) {
				// プレイヤーの方が速い場合
				first = player;
				second = daemon;
			}else if(player.sp < daemon.sp) {
				// Daemonの方が速い場合
				first = daemon; 
				second = player;
			}else {
				if(rand.nextBoolean()) {
					// 速度が同じならランダムで順番決定
					first = player; 
					second = daemon;
				}else {
					first = daemon; 
					second = player;
				}
			}
			// 先行の攻撃
			second.hp -= first.at;
			System.out.println(first.name + "の攻撃" + second.name + "の残りHP：" + second.hp);
			// 後攻のHPが0以下なら終了
			if(second.hp <= 0) break;
			
			// 後攻の攻撃
			first.hp -= second.at;
			System.out.println(second.name + "の攻撃" + first.name + "の残りHP：" + first.hp);
		}
		// 勝者判定
		String winner = player.hp > 0 ? player.name : daemon.name;
		System.out.println("勝者：" + winner);
		// バトルの結果をファイルに出力
		logResult("勝者：" + winner);
		sc.close();		
	}
}
