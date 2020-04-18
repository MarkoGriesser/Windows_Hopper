import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public abstract class Obstacle
{
	protected Image obstacle;
	
	public abstract Image getImg();
	
	public abstract ImageView getObstacleIV();
}