// Name: Timothy Pham
// Period: 2nd
import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.PrintWriter; 
public class LibraryIO{
	
	private String inputFile;
	private String outputFile;
	
	public LibraryIO(String i)
	{
		inputFile = i;
		outputFile = i;
	}
	
	public LibraryIO(String i, String o)
	{
		inputFile = i;
		outputFile = o;
	}
	
	public ArrayList<LibraryItem> readInput() throws IOException
	{
		Scanner file = new Scanner(new File(inputFile));
		int size = file.nextInt();
		ArrayList<LibraryItem> list = new ArrayList<LibraryItem>();
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
				LibraryItem libro = new Book(id,title,stock,author,pages,genre);
				list.add(libro);
				//System.out.println(genre);
			}
				
			if (type.equals("Journal"))
			{
				//System.out.print("Topic: ");
				String topic = file.nextLine();
				LibraryItem journal = new JournalArticle(id,title,stock,author,topic);
				list.add(journal);
				//System.out.println(topic);
			}
			
			if (type.equals("CD"))
			{
				//System.out.print("Genre: ");
				String genre = file.nextLine();
				//System.out.println(genre);
				//System.out.print("Run time: ");
				int runTime = file.nextInt();
				LibraryItem disc = new cd(id,title,stock,runTime,author,genre);
				list.add(disc);
				file.nextLine();
			}
			
		}
		//System.out.println(list);
		/*for (int i = 0; i < list.size(); i++)
		{
			System.out.println(list.get(i));
			System.out.println();
		}*/
		return list;
	}
	
	public String getInputFileName()
	{
		return inputFile;
	}
	
	public void setInputFileName(String newIFN)
	{
		inputFile = newIFN;
	}
	
	public String getOutputFileName()
	{
		return outputFile;
	}
	
	public void setOutputFileName(String newOFN)
	{
		outputFile = newOFN;
	}
	
	public void writeOutput(ArrayList<LibraryItem> list) throws IOException
	{
		PrintWriter outFile = new PrintWriter(new File(outputFile));
		for (int i = 0; i < list.size(); i++)
		{
			if (list.get(i) instanceof Book == true);
			{
				Book b = (Book)(list.get(i));
				outFile.println(b.getId());
				outFile.println(b.getTitle());
				outFile.println(b.isInStock());
				outFile.println(b.getAuthor());
				outFile.println(b.getPages());
				outFile.println(b.getGenre());
			}
			if (list.get(i) instanceof JournalArticle == true);
			{
				JournalArticle j = (JournalArticle)(list.get(i));
				outFile.println(j.getId());
				outFile.println(j.getTitle());
				outFile.println(j.isInStock());
				outFile.println(j.getAuthor());
				outFile.println(j.getTopic());
			}
			if (list.get(i) instanceof cd == true);
			{
				cd c = (cd)(list.get(i));
				outFile.println(c.getId());
				outFile.println(c.getTitle());
				outFile.println(c.isInStock());
				outFile.println(c.getRunTime());
				outFile.println(c.getArtist());
				outFile.println(c.getGenre());
			}
		}
		outFile.close();
	}
	
	public String toString()
	{
		return "The name of the input file is " + inputFile + " and the name of the output file is " + outputFile;
	}
	
	
	
	

}

