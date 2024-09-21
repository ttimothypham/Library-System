// Name: Timothy Pham
// Period: 2nd

public class JournalArticle extends WrittenItem {
	
	private String topic;
	
	public JournalArticle(int id, String titl, boolean stock, String a, String t)
	{
		super(id,titl,stock,a);
		topic = t;
	}
	
	public JournalArticle()
	{
		super();
		topic = "Action";
	}
	
	public String getTopic()
	{
		return topic;
	}
	
	public void setTopic(String newT)
	{
		topic = newT;
	}
	
	public String toString()
	{
		if (super.isInStock() == true)
		{
			return super.getTitle() + "(" + super.getId() + ") " + " by " + super.getAuthor() + " is a journal article about " + topic + " and is currently in stock.";
		}
		else 
		{
			return super.getTitle() + "(" + super.getId() + ") " + " by " + super.getAuthor() + " is a journal article about " + topic + " and is currently not in stock.";
		}
	}
	

}

