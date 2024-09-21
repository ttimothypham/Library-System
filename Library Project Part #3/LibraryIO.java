// Name: Timothy Pham
// Period: 2nd
import java.io.*;
import java.util.Scanner;
public class LibraryIO{
	
	private String inputFile;
	
	public LibraryIO(String i)
	{
		inputFile = i;
	}
	
	public LibraryItem[] readInput() throws IOException
	{
		Scanner file = new Scanner(new File(inputFile));
		int size = file.nextInt();
		LibraryItem[] array = new LibraryItem[size];
		for (int i = 0; i < size; i++)
		{
			//System.out.print("ID Number: ");
			int id = file.nextInt();
			//System.out.println(id);
			file.nextLine();
			
			
			//System.out.print("Title: ");
			String title = file.nextLine();
			//System.out.println(title);
			
			//System.out.print("In Stock: ");
			boolean stock = file.nextBoolean();
			//System.out.println(stock);
			file.nextLine();
			
			//System.out.print("Type: ");
			String type = file.nextLine();
			//System.out.println(type);
			
			
			//System.out.print("Author/Artist: ");
			String author = file.nextLine();
			//System.out.println(author);
			
			if (type.equals("Book"))
			{
				//System.out.print("Number of pages: ");
				int pages = file.nextInt();
				//System.out.println(pages);
				file.nextLine();
				//System.out.print("Genre: ");
				String genre = file.nextLine();
				LibraryItem b = new Book(id,title,stock,author,pages,genre);
				array[i] = b;
				//System.out.println(genre);
			}
				
			if (type.equals("Journal"))
			{
				//System.out.print("Topic: ");
				String topic = file.nextLine();
				LibraryItem j = new JournalArticle(id,title,stock,author,topic);
				array[i] = j;
				//System.out.println(topic);
			}
			
			if (type.equals("CD"))
			{
				//System.out.print("Genre: ");
				String genre = file.nextLine();
				//System.out.println(genre);
				//System.out.print("Run time: ");
				int runTime = file.nextInt();
				LibraryItem c = new cd(id,title,stock,runTime,author,genre);
				array[i] = c;
				//System.out.println(pages);
				file.nextLine();
			}
			
		}
		/*for (LibraryItem i: array)
		{
			System.out.println(i.toString());
			System.out.println();
		}*/
		return array;
	}
	
	public String getInputFileName()
	{
		return inputFile;
	}
	
	public void setInputFileName(String newIFN)
	{
		inputFile = newIFN;
	}
	
	public String toString()
	{
		return "The name of the input file is " + inputFile;
	}
	
	
	
	

}

