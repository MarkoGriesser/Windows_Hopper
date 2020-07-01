import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

public class LevelData
{
	private String name;
	private TaskBar taskbar;
	private Background background;
	private Player p;
	public GraphicsContext gc;
	public Canvas canvas;
	private Obstacle obs;
	
	public LevelData(Player p)
	{
//		this("default", null, null, null);
		canvas = new Canvas(1600, 900);
		gc = canvas.getGraphicsContext2D();
		this.p = p;
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

	public Obstacle getObs()
	{
		return obs;
	}

	public void setObs(Obstacle obs)
	{
		this.obs = obs;
	}
	
	public void resetImg()
	{
		gc.drawImage(getBackground().getImg(), 0, 0);
		gc.drawImage(getTaskbar().getImg(), 0, canvas.getHeight() - getTaskbar().taskbar.getHeight());
		gc.drawImage(getObs().getImg(), 150, 800);
	}
	
	public void drawPlayer()
	{
		gc.drawImage(p.getImg(), p.posX, p.posY);
//		System.out.println(p.posY);
	}
}