/**
 * 
 */
package com.ww.visualexp.entity;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author chandrashekarv
 *
 */
@Document(collection = "transactions")
public class Transaction {

	@Id
	private String transactionId;

	private Date date;

	private String userId;

	private double amount;

	private String type;

	/**
	 * Transaction source.
	 */
	private String sourceId;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSourceId() {
		return sourceId;
	}

	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

	public String getTransactionId() {
		return transactionId;
	}

}
