public class LevelData
{
	private String name;
	private TaskBar taskbar;
	private Background background;
	private Obstacle[] obsArr;
	
	public LevelData()
	{
		this("default", null, null, null);
	}
	
	public LevelData(String name, TaskBar taskbar, Background background, Obstacle[] obsArr)
	{
		this.name = name;
		this.taskbar = taskbar;
		this.background = background;
		this.obsArr = obsArr;
		
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public TaskBar getTaskbar()
	{
		return taskbar;
	}

	public void setTaskbar(TaskBar taskbar)
	{
		this.taskbar = taskbar;
	}

	public Background getBackground()
	{
		return background;
	}

	public void setBackground(Background background)
	{
		this.background = background;
	}

	public Obstacle[] getObsArr()
	{
		return obsArr;
	}

	public void setObsArr(Obstacle[] obsArr)
	{
		this.obsArr = obsArr;
	}
}