public class LevelData
{
	private String name;
	private TaskBar taskbar;
	private Background background;
	private Icon icon;
	private Window window;
	
	public LevelData()
	{
		this("default", null, null, null, null);
	}
	
	public LevelData(String name, TaskBar taskbar, Background background, Icon icon, Window window)
	{
		this.name = name;
		this.taskbar = taskbar;
		this.background = background;
		this.icon = icon;
		this.window = window;
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

	public Icon getIcon()
	{
		return icon;
	}

	public void setIcon(Icon icon)
	{
		this.icon = icon;
	}

	public Window getWindow()
	{
		return window;
	}

	public void setWindow(Window window)
	{
		this.window = window;
	}
}