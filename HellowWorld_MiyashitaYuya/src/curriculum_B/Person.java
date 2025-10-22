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
		Person t = (Person)this;
		System.out.println("名前は" + t.name + "です");
		System.out.println("年齢は" + t.age + "です");
		System.out.println("BMIは" + String.format("%.2f",t.bmi()) +"です");
	}
	static public void printcount() {
		System.out.println("合計人数は"+ count +"人です");
	}
	
}
