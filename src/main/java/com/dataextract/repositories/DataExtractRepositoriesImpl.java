/**
 * 
 */
package com.dataextract.repositories;

import java.io.IOException;
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.dataextract.constants.MySQLConstants;
import com.dataextract.constants.OracleConstants;
import com.dataextract.dao.IExtractionDAO;
import com.dataextract.dto.DataExtractDto;
import com.dataextract.dto.RealTimeExtractDto;
import com.dataextract.dto.SrcSysDto;
import com.dataextract.dto.TableInfoDto;
import com.dataextract.dto.TargetDto;
import com.dataextract.fetchdata.ExtractJava;
import com.dataextract.util.ConnectionUtils;
import com.dataextract.dto.BatchExtractDto;
import com.dataextract.dto.ConnectionDto;

/**
 * @author sivakumar.r14
 *
 */
@Repository
public class DataExtractRepositoriesImpl implements DataExtractRepositories {
	
	
	@Autowired
	IExtractionDAO extractionDao;
	//public IExtractionDAO iExtractionDAO;
	
	@Autowired
	ExtractJava extractJava;

	@Override
	public int addConnectionDetails(ConnectionDto dto) throws SQLException {
		Connection conn=null;
		conn=ConnectionUtils.connectToOracle(OracleConstants.ORACLE_IP_PORT_SID, OracleConstants.ORACLE_USER_NAME, OracleConstants.ORACLE_PASSWORD);
		//conn= ConnectionUtils.connectToMySql(MySQLConstants.MYSQLIP, MySQLConstants.MYSQLPORT, MySQLConstants.DB,MySQLConstants.USER , MySQLConstants.PASSWORD);
		return extractionDao.insertConnectionMetadata(conn,dto);
	}
	
	@Override
	public String updateConnectionDetails(ConnectionDto connDto) throws SQLException{
		Connection conn=null;
		conn=ConnectionUtils.connectToOracle(OracleConstants.ORACLE_IP_PORT_SID, OracleConstants.ORACLE_USER_NAME, OracleConstants.ORACLE_PASSWORD);
		//conn= ConnectionUtils.connectToMySql(MySQLConstants.MYSQLIP, MySQLConstants.MYSQLPORT, MySQLConstants.DB,MySQLConstants.USER , MySQLConstants.PASSWORD);
		return extractionDao.updateConnectionMetadata(conn,connDto);
	}
	
	@Override
	public String deleteConnectionDetails(ConnectionDto connDto) throws SQLException {
		Connection conn=null;
		conn=ConnectionUtils.connectToOracle(OracleConstants.ORACLE_IP_PORT_SID, OracleConstants.ORACLE_USER_NAME, OracleConstants.ORACLE_PASSWORD);
		//conn= ConnectionUtils.connectToMySql(MySQLConstants.MYSQLIP, MySQLConstants.MYSQLPORT, MySQLConstants.DB,MySQLConstants.USER , MySQLConstants.PASSWORD);
		return extractionDao.deleteConnectionMetadata(conn,connDto);
	}
	
	@Override
	public String addTargetDetails(ArrayList<TargetDto> targetArr) throws SQLException {
		
		Connection conn=null;
		conn=ConnectionUtils.connectToOracle(OracleConstants.ORACLE_IP_PORT_SID, OracleConstants.ORACLE_USER_NAME, OracleConstants.ORACLE_PASSWORD);
		//conn= ConnectionUtils.connectToMySql(MySQLConstants.MYSQLIP, MySQLConstants.MYSQLPORT, MySQLConstants.DB,MySQLConstants.USER , MySQLConstants.PASSWORD);
		System.out.println("connection established");
		return extractionDao.insertTargetMetadata(conn,targetArr);
	}
	
	@Override
	public String updateTargetDetails(ArrayList<TargetDto> targetArr) throws SQLException{
		
		Connection conn=null;
		conn=ConnectionUtils.connectToOracle(OracleConstants.ORACLE_IP_PORT_SID, OracleConstants.ORACLE_USER_NAME, OracleConstants.ORACLE_PASSWORD);
		//conn= ConnectionUtils.connectToMySql(MySQLConstants.MYSQLIP, MySQLConstants.MYSQLPORT, MySQLConstants.DB,MySQLConstants.USER , MySQLConstants.PASSWORD);
		return extractionDao.updateTargetMetadata(conn,targetArr);
	}
	
	
	@Override
	public int onboardSystem(SrcSysDto srcSysDto) throws SQLException  {
		Connection conn=null;
		conn=ConnectionUtils.connectToOracle(OracleConstants.ORACLE_IP_PORT_SID, OracleConstants.ORACLE_USER_NAME, OracleConstants.ORACLE_PASSWORD);
		//conn= ConnectionUtils.connectToMySql(MySQLConstants.MYSQLIP, MySQLConstants.MYSQLPORT, MySQLConstants.DB,MySQLConstants.USER , MySQLConstants.PASSWORD);
		return extractionDao.insertSrcSysMetadata(conn, srcSysDto);
		
	}
	
	@Override
	public String updateSystem(SrcSysDto srcSysDto)throws SQLException{
		Connection conn=null;
		conn=ConnectionUtils.connectToOracle(OracleConstants.ORACLE_IP_PORT_SID, OracleConstants.ORACLE_USER_NAME, OracleConstants.ORACLE_PASSWORD);
		//conn= ConnectionUtils.connectToMySql(MySQLConstants.MYSQLIP, MySQLConstants.MYSQLPORT, MySQLConstants.DB,MySQLConstants.USER , MySQLConstants.PASSWORD);
		return extractionDao.updateSrcSysMetadata(conn, srcSysDto);
	}
	
	@Override
	public String deleteSystem(SrcSysDto srcSysDto)throws SQLException {
		Connection conn=null;
		conn=ConnectionUtils.connectToOracle(OracleConstants.ORACLE_IP_PORT_SID, OracleConstants.ORACLE_USER_NAME, OracleConstants.ORACLE_PASSWORD);
		//conn= ConnectionUtils.connectToMySql(MySQLConstants.MYSQLIP, MySQLConstants.MYSQLPORT, MySQLConstants.DB,MySQLConstants.USER , MySQLConstants.PASSWORD);
		return extractionDao.deleteSrcSysMetadata(conn, srcSysDto);
	}
	

	@Override
	public String addTableDetails(TableInfoDto tableInfoDto) throws SQLException  {
		Connection conn=null;
		conn=ConnectionUtils.connectToOracle(OracleConstants.ORACLE_IP_PORT_SID, OracleConstants.ORACLE_USER_NAME, OracleConstants.ORACLE_PASSWORD);
		//conn= ConnectionUtils.connectToMySql(MySQLConstants.MYSQLIP, MySQLConstants.MYSQLPORT, MySQLConstants.DB,MySQLConstants.USER , MySQLConstants.PASSWORD);
		return extractionDao.insertTableMetadata(conn, tableInfoDto);
		
	}
	
	@Override
	public ConnectionDto getConnectionObject(String src_unique_name) throws SQLException {
		Connection conn=null;
		conn=ConnectionUtils.connectToOracle(OracleConstants.ORACLE_IP_PORT_SID, OracleConstants.ORACLE_USER_NAME, OracleConstants.ORACLE_PASSWORD);
		//conn= ConnectionUtils.connectToMySql(MySQLConstants.MYSQLIP, MySQLConstants.MYSQLPORT, MySQLConstants.DB,MySQLConstants.USER , MySQLConstants.PASSWORD);
		return extractionDao.getConnectionObject(conn,src_unique_name);
	}
	
	@Override
	public SrcSysDto getSrcSysObject(String src_unique_name) throws SQLException{
		Connection conn=null;
		conn=ConnectionUtils.connectToOracle(OracleConstants.ORACLE_IP_PORT_SID, OracleConstants.ORACLE_USER_NAME, OracleConstants.ORACLE_PASSWORD);
		//conn= ConnectionUtils.connectToMySql(MySQLConstants.MYSQLIP, MySQLConstants.MYSQLPORT, MySQLConstants.DB,MySQLConstants.USER , MySQLConstants.PASSWORD);
		return extractionDao.getSrcSysObject(conn,src_unique_name);
		
	}
	
	@Override
	public ArrayList<TargetDto> getTargetObject(String targetList) throws SQLException{
		Connection conn=null;
		conn=ConnectionUtils.connectToOracle(OracleConstants.ORACLE_IP_PORT_SID, OracleConstants.ORACLE_USER_NAME, OracleConstants.ORACLE_PASSWORD);
		//conn= ConnectionUtils.connectToMySql(MySQLConstants.MYSQLIP, MySQLConstants.MYSQLPORT, MySQLConstants.DB,MySQLConstants.USER , MySQLConstants.PASSWORD);
		return extractionDao.getTargetObject(conn,targetList);
	}
	
	@Override
	public TableInfoDto getTableInfoObject(String table_list) throws SQLException{
		
		Connection conn=null;
		conn=ConnectionUtils.connectToOracle(OracleConstants.ORACLE_IP_PORT_SID, OracleConstants.ORACLE_USER_NAME, OracleConstants.ORACLE_PASSWORD);
		//conn= ConnectionUtils.connectToMySql(MySQLConstants.MYSQLIP, MySQLConstants.MYSQLPORT, MySQLConstants.DB,MySQLConstants.USER , MySQLConstants.PASSWORD);
		return extractionDao.getTableInfoObject(conn,table_list);
		
	}
	
	@Override
	public String realTimeExtract(RealTimeExtractDto rtExtractDto) throws IOException, SQLException {
		
		return extractionDao.pullData(rtExtractDto); 
	}
	
	@Override
	public String batchExtract(BatchExtractDto batchExtractDto) throws SQLException{
		
		Connection conn=null;
		conn=ConnectionUtils.connectToOracle(OracleConstants.ORACLE_IP_PORT_SID, OracleConstants.ORACLE_USER_NAME, OracleConstants.ORACLE_PASSWORD);
		//conn= ConnectionUtils.connectToMySql(MySQLConstants.MYSQLIP, MySQLConstants.MYSQLPORT, MySQLConstants.DB,MySQLConstants.USER , MySQLConstants.PASSWORD);
		return extractionDao.createDag(conn,batchExtractDto);
	}
	

	@Override
	public String testConnection(ConnectionDto dto) {
		
		String connectionUrl;
		Connection connection=null;
		try {
			if(dto.getConn_type().equalsIgnoreCase("MSSQL")){
				connectionUrl="jdbc:sqlserver://"+dto.getHostName()+":"+dto.getPort()+";DatabaseName="+dto.getDbName();
				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			}
			else if(dto.getConn_type().equalsIgnoreCase("ORACLE"))
			{
				
				Class.forName("oracle.jdbc.driver.OracleDriver");
				connectionUrl="jdbc:oracle:thin:@"+dto.getHostName()+":"+dto.getPort()+"/"+dto.getServiceName()+"";
				System.out.println(connectionUrl);
			}
			else {
				connectionUrl="";
			}
			
			System.out.println("connecting to source Database");
			//Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println(connectionUrl + "   " + dto.getUserName() + "  " +  dto.getPassword());
			 //connection = DriverManager.getConnection(connectionUrl, dto.getUserName(), dto.getPassword());
			 System.out.println("connected to source Database"); 
			return "success";
		} catch (Exception e) {
			e.printStackTrace();
			return "failed due to exception " + e.getMessage();
		}finally{
			try {
				if(connection != null)
					connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	


}
