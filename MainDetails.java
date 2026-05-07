public class MainDetails {
	public static void main(String[] args) {
		StudentDetails student1 = new StudentDetails();
		student1.StudentDetails("Natasha", 25, 65.83);
		StudentDetails student2 = new StudentDetails();
		student2.StudentDetails("Isabella", 24, 89.76);
		
		System.out.println("First Student Details");
		System.out.println("Name: " + student1.getName());
		System.out.println("Student ID: " + student1.getStudentId());
		System.out.println("Marks: " + student1.getMarks());
		System.out.print("Grade: ");
		student1.calculateGrade();
		
		System.out.println(" ");
		System.out.println("Second Student Details");
		System.out.println("Name: " + student2.getName());
		System.out.println("Student ID: " + student2.getStudentId());
		System.out.println("Marks: " + student2.getMarks());
		System.out.print("Grade: ");
		student2.calculateGrade();
	}
}