// Name: Timothy Pham
// Period: 2nd

import java.io.*;
public class LibraryRunner2 {
	
	public static void main (String args[]) throws IOException {
		
		LibraryIO test = new LibraryIO("LibraryInfo.txt");
		System.out.println(test.readInput());
		Book tester = new Book(11111,"Adventures with Bob",true,"Joe",100,"Fiction");
		test.readInput().add(tester);
		System.out.println();
		System.out.println(test.readInput());
		
		

		


	}
}

