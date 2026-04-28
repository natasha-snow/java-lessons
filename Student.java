package School;

public class Student {
	String name;
	String surname;
	int age;
	String subject;
	double grade;
	
	
	public Student(String name, String surname, int age, String subject, double grade){
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.subject = subject;
		this.grade = grade;
	}
	
	public void getGrade() {
		System.out.println("Student name: " + name);
		System.out.println("Student surname: " + surname);
		System.out.println("Student age: " + age);
		System.out.println("Student subject: " + subject);
		System.out.println("Student grade: " + grade);	
	}

	public void study() {
	System.out.println("Studying hard...");
	}
}