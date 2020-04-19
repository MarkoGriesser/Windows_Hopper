public class Level
{
	protected LevelData level;
	
	public Level()
	{
		level = new LevelData("TestLevel", new TaskBar(), new Background(), new Icon(), new Window());
	}
	
	public LevelData getLevel()
	{
		return level;
	}
}