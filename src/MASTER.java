import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class MASTER extends Application
{
	protected Group root;
	protected Scene scene;
	public static Parser parser;
	
	public MASTER()
	{
		root = new Group();
		scene = new Scene(root);
//		obs = new Icon("textures/pw.png");
//		level1 = new Level("textures/WindowsAlt.jpeg", "textures/taskbar.png");
	}
	
	public static void main(String[] args)
	{
//		parser = new Parser();
//		System.out.println(parser.readFile(new File("leveldata/win10/win10.level")));
		launch();
	}

	@Override
	public void start(Stage stage) throws Exception
	{
		Level level0 = new Level();
		Icon obs = new Icon();
		Obstacle[] obsArr = {obs};
		ArrayList<ObstacleData> arrList = new ArrayList<>();
		Arrays.asList(obsArr).forEach((elem) -> {
			arrList.add(elem.obstacle);
		});
		
		root.getChildren().add(LevelBuilder.buildLevel(level0.level, arrList.toArray(new ObstacleData[arrList.size()])));
		
		stage.setScene(scene);
		stage.show();
	}
}