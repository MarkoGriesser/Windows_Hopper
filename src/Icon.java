import javafx.scene.image.Image;

public class Icon extends Obstacle
{
	protected Image icon;
	
    public Icon(Image icon)
    {
    	super();
    	this.icon = icon;
    }
    
	public Image getImg()
	{
		return icon;
	}
}