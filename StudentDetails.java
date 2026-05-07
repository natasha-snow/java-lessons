public class StudentDetails{
	private String name;
	private int studentId;
	private double marks;
	
	void StudentDetails(String name, int studentId, double marks){
		this.name = name;
		this.studentId = studentId;
		this.marks = marks;
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
	
	void verification() {
		if (name.isEmpty()) {
			System.out.println("Name cannot be empty.");
		} else {
			System.out.println(name);
		}
	}

	void amamaki() {
		if (marks < 0 && marks > 100) {
			System.out.println("Marks cannot be set below 0 or above 100");
		} else {
			System.out.println(marks);
		}
	}
}