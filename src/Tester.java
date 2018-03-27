public class Tester {
  public static void main (String args[]) {
	  //Create subject or object of interest
	  Subject newsFeed = new NewsFeed();
	  
	  //Create a couple of observers
	  
	  Subscriber subscriber1 = new Subscriber("Subscriber 1", newsFeed);
	  Subscriber subscriber2 = new Subscriber("Subscriber 2", newsFeed);
	  
	  newsFeed.setState("News Flash 1");
	  newsFeed.setState("News Flash 2");
	  
  }
}