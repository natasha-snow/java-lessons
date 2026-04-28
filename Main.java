import java.util.Scanner;
import School.*;

public class Main{

public static void main(String[] args){
	Scanner me = new Scanner(System.in);
	Teacher teach = new Teacher("Gift", "Mlambo", 35);
	Student pupil = new Student("Natasha", "Ringane", 24, "Java", 11.75);

	teach.getInfo();
	System.out.println("");
	pupil.getGrade();
}
} 