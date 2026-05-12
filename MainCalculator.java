public class MainCalculator {
	public static void main(String[] args) {
		Calculator c = new Calculator();
		System.out.println(c.add(25, 20));
		System.out.println(c.add(40, 80));
		System.out.println(c.add(65.5, 70.8));
		System.out.println("Combined: " + c.print("Natasha") + " is " + c.print(24) +" and her username is"+ c.print("Snow", 25));
		System.out.println("Total sum: " + c.sum(c.add(25, 20) + c.add(40, 80)));
		
		//Counter.Counter();
		Counter.reset();
		Counter.getInstance();
	}
}