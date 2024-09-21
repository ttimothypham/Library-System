// Name: Timothy Pham
// Period: 2nd

import java.io.*;
import java.util.Scanner;
public class LibrarySystem {
	
	public static void main (String args[]) throws IOException{
		
		LibraryIO Harvard = new LibraryIO("LibraryInfo.txt");
		int size = 17;
		LibraryItem[] array = new LibraryItem[size];
		int userInput;
		Scanner menu = new Scanner(System.in);
		do
		{
			System.out.println();
			System.out.println("Type a 1 to display all of the LibraryItems");
			System.out.println("Type a 2 to check out a LibraryItem");
			System.out.println("Type a 3 to return a LibraryItem");
			System.out.println("Type a 5 to exit the program");
			userInput = menu.nextInt();
			System.out.println();
		
			if (userInput == 1) //Display
			{
				for (LibraryItem i: Harvard.readInput())
				{
					System.out.println(i.toString());
					System.out.println();
				}
			}
		
			if (userInput == 2) //Check out
			{
				System.out.print("Enter the library item's id: ");
				int input = menu.nextInt();
				menu.nextLine();
				int count = 0;
				for (LibraryItem i: Harvard.readInput())
				{
					int itemId = i.getId();
					if (input == itemId)
					{
						System.out.println(i.toString());
						if (i.isInStock() == true)
						{
							System.out.println("Are you sure you want to check this item out? (Y/N)");
							String yOrN = menu.nextLine();
							if (yOrN.equals("Y"))
							{
								i.checkOutItem();
								System.out.println("Item successfully checked out.");
								System.out.println(i.toString());
								System.out.println();
							}
						}
						else if (i.isInStock() == false)
						{
							System.out.println("Item is not availible for check out.");
							System.out.println();
						}
					}
					if (input != itemId)
					{
						count = count + 1;
						if (count == size)
						{
							System.out.println("ID not found.");
							System.out.println();
						}
					}
				}

			}
		
			if(userInput == 3) //return
			{
				System.out.print("Enter the library item's id: ");
				int input = menu.nextInt();
				menu.nextLine();
				int count = 0;
				for (LibraryItem i: Harvard.readInput())
				{
					int itemId = i.getId();
					if (input == itemId)
					{
						System.out.println(i.toString());
						if (i.isInStock() == false)
						{
							System.out.println("Are you sure you want to return this item? (Y/N)");
							String yOrN = menu.nextLine();
							if (yOrN.equals("Y"))
							{
								i.returnItem();
								System.out.println("Item successfully returned.");
								System.out.println(i.toString());
								System.out.println();
							}
						}
						else if (i.isInStock() == true)
						{
							System.out.println("Item is already in stock.");
							System.out.println();
						}
					}
					if (input != itemId)
					{
						count = count + 1;
						if (count == size)
						{
							System.out.println("ID not found.");
							System.out.println();
						}
					}
				}
			
			}
		}
		while (userInput != 5);
	}
	
}

