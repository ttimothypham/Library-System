// Name: Timothy Pham
// Period: 2nd

public class LibraryItem {
	
	private int id;
	private String title;
	private boolean inStock;
	
	public LibraryItem (int identity, String titleName, boolean stock)
	{
		id = identity;
		title = titleName;
		inStock = stock;
	}
	
	public LibraryItem()
	{
		id = 000001;
		title = "Attack On Titan";
		inStock = true;
	}
	
	public int getId()
	{
		return id;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public boolean isInStock()
	{
		return inStock;
	}
	
	public void checkOutItem()
	{
		inStock = false;
	}
	
	public void returnItem()
	{
		inStock = true;
	}
	
	public void setId(int num)
	{
		id = num;
	}
	
	public void setTitle(String newTitle)
	{
		title = newTitle;
	}
	
	public String toString()
	{
		if (inStock == true)
		{
			return title + "(" + id + ") " + " is currently in stock.";
		}
		else
		{
			return title + "(" + id + ") " + " is currently not in stock.";
		}
	}

}

