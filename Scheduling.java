import java.time.*;
import java.time.format.DateTimeFormatter;

public class Scheduling {
	public static void main(String[] args) {
		LocalDate day = LocalDate.of(2026, 8, 15);
		LocalTime time = LocalTime.of(9, 30);
		System.out.println("Tech Conference: " + day + " at " + time);
		
		day = day.plusDays(10);
		time = time.plusHours(2);
		System.out.println("Postponed to: " + day + " at " + time);
				
		LocalDate waiting = LocalDate.now();
		Period current = Period.between(waiting, day);
		System.out.println("Waiting Period: " + current.getYears() + "years " + current.getMonths() + "months " + current.getDays() + "days");

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy" + " " + time);
		String formatted = day.format(formatter);
		System.out.println("Prefered format: " + formatted);
		
		String text = "20-12-2026 18:45";
		DateTimeFormatter formatterr = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
		LocalDateTime second = LocalDateTime.parse(text, formatterr);
		System.out.println("Next event: " + second);
	}
}