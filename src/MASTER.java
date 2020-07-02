import java.io.File;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class Master extends Application
{
	private Group root;
	private Scene game;
	private Player p;
	private LevelData ld;
	private Engine engine;
	private boolean first;
	
	public Master()
	{
		root = new Group();
		game = new Scene(root);
		p = new Player();
		ld = new LevelData(p);
		engine = new Engine(p, ld);
		first = true;
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
		
		ld.setName("Level1");
		ld.setBackground(new Background(new Image(new File("textures_all/WindowsAlt.jpeg").toURI().toString())));
		ld.setTaskbar(new TaskBar(new Image(new File("textures_all/taskbar.png").toURI().toString())));
		ld.setObs(new Icon(new Image(new File("textures_all/pp.png").toURI().toString())));
		
		engine.start();
		
		ld.resetImg();
		ld.drawPlayer();
		
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
                    		p.setImg(new Image(new File("textures_all/bluejayFL.png").toURI().toString()));
                    		ld.resetImg();
                    		p.moveLeft();
                    		ld.drawPlayer();
                    	}
                    break;
                    
                    case D:
                    	if(p.posX < ld.canvas.getWidth() - p.getImg().getWidth())
                    	{
                    		p.setImg(new Image(new File("textures_all/bluejayFR.png").toURI().toString()));
                    		ld.resetImg();
                    		p.moveRight();
                    		ld.drawPlayer();
                    	}
                    break;
                    
                    case ESCAPE:
                    	if(first)
                    	{
                    		ld.gc.setFill(Color.BLACK);
                        	ld.gc.fillRect(0, 0, 1600, 900);
                    		ld.drawPauseMenu();
                        	first = false;
                    	}
                    	else
                    	{
                    		ld.resetImg();
                    		ld.drawPlayer();
                    		first = true;
                    	}
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
		stage.show();
	}
}