import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

public class LevelBuilder
{
	public static Canvas buildLevel(LevelData levelData, ObstacleData[] obs)
	{
		double width = levelData.getBackground().background.getWidth();
		double height = levelData.getBackground().background.getHeight();
		
		Canvas canvas = new Canvas(width, height);
		GraphicsContext gc = canvas.getGraphicsContext2D();
		gc.drawImage(levelData.getBackground().background, 0, 0);
		gc.drawImage(levelData.getTaskbar().obstacle.getImg(), 0, height - levelData.getTaskbar().obstacle.getImg().getHeight());
		for(ObstacleData e : obs)
		{
			gc.drawImage(e.getImg(), e.getCoords().getX(), e.getCoords().getY());
		}
		return canvas;
	}
}