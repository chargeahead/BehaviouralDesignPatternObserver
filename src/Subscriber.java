public class Subscriber extends Observer {

	private String name;
	
	//Constructor to inject name and the reference to the Subject
	public Subscriber(String name, Subject newsFeed) {
		this.newsFeed = (NewsFeed)newsFeed;
		newsFeed.attach(this);
		this.name = name;
	}
	
	@Override
	public void update() {
		System.out.println("Subscriber "+name+" received new flash "+ newsFeed.getState());

	}

}