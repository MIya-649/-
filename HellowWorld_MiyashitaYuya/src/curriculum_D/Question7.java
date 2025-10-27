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
		String dir = "curriculum_D/battleLog";
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
		System.out.println(player.getName() + "のHP:" + player.getHp() + "攻撃力:" + player.getAt() + "速度:" + player.getSp());
		System.out.println(daemon.getName() + "のHP:" + daemon.getHp() + "攻撃力:" + daemon.getAt() + "速度:" + daemon.getSp());
		System.out.println(); // 空白行
		
		// どちらかのHPが0になるまでループ
		while (player.getHp() > 0 && daemon.getHp() > 0) {
			Character first, second;
			
			// 速度で順番を決定
			if(player.getSp() >= daemon.getSp()) {
				// プレイヤーの方が速い場合
				first = player;
				second = daemon;
			}else if(player.getSp() < daemon.getSp()) {
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
			
			second.setHp(second.getHp() - first.getAt());
			System.out.println(first.getName() + "の攻撃" + second.getName() + "の残りHP：" + second.getHp() );
			// 後攻のHPが0以下なら終了
			if(second.getHp() <= 0) break;
			
			// 後攻の攻撃
			first.setHp(first.getHp() - second.getAt());
			System.out.println(second.getName() + "の攻撃" + first.getName() + "の残りHP：" + first.getHp());
		}
		// 勝者判定
		String winner = player.getHp() > 0 ? player.getName() : daemon.getName();
		System.out.println("勝者：" + winner);
		// バトルの結果をファイルに出力
		logResult("勝者：" + winner);
		sc.close();		
	}
}
