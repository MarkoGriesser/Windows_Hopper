import java.io.File;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Icon extends Obstacle
{
	protected ImageView obstacleIV;
	
    public Icon(String url)
    {
    	super();
    	obstacle = new Image(new File(url).toURI().toString(), 200, 200, false, false);
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