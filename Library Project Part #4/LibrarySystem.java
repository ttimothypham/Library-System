// Name: Timothy Pham
// Period: 2nd

import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
public class LibrarySystem {
	
	public static void main (String args[]) throws IOException{
		
		LibraryIO Harvard = new LibraryIO("LibraryInfo.txt","Tester.txt");
		ArrayList<LibraryItem> arrayList = new ArrayList<LibraryItem>();
		int userInput;
		Scanner menu = new Scanner(System.in);
		do
		{
			System.out.println();
			System.out.println("Type a 1 to display all of the library item");
			System.out.println("Type a 2 to check out a library item");
			System.out.println("Type a 3 to return a library item");
			System.out.println("Type a 4 to add a new library item");
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
						if (count == arrayList.size())
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
						if (count == arrayList.size())
						{
							System.out.println("ID not found.");
							System.out.println();
						}
					}
				}
			
			}
			
			if (userInput == 4) //add
			{
				System.out.print("Enter the library item's type: ");
				String input = menu.next();
				if (input.equals("Book"))
				{
					System.out.print("ID Number: ");
					int id = menu.nextInt();
					menu.nextLine();
			
					System.out.print("Title: ");
					String title = menu.nextLine();

					boolean stock = true;
			
					System.out.print("Author: ");
					String author = menu.nextLine();
			
					System.out.print("Number of pages: ");
					int pages = menu.nextInt();
					menu.nextLine();
					
					System.out.print("Genre: ");
					String genre = menu.nextLine();
					LibraryItem libro = new Book(id,title,stock,author,pages,genre);
					Harvard.readInput().add(libro);
					System.out.println(title + "(" + id + ")" + " has successfully been added to the library database,");
				}
				if (input.equals("Journal"))
				{
					System.out.print("ID Number: ");
					int id = menu.nextInt();
					menu.nextLine();
			
					System.out.print("Title: ");
					String title = menu.nextLine();

					boolean stock = true;
			
					System.out.print("Author: ");
					String author = menu.nextLine();
					
					System.out.print("Topic: ");
					String topic = menu.nextLine();
					LibraryItem journal = new JournalArticle(id,title,stock,author,topic);
					Harvard.readInput().add(journal);
					System.out.println(title + "(" + id + ")" + " has successfully been added to the library database,");
				}
				if (input.equals("CD"))
				{
					System.out.print("ID Number: ");
					int id = menu.nextInt();
					menu.nextLine();
			
					System.out.print("Title: ");
					String title = menu.nextLine();

					boolean stock = true;
			
					System.out.print("Artist: ");
					String artist = menu.nextLine();
			
					System.out.print("Run time: ");
					int rt = menu.nextInt();
					menu.nextLine();
					
					System.out.print("Genre: ");
					String genre = menu.nextLine();
					LibraryItem disc = new cd(id,title,stock,rt,artist,genre);
					Harvard.readInput().add(disc);
					System.out.println(title + "(" + id + ")" + " has successfully been added to the library database,");
				}
			}
			if (userInput == 5)
			{
				Harvard.writeOutput(Harvard.readInput());
			}
		}
		while (userInput != 5);
	}
	
}

