import java.io.File;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Window extends Obstacle
{
	protected ImageView obstacleIV;
	
    public Window(String url)
    {
    	super();
    	obstacle = new Image(new File(url).toURI().toString(), 1600, 900, false, false);
    	obstacleIV = new ImageView(obstacle);
    }
    
    public Image getImg()
    {
    	return obstacle;
    }

	public ImageView getObstacleIV()
	{
		return obstacleIV;
	}
}