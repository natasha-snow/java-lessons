public class Counter {
	static int count;
	
	static void setCounter() {
		count++;
	}
	
	static {
		System.out.println("Counter ready");
	}
	
	static void reset() {
		count = 0;
	}
	
	static void getInstance() {
		System.out.println(count);
	}
}

