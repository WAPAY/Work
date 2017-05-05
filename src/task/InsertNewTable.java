package task;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import LawStandard.EditDistance;
import model.Ayft;
import util.JDBCUtil;


public class InsertNewTable {
	public static void main(String[] args) throws Exception {
		
		Connection connection = JDBCUtil.getConnection();
		Statement statement = connection.createStatement();
		
		Connection connection1 = JDBCUtil.getConnection();
		PreparedStatement pstmt=connection1.prepareStatement("insert into AYFT(WS_ID,WSAH,AJLB,AYCJ,YJAYMC,YJAYDM,EJAYMC,EJAYDM,SJAYMC,SJAYDM,SiJAYMC,SiJAYDM,FLYJ) values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
		
		String sql = "select * from WSXXB";
		ResultSet resultSet = statement.executeQuery(sql);
		
		List<Ayft> ayftList = new ArrayList<>(); 
		int count=0;
		
		while(resultSet.next())
		{	
			
			String AJLB = resultSet.getString("AJLB");
			
			if(AJLB!=null && (AJLB.contains("刑事") ||AJLB.contains("民事")) )
			{
				int WS_ID = resultSet.getInt("WS_ID");
				
				String WSAH = resultSet.getString("WSAH");
				if(WSAH==null){
					WSAH="";
				}
				
				int AYCJ = resultSet.getInt("AYCJ");

				String YJAYMC = resultSet.getString("YJAYMC");
				if(YJAYMC==null){
					YJAYMC="";
				}
			
				String YJAYDM = resultSet.getString("YJAYDM");
				if(YJAYDM==null){
					YJAYDM="";
				}
				
				String EJAYMC = resultSet.getString("EJAYMC");
				if(EJAYMC==null){
					EJAYMC="";
				}
			
				String EJAYDM = resultSet.getString("EJAYDM");
				if(EJAYDM==null){
					EJAYDM="";
				}
				
				String SJAYMC = resultSet.getString("SJAYMC");
				if(SJAYMC==null){
					SJAYMC="";
				}
				
				String SJAYDM = resultSet.getString("SJAYDM");
				if(SJAYDM==null){
					SJAYDM="";
				}
				
				String SiJAYMC = resultSet.getString("SiJAYMC");
				if(SiJAYMC==null){
					SiJAYMC="";
				}
				
				String SiJAYDM = resultSet.getString("SiJAYDM");
				if(SiJAYDM==null){
					SiJAYDM="";
				}
			
				String FLYJ = resultSet.getString("FLYJ");
				List<String> list = EditDistance.whole_laws(FLYJ);
				if(list==null){
					continue;
				}
				
				for(String temp:list)
				{	
					Ayft ayft = new Ayft();
					ayft.setWsid(WS_ID);
					ayft.setWsah(WSAH);
					ayft.setAjlb(AJLB);
					ayft.setAycj(AYCJ);
					ayft.setYjaymc(YJAYMC);
					ayft.setYjaydm(YJAYDM);
					ayft.setEjaymc(EJAYMC);
					ayft.setEjaydm(EJAYDM);
					ayft.setSjaymc(SJAYMC);
					ayft.setSjaydm(SJAYDM);
					ayft.setSijaymc(SiJAYMC);
					ayft.setSijaydm(SiJAYDM);
					ayft.setFlyj(temp);
					
					ayftList.add(ayft);
					count++;
					
				}
				
				if(count > 100)
				{
					for(Ayft temp : ayftList)
					{
						pstmt.setInt(1, temp.getWsid());
						System.out.println("旧表ID："+temp.getWsid());
						pstmt.setString(2, temp.getWsah());
						pstmt.setString(3,temp.getAjlb());
						System.out.println("案件类别："+temp.getAjlb());
						pstmt.setInt(4, temp.getAycj());
						pstmt.setString(5, temp.getYjaymc());
						pstmt.setString(6, temp.getYjaydm());
						pstmt.setString(7, temp.getEjaymc());
						pstmt.setString(8, temp.getEjaydm());
						pstmt.setString(9, temp.getSjaymc());
						pstmt.setString(10, temp.getSjaydm());
						pstmt.setString(11, temp.getSijaymc());
						pstmt.setString(12, temp.getSijaydm());
						pstmt.setString(13, temp.getFlyj());
						
						try{
							pstmt.executeUpdate();
						}catch(Exception e)
						{
							e.printStackTrace();
							continue;
						}
						
						
					}
					ayftList.clear();
					count=0;
				}
			}
			
		}
		resultSet.close();
		statement.close();
		pstmt.close();
		connection.close();
		connection1.close();
	}

}
