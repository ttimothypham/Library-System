// Name: Timothy Pham
// Period: 2nd

public class cd extends MediaItem {
	
	private String artist;
	private String genre;
	
	public cd (int id, String titl, boolean stock, int rt, String a, String g)
	{
		super(id,titl,stock,rt);
		artist = a;
		genre = g;
	}
	
	public cd()
	{
		super();
		artist = "The Weeknd";
		genre = "Pop";
	}
	
	public String getArtist()
	{
		return artist;
	}
	
	public String getGenre()
	{
		return genre;
	}
	
	public void setArtist(String a)
	{
		artist = a;
	}
	
	public void setGenre(String g)
	{
		genre = g;
	}
	
	public String toString()
	{
		if (super.isInStock() == true)
		{
			return super.getTitle() + "(" + super.getId() + ")" + " by " + artist + " is a " + genre + " music cd with a run time of " + super.getRunTime() + ", and is currently in stock."; 
		}
		else
		{
			return super.getTitle() + "(" + super.getId() + ")" + " by " + artist + " is a " + genre + " music cd with a run time of " + super.getRunTime() + ", and is currently not in stock."; 
		}
	}
	

}

