public class WhileStatement {
	static int n = 10;
	static int count = 1;
	public static void main(String[] args) {
		bracketNum();
		System.out.println("");
		bracketNumber();
		System.out.println("");
		commaNum();
		System.out.println("");
		commaNumber();
		System.out.println("");
		sumNum();
		System.out.println("");
		sumNumber();
	}
	
	public static void bracketNum() {
	while(count <= n) {
		System.out.print("[" + count + "]");
		count++;
	}
	}
	
	public static void bracketNumber() {
		int countA = 10;
		int nA = 1;
		
		do {
			System.out.print("[" + countA + "]");
			countA--;
		} while (countA >= nA);
	}
	
	public static void commaNum() {
		int count = 1;
		
		while(count <= n) {
			if(count < n) {
				System.out.print(count + ",");
			} else {
				System.out.print(count);
			}
		count++;
		}
	}
	
	public static void commaNumber() {
		int countB = 10;
		int nB = 1;

		do { 
			if(countB > nB) {
				System.out.print(countB + ",");
			} else {
				System.out.print(countB);
			}
		countB--;
		} while (countB >= nB);
	}
	
	public static void sumNum() {
		int sum = 0;
		int i = 1;
		
		while(i <= 5) {
			sum += i;
			i++;
		}
		System.out.print(sum);
	}
	
	public static void sumNumber() {
		int sum = 0;
		int i = 1;
		
		do {
			sum += i;
			i++;
		} while(i <= 5);
		System.out.print(sum);
	}
}