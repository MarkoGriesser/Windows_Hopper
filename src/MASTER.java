import java.awt.event.KeyListener;
import java.io.File;

import javax.swing.JTextField;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class Master extends Application
{
<<<<<<< HEAD
	protected Group root;
	protected Scene scene;
	protected Thread thread;
=======
	private Group root;
	private Scene game;
//	private Scene menu;
	private Player p;
	private LevelData ld;
	private Engine engine;
>>>>>>> Dev
	
	public Master()
	{
		root = new Group();
		game = new Scene(root);
		p = new Player();
		ld = new LevelData(p);
		engine = new Engine(p, ld);
	}
	
	public static void main(String[] args)
	{
		launch();
	}

	@Override
	public void start(Stage stage) throws Exception
	{
		stage.setOnCloseRequest(new EventHandler<WindowEvent>()
		{
		    @Override
		    public void handle(WindowEvent event)
		    {
		        engine.stopp();
		    }
		});
		
<<<<<<< HEAD
		root.getChildren().add(Player.getPlayer());
		
		stage.setScene(scene);
=======
		ld.setName("Level1");
		ld.setBackground(new Background(new Image(new File("textures_all/WindowsAlt.jpeg").toURI().toString())));
		ld.setTaskbar(new TaskBar(new Image(new File("textures_all/taskbar.png").toURI().toString())));
		ld.setObs(new Icon(new Image(new File("textures_all/pp.png").toURI().toString())));
		
		engine.start();
		
		ld.resetImg();
		ld.drawPlayer();
		
//		engine.checkKey();
		
		game.setOnKeyPressed(new EventHandler<KeyEvent>()
		{
			@Override
            public void handle(KeyEvent event)
			{
                switch (event.getCode())
                {
                    case A:
                    	if(p.posX > 0)
                    	{
                    		ld.resetImg();
                    		p.moveLeft();
                    		ld.drawPlayer();
                    	}
                    break;
                    
                    case D:
                    	if(p.posX < ld.canvas.getWidth() - p.getImg().getWidth())
                    	{
                    		ld.resetImg();
                    		p.moveRight();
                    		ld.drawPlayer();
                    	}
                    break;
                    
                    case ESCAPE:
                    	ld.setBackground(new Background(new Image(new File("textures_all/Win10.jpeg").toURI().toString())));
                    	ld.gc.drawImage(ld.getBackground().background, 0, 0);
                    	ld.resetImg();
                    	ld.drawPlayer();
                    break;
                    
                    case SPACE:
                    	if(p.posY == 800)
                    		engine.setDir("up");
                    	break;
                    
				default:
					break;
                }
            }
        });
		
		root.getChildren().add(ld.canvas);
		
		stage.setScene(game);
>>>>>>> Dev
		stage.show();
	}
}