package task;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;

public class UpdateTxt {
	public static void update(String path) throws Exception
	{
		File file = new File(path);
        if (file.exists()) {
            File[] files = file.listFiles();
            if (files.length == 0) {
                System.out.println("文件夹是空的!");
                return;
            } else {
                for (File file2 : files) {
                    if (file2.isDirectory()) {
                        update(file2.getAbsolutePath());
                    } else {
                    	if(!file2.isHidden())
                    	{
                    		System.out.println(file2.getAbsolutePath());
                    		BufferedReader reader = new BufferedReader(new FileReader(file2));
                        	Map<String, Integer> map = new HashMap<>();
                        	
                        	String line = reader.readLine();
                    		while (line != null) {
                    			String[] temps = line.split("\t");
                    			String fatiao = temps[0];
                    			int pinci =Integer.valueOf(temps[1]) ;
                    			if(map.keySet().contains(fatiao))
                    			{
                    				int old = map.get(fatiao);
                    				old = old + pinci;
                    				map.put(fatiao, old);
                    			}
                    			else{
                    				map.put(fatiao, pinci);
                    			}
                    			line = reader.readLine();
                    		}
                    		reader.close();
                    		
                    		FileWriter fileWriter = new FileWriter(file2.getParentFile().getAbsolutePath()+"/result.txt");
                    		for(String value : map.keySet())
                    		{
                    			fileWriter.write(value+"\t"+map.get(value)+"\r\n");
                    			fileWriter.flush();
                    		}
                    		fileWriter.close();
                    	}
                    	
            	
                    }
                }
            }
        } else {
            System.out.println("文件不存在!");
        }
	}
	public static void main(String[] args) throws Exception {
		
		update("/Users/fengyi/Desktop/5555");
	}
}
