// Name: Timothy Pham
// Period: 2nd

public class Book extends WrittenItem {
	
	private int pages;
	private String genre;
	
	public Book(int id, String titl, boolean stock, String a, int p, String g)
	{
		super(id,titl,stock,a);
		pages = p;
		genre = g;
	}
	
	public Book()
	{
		super();
		pages = 5000;
		genre = "Anime";
		
	}
	
	public String getGenre()
	{
		return genre;
	}
	
	public int getPages()
	{
		return pages;
	}
	
	public void setGenre(String newG)
	{
		genre = newG;
	}
	
	public void setPages(int newP)
	{
		pages = newP;
	}
	
	public String toString()
	{
		if (super.isInStock() == true)
		{
			return super.getTitle() + "(" + super.getId() + ") " + " by " + super.getAuthor() + " is a " + genre + " book with " + pages + " pages and is currently in stock.";
		}
		else
		{
			return super.getTitle() + "(" + super.getId() + ") " + " by " + super.getAuthor() + " is a " + genre + " book with " + pages + " pages and is currently not in stock.";
		}
	}

}

