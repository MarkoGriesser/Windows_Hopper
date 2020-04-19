import java.awt.Point;
import java.io.File;

import javafx.scene.image.Image;

public class Icon extends Obstacle
{
    public Icon()
    {
    	super();
    	obstacle = new ObstacleData("TestIcon", new Image(new File("textures/pw.png").toURI().toString(), 70, 70, false, false), new Point(200, 200));
    }
}