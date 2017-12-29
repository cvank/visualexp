/**
 * 
 */
package com.ww.visualexp.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author chandrashekarv
 *
 */
@Document(collection = "income-type")
public class IncomeType {

	@Id
	private String id;

	private String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getId() {
		return id;
	}

}
