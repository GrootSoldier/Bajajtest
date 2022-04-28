package com.cdac.backend;

import java.util.List;

public class RequestDTO {
	private List<String> data;

	public RequestDTO() {
		super();
	}

	public RequestDTO(List<String> data) {
		super();
		this.data = data;
	}

	public List<String> getData() {
		return data;
	}

	public void setData(List<String> data) {
		this.data = data;
	}

}
