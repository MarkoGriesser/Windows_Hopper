import java.awt.Point;

import javafx.scene.image.Image;

public class ObstacleData
{
	private String name;
	private Image img;
	private Point coords;
	
	public ObstacleData()
	{
		this("default", null);
	}
	
	public ObstacleData(String name, Image img)
	{
		this(name, img, null);
	}

	public ObstacleData(String name, Image img, Point coords)
	{
		this.name = name;
		this.img = img;
		this.coords = coords;
	}

	public Image getImg()
	{
		return img;
	}

	public void setImg(Image img)
	{
		this.img = img;
	}

	public Point getCoords()
	{
		return coords;
	}

	public void setCoords(Point coords)
	{
		this.coords = coords;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
}