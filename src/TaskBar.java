import java.awt.Point;
import java.io.File;

import javafx.scene.image.Image;

public class TaskBar extends Obstacle
{
    public TaskBar()
    {
    	super();
    	obstacle = new ObstacleData("taskbar", new Image(new File("textures/taskBar.png").toURI().toString()), new Point(0, 900));
    }
}