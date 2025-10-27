package curriculum_D;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class DaemonLoader {
	// パッケージ内のファイルからステータスを読み込み
	public static Character loadFromFile(String filename) throws Exception{
		// パッケージ内からファイルの取得
		InputStream is = DaemonLoader.class.getResourceAsStream(filename);
		// 見つからない場合はエラー
		if(is == null) {
			throw new FileNotFoundException("Resource not found:" + filename);
		}
		// ファイルを1行ずつ読み込む
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		String name = br.readLine();
		int hp = Integer.parseInt(br.readLine());
		int at = Integer.parseInt(br.readLine());
		int sp = Integer.parseInt(br.readLine());
		br.close();
		// 読み込んだ情報でキャラクターオブジェクトの作成
		return new Character(name, hp, at, sp);
	}

}
