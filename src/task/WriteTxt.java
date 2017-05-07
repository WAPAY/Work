package task;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.xml.crypto.Data;

public class WriteTxt {  
	public static void write(Map<String,Map<String,Integer>> map,String destination) throws Exception
	{
		for (Map.Entry<String, Map<String, Integer>> entry1 : map.entrySet())
		{
			String anyoumingcheng = entry1.getKey();
			if (anyoumingcheng == null || anyoumingcheng.equals("")) {
				continue;
			}
			//目录名
			File dir = new File(destination + "/" + anyoumingcheng);
			if (!dir.exists()) {
				dir.mkdirs();
			}
			//文件名
			String txtname = anyoumingcheng + ".txt";
			File file = new File(destination + "/" + anyoumingcheng+"/"+txtname);
			if(!file.exists())
			{
				file.createNewFile();
			}
			
			FileWriter fileWriter = new FileWriter(file, true);
			System.out.println(file.getAbsolutePath());
			for (Map.Entry<String, Integer> entry2 : entry1.getValue().entrySet()) {
				System.out.println(entry2.getKey() + " " + entry2.getValue());
				fileWriter.write(entry2.getKey() + "\t" + entry2.getValue() + "\r\n");
				fileWriter.flush();
			}
			fileWriter.close();
		 }
	}
	public static void main(String[] args) throws Exception {
		Map<String,Map<String,Integer>> map  = new HashMap<>();
		Map<String, Integer> temp1 = new HashMap<>();
		temp1.put("1条", 1);
		temp1.put("2条", 1);
		temp1.put("3条", 1);
		temp1.put("4条", 1);
		map.put("1案由", temp1);
		
		Map<String, Integer> temp2 = new HashMap<>();
		temp2.put("1条", 1);
		temp2.put("2条", 1);
		temp2.put("3条", 1);
		temp2.put("4条", 1);
		map.put("2案由", temp2);
		
		Map<String, Integer> temp3 = new HashMap<>();
		temp3.put("1条", 1);
		temp3.put("2条", 1);
		temp3.put("3条", 1);
		temp3.put("4条", 1);
		map.put("3案由", temp3);
		
		write(map, "/Users/fengyi/Desktop/5555");
		
				
	}

}
