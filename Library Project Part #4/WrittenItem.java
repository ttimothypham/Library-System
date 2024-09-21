// Name: Timothy Pham
// Period: 2nd

public class WrittenItem extends LibraryItem {
	
	private String author;
	
	public WrittenItem(int id, String titl, boolean stock, String a)
	{
		super(id,titl,stock);
		author = a;
	}
	
	public WrittenItem()
	{
		super();
		author = "Hajime Isayama";
	}
	
	public String getAuthor()
	{
		return author;
	}
	
	public void setAuthor(String newAuthor)
	{
		author = newAuthor;
	}
	
	public String toString()
	{
		if (super.isInStock() == true)
		{
			return super.getTitle() + "(" + super.getId() + ") " + " by " + author + " is currently in stock.";
		}
		else 
		{
			return super.getTitle() + "(" + super.getId() + ") " + " by " + author + " is currently not in stock.";
		}
	}

}

