/**
 * 
 */
package com.ww.visualexp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ww.visualexp.entity.Transaction;
import com.ww.visualexp.repository.TransactionRepository;

/**
 * @author chandrashekarv
 *
 */
@Service
public class TransactionService {


	@Autowired
	TransactionRepository transactionRepository;
	
	public List<Transaction> allTransactions() {
		return transactionRepository.findAll();
	}
}
