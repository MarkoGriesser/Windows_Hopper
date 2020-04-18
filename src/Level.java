public class Level
{
	protected Background background;
	protected TaskBar taskBar;
	protected Level level;
	
	public Level(String url1, String url2)
	{
		background = new Background(url1);
		taskBar = new TaskBar(url2);
	}
	
	public Level getLevel()
	{
		return level;
	}
}