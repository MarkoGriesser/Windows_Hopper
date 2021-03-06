import java.io.File;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

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
	}
	
	public void drawPlayer()
	{
		gc.drawImage(p.getImg(), p.posX, p.posY);
	}
	
	public void drawPauseMenu()
	{
		gc.drawImage(new Image(new File("textures_all/logo.gif").toURI().toString()), 150, 0);
	}
	
	public void drawMenu()
	{
		gc.drawImage(new Image(new File("textures_all/logo.gif").toURI().toString()), 150, 0);
		gc.drawImage(new Image(new File("textures_all/play.gif").toURI().toString()), 10, 800);
	}
}