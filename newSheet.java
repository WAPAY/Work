package xmlTest;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.channels.SelectableChannel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.*;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;
import util.JDBCUtil;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;


public class newSheet {
	 public static void main(String[] args) throws RowsExceededException, WriteException, IOException, SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException{
		 
		Connection connect = JDBCUtil.getConnection();
		Statement stmt = connect.createStatement();
		
		int row = 1;
		WritableWorkbook workbook = Workbook.createWorkbook(new File("/testSheet.xsl"));
		WritableSheet sheet = workbook.createSheet("sheet1", 0);
		sheet.addCell(new Label(1,0,"案由代码"));
		sheet.addCell(new Label(2,0,"法条名称"));
		sheet.addCell(new Label(3,0,"法条频次"));
		
		String sql="select distinct AYCJ,YJAYMC,YJAYDM,EJAYMC,EJAYDM,SJAYMC,SJAYDM,SiJAYMC,SiJAYDM,FLYJ,(select count(*) from AYFT as a where a.FLYJ=b.FLYJ) from AYFT as b";
		ResultSet resultSet = stmt.executeQuery(sql);
		while(resultSet.next()){
		     String aycj = resultSet.getString(1); //案由层级
		     String aymc ;                         //案由名称
		     String flyj = resultSet.getString(10); //法律依据
		     String flpc = resultSet.getString(11); //法律频次
		     switch(aycj){//获取案由名称
		        case "1":aymc = resultSet.getString(2);break;
		        case "2":aymc = resultSet.getString(4);break;
		        case "3":aymc = resultSet.getString(6);break;
		        case "4":aymc = resultSet.getString(8);break;
		        default: aymc = "";
		     }
		     //输出成表
		        Label label1 = new Label(1, row, aymc);
				Label label2 = new Label(2, row, flyj);
				Label label3 = new Label(3, row, flpc);
				System.out.println(row);
				sheet.addCell(label1);
				sheet.addCell(label2);
				sheet.addCell(label3);			
				row++;	
		}
		resultSet.close();
		stmt.close();
		connect.close();
		workbook.write();
		workbook.close();
		
    }
}
