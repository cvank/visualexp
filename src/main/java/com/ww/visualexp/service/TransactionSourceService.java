/**
 * 
 */
package com.ww.visualexp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ww.visualexp.entity.TransactionSource;
import com.ww.visualexp.repository.TransactionSourceRepository;

/**
 * @author chandrashekarv
 *
 */
@Service
public class TransactionSourceService {

	@Autowired
	TransactionSourceRepository transactionSourceRepository;
	
	public List<TransactionSource> allTransactionSources() {
		return transactionSourceRepository.findAll();
	}
}
