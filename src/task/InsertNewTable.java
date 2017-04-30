package task;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import LawStandard.EditDistance;
import util.JDBCUtil;


public class InsertNewTable {
	public static void main(String[] args) throws Exception {
		
		Connection connection = JDBCUtil.getConnection();
		Statement statement = connection.createStatement();
		
		Connection connection1 = JDBCUtil.getConnection();
		PreparedStatement pstmt=connection1.prepareStatement("insert into AYFT(WS_ID,WSAH,AJLB,AYCJ,YJAYMC,YJAYDM,EJAYMC,EJAYDM,SJAYMC,SJAYDM,SiJAYMC,SiJAYDM,FLYJ) values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
		
		String sql = "select * from WSXXB";
		ResultSet resultSet = statement.executeQuery(sql);
		while(resultSet.next())
		{	
			
			String AJLB = resultSet.getString("AJLB");
			System.out.println("案件类别："+AJLB);
			if(AJLB!=null && (AJLB.contains("刑事") ||AJLB.contains("民事")) )
			{
				int WS_ID = resultSet.getInt("WS_ID");
				System.out.println("旧表ID："+WS_ID);
				pstmt.setInt(1, WS_ID);
				String WSAH = resultSet.getString("WSAH");
				if(WSAH==null){
					WSAH="";
				}
				pstmt.setString(2, WSAH);
				pstmt.setString(3,AJLB);
				int AYCJ = resultSet.getInt("AYCJ");
				pstmt.setInt(4, AYCJ);
				String YJAYMC = resultSet.getString("YJAYMC");
				if(YJAYMC==null){
					YJAYMC="";
				}
				pstmt.setString(5, YJAYMC);
				String YJAYDM = resultSet.getString("YJAYDM");
				if(YJAYDM==null){
					YJAYDM="";
				}
				pstmt.setString(6, YJAYDM);
				String EJAYMC = resultSet.getString("EJAYMC");
				if(EJAYMC==null){
					EJAYMC="";
				}
				pstmt.setString(7, EJAYMC);
				String EJAYDM = resultSet.getString("EJAYDM");
				if(EJAYDM==null){
					EJAYDM="";
				}
				pstmt.setString(8, EJAYDM);
				String SJAYMC = resultSet.getString("SJAYMC");
				if(SJAYMC==null){
					SJAYMC="";
				}
				pstmt.setString(9, SJAYMC);
				String SJAYDM = resultSet.getString("SJAYDM");
				if(SJAYDM==null){
					SJAYDM="";
				}
				pstmt.setString(10, SJAYDM);
				String SiJAYMC = resultSet.getString("SiJAYMC");
				if(SiJAYMC==null){
					SiJAYMC="";
				}
				pstmt.setString(11, SiJAYMC);
				String SiJAYDM = resultSet.getString("SiJAYDM");
				if(SiJAYDM==null){
					SiJAYDM="";
				}
				pstmt.setString(12, SiJAYDM);
				String FLYJ = resultSet.getString("FLYJ");
				List<String> list = EditDistance.whole_laws(FLYJ);
				if(list==null){
					continue;
				}
				for(String temp:list)
				{	
					pstmt.setString(13, temp);
					pstmt.executeUpdate();
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
