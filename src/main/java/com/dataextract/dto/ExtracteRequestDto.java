package com.dataextract.dto;

import java.util.Map;

public class ExtracteRequestDto {
	

	private Map<String, String> header;
	private Map<String, Object> body;
	public Map<String, String> getHeader() {
		return header;
	}
	public void setHeader(Map<String, String> header) {
		this.header = header;
	}
	public Map<String, Object> getBody() {
		return body;
	}
	public void setBody(Map<String, Object> body) {
		this.body = body;
	}

 
 
}
