public class Multidimensional {
	public static void main(String[] args) {
	String[][] info = {
		{"Natasha", "Isabela", "Tiisetso"},
		{"Ayabonga", "Lerato", "Asanda"},
		{"Tumelo", "Mahlatse", "Karabo"}
	};
	
	for (int row = 0; row < info.length; row++) {
		for(int column = 0; column < info[row].length; column++) {
			System.out.println("Class " + row + ",Student " + column + ": " + info[row][column]);
		}
		System.out.print("");
	} 
}
}