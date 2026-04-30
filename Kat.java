public class Kat{
		String breed;
		int age;
		String color;
		String eyes;
 
		 
		public void sound() {
			System.out.println("meeowww...");
		 }
		 
		public void height() {
			System.out.println(0.2);
		 }
		
		public static void main() {		
		Kat pookie = new Kat();
		 
		pookie.breed = "Scottish Fold";
		pookie.age = 5;
		pookie.color = "white";
		pookie.eyes = "huge blue eyes";
		
		System.out.println("I have a cat called Pookie, she is a " + pookie.breed + ". She is " + pookie.age + " years old. Her fur is " + pookie.color + ", and she has " + pookie.eyes);
		 
		pookie.sound();
		pookie.height();
}
} 