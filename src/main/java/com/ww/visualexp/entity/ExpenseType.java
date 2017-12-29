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
@Document(collection = "expense-type")
public class ExpenseType {

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
