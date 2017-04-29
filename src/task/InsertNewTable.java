package task;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import util.JDBCUtil;

/*
 * 插入新数据
 */
public class InsertNewTable {
	public static void main(String[] args) throws Exception {
		Connection connection = JDBCUtil.getConnection();
		Statement statement = connection.createStatement();
		Statement statement1 = connection.createStatement();
		String sql = "select * from WSXXB";
		ResultSet resultSet = statement.executeQuery(sql);
		while(resultSet.next())
		{
			int WS_ID = resultSet.getInt("WS_ID");
			String WSAH = resultSet.getString("WSAH");
			String AJLB = resultSet.getString("AJLB");
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
//			List<String> list = 曾进分法条函数(FLYJ);
//			for(String temp:list)
//			{
//				statement1.executeUpdate("insert into AYFT(WS_ID,WSAH,AJLB,AYCJ,YJAYMC,YJAYDM,EJAYMC,EJAYDM,SJAYMC,SJAYDM,SiJAYMC,SiJAYDM,FLYJ)"
//						+ " values("+WS_ID+",'"+WSAH+"','"+AJLB+"',"+AYCJ+",'"+YJAYMC+"','"+YJAYDM+"','"+EJAYMC+"','"+EJAYDM+"','"+SJAYMC+"','"+SJAYDM+"','"+SiJAYMC+"','"+SiJAYDM+"','"+temp+"'");
//			}
			
		}
		resultSet.close();
		statement.close();
		statement1.close();
		connection.close();
	}

}
