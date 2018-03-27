public abstract class Observer {
  protected NewsFeed newsFeed = new NewsFeed();
  public abstract void update();
}