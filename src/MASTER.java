import java.awt.event.KeyListener;
import java.io.File;

import javax.swing.JTextField;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MASTER extends Application
{
	protected Group root;
	protected Scene scene;
	protected Thread thread;
	
	public MASTER()
	{
		root = new Group();
		scene = new Scene(root);
	}
	
	public static void main(String[] args)
	{
		launch();
	}

	@Override
	public void start(Stage stage) throws Exception
	{
		Level level0 = new Level(Parser.getLevelData(Parser.readFile(new File("leveldata/winxp_1/winxp_1.level")), "leveldata/winxp_1/"));
		ObstacleData[] obsDataArr = new ObstacleData[level0.level.getObsArr().length];
		for(int i = 0; i < obsDataArr.length; i++)
		{
			obsDataArr[i] = level0.level.getObsArr()[i].obstacle;
		}
		root.getChildren().add(LevelBuilder.buildLevel(level0.level, obsDataArr));
		
		root.getChildren().add(Player.getPlayer());
		
		stage.setScene(scene);
		stage.show();
	}
}