 import java.io.File;
 
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Background
{
	protected Image background;
	protected ImageView backgroundIV;
	
	public Background(String url)
	{
		background = new Image(new File(url).toURI().toString(), 1600, 900, false, false);
		backgroundIV = new ImageView(background);
	}
	
	public Image getImg()
	{
		return background;
	}
	
	public ImageView getBackgroundIV()
	{
		return backgroundIV;
	}
}