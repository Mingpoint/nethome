package org.ml.nethome.back.domain;

import java.io.Serializable;

public class MyTest implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String test;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTest() {
		return test;
	}
	public void setTest(String test) {
		this.test = test;
	}
}
