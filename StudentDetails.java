public class StudentDetails{
	private String name;
	private int studentId;
	private double marks;
	
	void StudentDetails(String name, int studentId, double marks){
		this.studentId = studentId;
		
		if (name.isEmpty()) {
			System.out.println("Name cannot be empty.");
		} else {
			this.name = name;
		}
		
		if (marks < 0 || marks > 100) {
			System.out.println("Marks cannot be set below 0 or above 100");
		} else {
			this.marks = marks;
		}
	}
	
	public String getName() {
		return name;
	}
	
	public int getStudentId() {
		return studentId;
	}
	
	public double getMarks() {
		return marks;
	}
	
	void calculateGrade() {
		if (marks >= 75) {
			System.out.println("A");
		} else if (marks >= 50 && marks < 75) {
			System.out.println("B");
		} else {
			System.out.println("C");
		}
	}
}