import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.*;

public class Parser
{
	public String readFile(File file)
	{
		String returner = "";
		
		try(BufferedReader bf = new BufferedReader(new FileReader(file)))
		{
			StringBuilder sb = new StringBuilder();
			String read = bf.readLine();
			while(read != null)
			{
				sb.append(read);
				sb.append(System.lineSeparator());
				read = bf.readLine();
			}
			returner = sb.toString();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return returner;
	}
}