import java.io.File;
 
import javafx.scene.image.Image;

public class Background
{
	protected Image background;
	
	public Background()
	{
		background = new Image(new File("textures/WindowsAlt.jpeg").toURI().toString(), 1600, 900, false, false);
	}
}