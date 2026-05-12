public class Counter {
	static int count;
	
	Counter() {
		count++;
	}
	
	static {
		System.out.println("Counter ready");
	}
	
	static void reset() {
		while(count >= 100) {
			break;
		}
	}
	
	static void getInstance() {
		System.out.println(count);
	}
}

