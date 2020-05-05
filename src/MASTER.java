import java.io.File;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MASTER extends Application
{
	protected Group root;
	protected Scene scene;
	
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
		
		System.out.println(Parser.readFile(new File("leveldata/winxp_1/winxp_1.level")));
		
//		Level level1 = new Level(Parser.getLevelData(Parser.readFile(new File("leveldata/win10_1/win10_1.level")), "leveldata/win10_1/"));
//		ObstacleData[] obsDataArr1 = new ObstacleData[level1.level.getObsArr().length];
//		for(int i = 0; i < obsDataArr1.length; i++)
//		{
//			obsDataArr1[i] = level1.level.getObsArr()[i].obstacle;
//		}
//		root.getChildren().add(LevelBuilder.buildLevel(level1.level, obsDataArr1));
		
		stage.setScene(scene);
		stage.show();
	}
}