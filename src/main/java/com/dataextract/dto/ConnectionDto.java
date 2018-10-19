package com.dataextract.dto;

public class ConnectionDto {

	
	String conn_name;
	String conn_type;
	String hostName;
	String port;
	String userName;
	String password;
	String dbName;
	String serviceName;
	int connId;
	
	
	
	
	public int getConnId() {
		return connId;
	}
	public void setConnId(int connId) {
		this.connId = connId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	
	
	
	
	public String getConn_name() {
		return conn_name;
	}
	public void setConn_name(String conn_name) {
		this.conn_name = conn_name;
	}
	public String getConn_type() {
		return conn_type;
	}
	public void setConn_type(String conn_type) {
		this.conn_type = conn_type;
	}
	public String getHostName() {
		return hostName;
	}
	public void setHostName(String hostName) {
		this.hostName = hostName;
	}
	public String getPort() {
		return port;
	}
	public void setPort(String port) {
		this.port = port;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getDbName() {
		return dbName;
	}
	public void setDbName(String dbName) {
		this.dbName = dbName;
	}
}
