package task;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import util.JDBCUtil;



public class Tongji1 {
    public static void main(String args[]) throws Exception{
    	Connection connect = JDBCUtil.getConnection();
		Statement stmt = connect.createStatement();
		String sql="select AYCJ,YJAYMC,YJAYDM,EJAYMC,EJAYDM,SJAYMC,SJAYDM,SiJAYMC,SiJAYDM,FLYJ,WS_ID from AYFT";
		ResultSet resultSet = stmt.executeQuery(sql);
	     //AYmap
	     Map<String,Map<String,Integer>> YJMP = new HashMap<>();
	     Map<String,Map<String,Integer>> EJMP = new HashMap<>();
	     Map<String,Map<String,Integer>> SJMP = new HashMap<>();
	     Map<String,Map<String,Integer>> SiJMP = new HashMap<>();
	     int count = 0;
	
	     while(resultSet.next()){
			
			 System.out.println(resultSet.getString(11));
		     String aycj = resultSet.getString(1).trim(); 
		     String aymc ="";                       
		     String flyj = resultSet.getString(10).trim(); 
		 
		     switch(aycj){
		        case "1":
		        	aymc = resultSet.getString(2).trim();
		        	if(!aymc.equals("") && aymc!=null)
		        	{
		        		inputMap(aymc,flyj,YJMP);
		        		count++;
		        	}
		        	break;
		        case "2":
		        	aymc = resultSet.getString(4).trim();
		        	if(!aymc.equals("") && aymc!=null)
		        	{
		        		inputMap(aymc,flyj,EJMP);
		        		count++;
		        	}
		        	break;
		        case "3":
		        	aymc = resultSet.getString(6).trim();
		        	if(!aymc.equals("") && aymc!=null)
		        	{
		        		inputMap(aymc,flyj,SJMP);
		        		count++;
		        	}
		        	break;
		        case "4":
		        	aymc = resultSet.getString(8).trim();
		        	if(!aymc.equals("") && aymc!=null)
		        	{
		        		inputMap(aymc,flyj,SiJMP);
		        		count++;
		        	}
		        	break;
		        default: 
		        	break;
		     }	
		     if(count >= 2000000)
		     {
		    	 //存数据
		    	 WriteTxt.write(YJMP, "");
			     WriteTxt.write(EJMP, "");
			     WriteTxt.write(SJMP, "");
			     WriteTxt.write(SiJMP, "");
			     YJMP.clear();
			     EJMP.clear();
			     SJMP.clear();
			     SiJMP.clear();
			 
		     }
		}
		
	     
		resultSet.close();
		stmt.close();
		connect.close();
    }
    public static void inputMap(String aymc,String flyj,Map<String,Map<String,Integer>> AYMP){
	     if(AYMP.containsKey(aymc)){  	    	 
	    		 Map<String,Integer> FTMP1 = AYMP.get(aymc); 
	    		 int pc = 1;
	    		 if(FTMP1.containsKey(flyj)){
	    			  pc = FTMP1.get(flyj)+1;		    			 		    			 		    			 
	    		 }    		     
	    		 AYMP.get(aymc).put(flyj,pc);	    		 
	    	 }
	     
	     else{
	    	 Map<String,Integer> FTMP2 = new HashMap<>();
	    	 FTMP2.put(flyj,1);
	    	 AYMP.put(aymc,FTMP2);
	         }
    }
    
    
}
