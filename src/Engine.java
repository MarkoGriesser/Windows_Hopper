public class Engine extends Thread
{
	private LevelData ld;
	private Player p;
	private String direction;
	private boolean isRunning;
	private int currentPosY;

	
	public Engine(Player p, LevelData ld)
	{
		this.ld = ld;
		this.p = p;
		direction = "down";
		isRunning = true;
		currentPosY = p.posY;
	}
	
	public void run()
	{
		int fc = 0;
		
		while(isRunning)
		{
			if(direction == "down")
			{
				if(fc == 900)
				{
					if(p.posY < 800)
					{
						p.moveDown();
						ld.resetImg();
						ld.drawPlayer();
					}
					fc = 0;
				}
				fc++;
				System.out.println(p.posY);
			}
			
			else if(direction == "up")
			{
				if(fc == 900)
				{
					if(p.posY > currentPosY - p.sprunghoehe)
					{
						p.moveUp();
						ld.resetImg();
						ld.drawPlayer();
					}
					else if(p.posY == currentPosY - p.sprunghoehe)
					{
						setDir("down");
					}
					fc = 0;
				}
				fc++;
				System.out.println(p.posY);
			}
		}
}
	
	public void stopp()
	{
		isRunning = false;
	}
	
	public void go()
	{
		isRunning = true;
	}
	
	public String getDir()
	{
		return direction;
	}
	
	public void setDir(String direction)
	{
		this.direction = direction;
	}
}
