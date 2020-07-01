import java.io.File; 

import javafx.scene.image.Image;

public class Player
{
	private Image img;
	public int sprunghoehe;
	public int posX;
	public int posY;
	
	public Player()
	{
		img = new Image(new File("textures_all/bluejay.png").toURI().toString());
		posX = 0;
		posY = 800;
		sprunghoehe = 150;
	}
	
	public Image getImg()
	{
		return img;
	}
	
	public void setImg(Image img)
	{
		this.img = img;
	}
	
	public void moveRight()
	{
		posX = this.posX + 10;
	}
	
	public void moveLeft()
	{
		posX = this.posX - 10;
	}
	
	public void moveDown()
	{
		posY = this.posY + 1;
	}
	
	public void moveUp()
	{
		posY = this.posY - 1;
	}
}	