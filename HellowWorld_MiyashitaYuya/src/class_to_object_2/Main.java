package class_to_object_2;

public class Main {

	public static void main(String[] args) {

	// ②クラスとオブジェクトの実行例
	Employee shain = new Employee(); // 別クラスを参照
	shain.setName("佐藤太郎"); // nameとemployeedに任意の文字列を定義
	shain.setEmployeeId("E001");
	shain.showInfo(); // メソッドを呼び出す
	}
}
