import java.awt.Point;
import java.io.File;

import javafx.scene.image.Image;

public class Window extends Obstacle
{
    public Window()
    {
    	super();
    	obstacle = new ObstacleData("TestWindow", new Image(new File("textures/error1.png").toURI().toString(), 1600, 900, false, false), new Point(0, 0));
    }
}