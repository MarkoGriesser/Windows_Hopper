import java.io.File;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class TaskBar extends Obstacle
{
	protected ImageView obstacleIV;
	
    public TaskBar(String url)
    {
    	super();
    	obstacle = new Image(new File(url).toURI().toString(), 1600, 820, false, false);
    	obstacleIV = new ImageView(obstacle);
    }
    
    public Image getImg()
    {
    	return obstacle;
    }

	@Override
	public ImageView getObstacleIV()
	{
		return obstacleIV;
	}
}