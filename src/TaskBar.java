import javafx.scene.image.Image;

public class TaskBar
{
	protected Image taskbar;
	
    public TaskBar(Image taskbar)
    {
    	super();
    	this.taskbar = taskbar;
    }
    
	public Image getImg()
	{
		return taskbar;
	}
}