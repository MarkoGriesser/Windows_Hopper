import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

public class LevelBuilder
{
	public static Canvas buildLevel(LevelData level, ObstacleData[] obs)
	{
		double width = level.getBackground().background.getWidth();
		double height = level.getBackground().background.getHeight();
		
		Canvas canvas = new Canvas(width, height);
		GraphicsContext gc = canvas.getGraphicsContext2D();
		gc.drawImage(level.getBackground().background, 0, 0);
		gc.drawImage(level.getTaskbar().obstacle.getImg(), 0, height - level.getTaskbar().obstacle.getImg().getHeight());
		for(ObstacleData e : obs)
		{
			gc.drawImage(e.getImg(), e.getCoords().getX(), e.getCoords().getY());
		}
		return canvas;
	}
}