import java.awt.event.KeyEvent;

import javafx.scene.shape.Rectangle;

public class Player
{
	private static Rectangle player = new Rectangle(30, 803, 65, 65);
	
	public static Rectangle getPlayer()
	{
		return player;
	}
	
	public static void movement(KeyEvent event)
	{
		char ch = event.getKeyChar();
		
		System.out.println(ch);
	}
}