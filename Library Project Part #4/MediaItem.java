// Name: Timothy Pham
// Period: 2nd

public class MediaItem extends LibraryItem {
	
	private int runTime;
	
	public MediaItem (int id, String titl, boolean stock, int rt)
	{
		super(id,titl,stock);
		runTime = rt;
	}
	
	public MediaItem()
	{
		super();
		runTime = 120;
	}
	
	public int getRunTime()
	{
		return runTime;
	}
	
	public void setRunTime(int newRt)
	{
		runTime = newRt;
	}
	
	public String toString()
	{
		if (super.isInStock() == true)
		{
			return super.getTitle() + "(" + super.getId() + ")" + " is a media item with a run time of " + runTime + ", and is currently in stock.";
		}
		else
		{
			return super.getTitle() + "(" + super.getId() + ")" + " is a media item with a run time of " + runTime + ", and is currently not in stock.";
		}
	}
	

}

