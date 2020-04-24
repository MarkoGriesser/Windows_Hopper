import java.awt.Point;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.json.*;

import javafx.scene.image.Image;
import javafx.util.Pair;

public class Parser
{
	public static JSONObject readFile(File file)
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
		JSONObject json = new JSONObject(returner);
		return json;
	}
	
	public static LevelData getLevelData(JSONObject json, String directory)
	{
		LevelData returner = new LevelData();
		returner.setName(json.getJSONObject("levelInfo").getString("levelName"));
		Image tempImg = new Image(new File(directory + json.getJSONObject("levelInfo").getString("backgroundFile")).toURI().toString());
		returner.setBackground(new Background(tempImg));
		tempImg = new Image(new File(directory + json.getJSONObject("levelInfo").getString("taskbarFile")).toURI().toString());
		returner.setTaskbar(new TaskBar(new ObstacleData("taskbar", tempImg)));
		returner.setObsArr(getObstacle(json, directory));
		
		return returner;
	}
	
	public static Obstacle[] getObstacle(JSONObject jsonObj, String directory)
	{
		JSONArray json = jsonObj.getJSONArray("obstaclePointers");
		ArrayList<ObstacleData> dataArr = new ArrayList<>();
		Map<String, Pair<String, File>> obsMap = mapObstacleTypes(jsonObj.getJSONArray("obstacleIcons"), directory);
		
		ObstacleData currentOD = new ObstacleData();
		String currentId;
		JSONArray currentInnerSpawners;
		for(int i = 0; i < json.length(); i++)
		{
			currentId = json.getJSONObject(i).getString("id");
			currentOD.setName(currentId);
			currentOD.setImg(new Image(obsMap.get(currentId).getValue().toURI().toString()));
			currentInnerSpawners = json.getJSONObject(i).getJSONArray("spawn");
			for(int j = 0; j < currentInnerSpawners.length(); j++) 
			{
				currentOD.setCoords(new Point(currentInnerSpawners.getJSONObject(j).getInt("x"), currentInnerSpawners.getJSONObject(j).getInt("y")));
				ObstacleData temp = new ObstacleData();
				temp.setName(currentOD.getName());
				temp.setImg(currentOD.getImg());
				temp.setCoords(currentOD.getCoords());
				dataArr.add(temp);
			}
		}
		Obstacle[] returner = new Obstacle[dataArr.size()];
		for(int i = 0; i < returner.length; i++)
		{
			if(obsMap.get(dataArr.get(i).getName()).getKey().equals("icon"))
			{
				returner[i] = new Icon(dataArr.get(i));
			}
			else if(obsMap.get(dataArr.get(i).getName()).getKey().equals("window"))
			{
				returner[i] = new Window(dataArr.get(i));
			}
		}
		return returner;
	}
	
	public static Map<String, Pair<String, File>> mapObstacleTypes(JSONArray obstacleIcons, String directory)
	{
		Map<String, Pair<String, File>> map = new HashMap<String, Pair<String, File>>();
		String currentId, currentType, currentFileDirectory;
		JSONObject currentJsonObj;
		for(int i = 0; i<obstacleIcons.length(); i++)
		{
			currentJsonObj = obstacleIcons.getJSONObject(i);
			currentId = currentJsonObj.getString("id");
			currentType = currentJsonObj.getString("type");
			currentFileDirectory = directory + currentJsonObj.getString("file");
			map.put(currentId, new Pair<String, File>(currentType, new File(currentFileDirectory)));
		}
		return map;
	}
}