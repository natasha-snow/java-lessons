public class Calculator{
		String name;
		int num; 
	
	public int add(int a, int b, int c) {
		return a + b + c;
	}
	
	public int add(int a, int b) {
		return a + b;
	}
	
	public double add(double a, double b) {
		return a + b;
	}
	
	public String print(String name) {
		return name;
	}
	
	public int print(int num) {
		return num;
	}
	
	public String print(String name, int num) {
		return name + num;
	}
	
	public int sum(int... nums) {
		int total = 0;
		
		for (int num : nums) {
			total += num;
		}
		return total;
	}
}