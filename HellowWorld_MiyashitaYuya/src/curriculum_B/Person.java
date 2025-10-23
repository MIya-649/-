package curriculum_B;

public class Person {

	protected String name;
	protected int age;
	protected double height;
	protected double weight;
	static int count;
	
	public Person (String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		count ++;
	}
	
	public double bmi() {
		return weight / (height * height);
	}
	
	public void print() {
		System.out.println("名前は" + name + "です");
		System.out.println("年齢は" + age + "です");
		System.out.println("BMIは" + String.format("%.2f",bmi()) +"です");
	}
	static public void printCount() {
		System.out.println("合計人数は"+ count +"人です");
	}
	
}
