package task;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.*;
import util.JDBCUtil;

public class GetData {
	public static List<Ayft>  getData(String anyoumingcheng, int limit) throws Exception
	{
		List<Ayft> result = new ArrayList<>();
		Connection connection = JDBCUtil.getConnection();
		PreparedStatement pStatement  = connection.prepareStatement("select top ? * from AYFT where YJAYMC=? or EJAYMC=? or SJAYMC=? or SiJAYMC=?");
		pStatement.setInt(1, limit);
		pStatement.setString(2, anyoumingcheng);
		pStatement.setString(3, anyoumingcheng);
		pStatement.setString(4, anyoumingcheng);
		pStatement.setString(5, anyoumingcheng);
		ResultSet resultSet = pStatement.executeQuery();
		while(resultSet.next())
		{
			Ayft temp = new Ayft();
			temp.setId(resultSet.getInt(1));
			temp.setWsid(resultSet.getInt(2));
			temp.setWsah(resultSet.getString(3));
			temp.setAjlb(resultSet.getString(4));
			temp.setAycj(resultSet.getInt(5));
			temp.setYjaymc(resultSet.getString(6));
			temp.setYjaydm(resultSet.getString(7));
			temp.setEjaymc(resultSet.getString(8));
			temp.setEjaydm(resultSet.getString(9));
			temp.setSjaymc(resultSet.getString(10));
			temp.setSjaydm(resultSet.getString(11));
			temp.setSijaymc(resultSet.getString(12));
			temp.setSijaydm(resultSet.getString(13));
			temp.setFlyj(resultSet.getString(14));
			result.add(temp);
		}
		resultSet.close();
		pStatement.close();
		connection.close();
		return result;
	}
	
	public static List<Ayft>  getData(String anyoumingcheng) throws Exception
	{
		List<Ayft> result = new ArrayList<>();
		Connection connection = JDBCUtil.getConnection();
		PreparedStatement pStatement  = connection.prepareStatement("select * from AYFT where YJAYMC=? or EJAYMC=? or SJAYMC=? or SiJAYMC=?");
		
		pStatement.setString(1, anyoumingcheng);
		pStatement.setString(2, anyoumingcheng);
		pStatement.setString(3, anyoumingcheng);
		pStatement.setString(4, anyoumingcheng);
		ResultSet resultSet = pStatement.executeQuery();
		while(resultSet.next())
		{
			Ayft temp = new Ayft();
			temp.setId(resultSet.getInt(1));
			temp.setWsid(resultSet.getInt(2));
			temp.setWsah(resultSet.getString(3));
			temp.setAjlb(resultSet.getString(4));
			temp.setAycj(resultSet.getInt(5));
			temp.setYjaymc(resultSet.getString(6));
			temp.setYjaydm(resultSet.getString(7));
			temp.setEjaymc(resultSet.getString(8));
			temp.setEjaydm(resultSet.getString(9));
			temp.setSjaymc(resultSet.getString(10));
			temp.setSjaydm(resultSet.getString(11));
			temp.setSijaymc(resultSet.getString(12));
			temp.setSijaydm(resultSet.getString(13));
			temp.setFlyj(resultSet.getString(14));
			result.add(temp);
		}
		resultSet.close();
		pStatement.close();
		connection.close();
		return result;
	}

}
