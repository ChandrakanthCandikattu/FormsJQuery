package com.financesystem.api;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "simpleValue")
public class SimplePOJO implements Serializable {

	
	
	
	
	/**
	 * @param field1
	 * @param field2
	 */
	public SimplePOJO(String field1, String field2) {
		super();
		this.field1 = field1;
		this.field2 = field2;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SimplePOJO() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the field1
	 */
	public String getField1() {
		return field1;
	}

	/**
	 * @param field1
	 *            the field1 to set
	 */
	public void setField1(String field1) {
		this.field1 = field1;
	}

	/**
	 * @return the field2
	 */
	public String getField2() {
		return field2;
	}

	/**
	 * @param field2
	 *            the field2 to set
	 */
	public void setField2(String field2) {
		this.field2 = field2;
	}

	private String field1;
	private String field2;

}
