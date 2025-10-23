package capsule_ka_3;

public class Main {

	public static void main(String[] args) {
	// ③カプセル化の実行例
	Employee shain = new Employee(); // 別クラスを参照
	shain.setName("田中花子"); // nameとemployeedに任意の文字列を定義
	shain.setEmployeeId("E002");
	
	// getメソッドで出力
	System.out.println("社員ID：" + shain.getEmployeeId() + "," + "名前：" + shain.getName());
	System.out.println();// 空白行
	
	}
}
