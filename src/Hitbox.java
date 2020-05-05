import javafx.scene.shape.Rectangle;

public class Hitbox
{
	public Hitbox(String type)
	{
		if(type.equals("Icon"))
		{
			Rectangle rec = new Rectangle(65, 65);
		}
		else if(type.equals("Icon"))
		{
			Rectangle rec = new Rectangle(1600, 900);
		}
	}
}
