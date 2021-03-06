package com.dataextract.dto;

import java.util.ArrayList;

public class RealTimeExtractDto {
	
	ConnectionDto connDto;
	SrcSysDto srsSysDto;
	TableInfoDto tableInfoDto;
	ArrayList<TargetDto> targetArr;
	
	
	public ArrayList<TargetDto> getTargetArr() {
		return targetArr;
	}
	public void setTargetArr(ArrayList<TargetDto> targetArr) {
		this.targetArr = targetArr;
	}
	public ConnectionDto getConnDto() {
		return connDto;
	}
	public void setConnDto(ConnectionDto connDto) {
		this.connDto = connDto;
	}
	public SrcSysDto getSrsSysDto() {
		return srsSysDto;
	}
	public void setSrsSysDto(SrcSysDto srsSysDto) {
		this.srsSysDto = srsSysDto;
	}
	public TableInfoDto getTableInfoDto() {
		return tableInfoDto;
	}
	public void setTableInfoDto(TableInfoDto tableInfoDto) {
		this.tableInfoDto = tableInfoDto;
	}
	
	

}
