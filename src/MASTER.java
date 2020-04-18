import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class MASTER extends Application
{
	protected GridPane gp;
	protected Scene scene;
	
	public Icon obs;
	public Level level1;
	
	public MASTER()
	{
		gp = new GridPane();
		scene = new Scene(gp, 1600, 900);
		obs = new Icon("textures/pw.png");
		level1 = new Level("textures/WindowsAlt.jpeg", "textures/taskbar.png");
		
	}
	
	public static void main(String[] args)
	{
		launch();
	}

	@Override
	public void start(Stage s) throws Exception
	{
		gp.getChildren().add(level1.background.getBackgroundIV());
		gp.getChildren().add(level1.taskBar.getObstacleIV());
		gp.getChildren().add(obs.getObstacleIV());
		
	    s.setMaxWidth(1600);
	    s.setMaxHeight(900);
		
		s.setScene(scene);
	    s.show();
	}
}
