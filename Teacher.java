package School;

public class Teacher {
	String name;
	String surname;
	int age;
	
	public Teacher(String name, String surname, int age){
		this.name = name;
		this.surname = surname;
		this.age = age;
	}
	
	public void getInfo() {
		System.out.println("Teacher name: " + name);
		System.out.println("Teacher surname: " + surname);
		System.out.println("Teacher age: " + age);
	}
	
	public void teach() {
	System.out.println("Teaching students...");
	}
}