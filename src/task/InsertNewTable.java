package task;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import LawStandard.EditDistance;
import util.JDBCUtil;

/*
 * 插入新数据
 */
public class InsertNewTable {
	public static void main(String[] args) throws Exception {
		int count=0;
		Connection connection = JDBCUtil.getConnection();
		Statement statement = connection.createStatement();
		Statement statement1 = connection.createStatement();
		String sql = "select * from WSXXB";
		ResultSet resultSet = statement.executeQuery(sql);
		while(resultSet.next())
		{	
			if(count >= 20)
			{
				break;
			}
			String AJLB = resultSet.getString("AJLB");
			if(AJLB!=null && (AJLB.contains("刑事") ||AJLB.contains("民事")) )
			{
				int WS_ID = resultSet.getInt("WS_ID");
				String WSAH = resultSet.getString("WSAH");
				int AYCJ = resultSet.getInt("AYCJ");
				String YJAYMC = resultSet.getString("YJAYMC");
				String YJAYDM = resultSet.getString("YJAYDM");
				String EJAYMC = resultSet.getString("EJAYMC");
				String EJAYDM = resultSet.getString("EJAYDM");
				String SJAYMC = resultSet.getString("SJAYMC");
				String SJAYDM = resultSet.getString("SJAYDM");
				String SiJAYMC = resultSet.getString("SiJAYMC");
				String SiJAYDM = resultSet.getString("SiJAYDM");
				String FLYJ = resultSet.getString("FLYJ");
				List<String> list = EditDistance.whole_laws(FLYJ);
				for(String temp:list)
				{
					statement1.executeUpdate("insert into AYFT(WS_ID,WSAH,AJLB,AYCJ,YJAYMC,YJAYDM,EJAYMC,EJAYDM,SJAYMC,SJAYDM,SiJAYMC,SiJAYDM,FLYJ)"
							+ " values("+WS_ID+",'"+WSAH+"','"+AJLB+"',"+AYCJ+",'"+YJAYMC+"','"+YJAYDM+"','"+EJAYMC+"','"+EJAYDM+"','"+SJAYMC+"','"+SJAYDM+"','"+SiJAYMC+"','"+SiJAYDM+"','"+temp+"'");
					count++;
				}
			}
			
			
		}
		resultSet.close();
		statement.close();
		statement1.close();
		connection.close();
	}

}
