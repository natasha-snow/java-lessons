import java.util.*;

public class ArrayLists {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		
		numbers.add(5);
		numbers.add(25);
		numbers.add(14);
		numbers.add(28);
		numbers.add(17);
		
		for(int number : numbers)
			System.out.print(number + " ");
		
		Collections.sort(numbers);
		System.out.println("");
		
		Integer[] array = numbers.toArray(new Integer[0]);
		
		for(int number : array)
			System.out.print(number + " ");
	}
}