import java.util.LinkedList;

public class NewsFeed extends Subject {

	LinkedList<String> newsItems = new LinkedList<String>();
	
	@Override
	public void setState(String news) {
		newsItems.add(news);
		notifyObservers();
		

	}

	@Override
	public String getState() {
		return newsItems.getLast();
	}

}
