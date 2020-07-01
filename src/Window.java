import javafx.scene.image.Image;

public class Window extends Obstacle
{
	public Image window;
	
    public Window(Image window)
    {
    	super();
    	this.window = window;
    }
    
	public Image getImg()
	{
		return window;
		
	}
}