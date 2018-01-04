/**
 * 
 */
package com.ww.visualexp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ww.visualexp.domain.TransactionRequest;
import com.ww.visualexp.domain.VisualExpResponse;
import com.ww.visualexp.entity.Transaction;
import com.ww.visualexp.service.TransactionService;

/**
 * @author chandrashekarv
 *
 */
@RestController
@RequestMapping("/transaction")
@CrossOrigin("*")
public class TransactionController {

	@Autowired
	TransactionService transactionService;

	/**
	 * Populate Transaction Page Landing details.
	 * 
	 * @param transactionRequest
	 * @return
	 */
	@RequestMapping("/all")
	public List<Transaction> allTrasnactions() {
		return transactionService.allTransactions();
	}

	@RequestMapping("/add")
	public VisualExpResponse addTransaction(@RequestBody TransactionRequest transactionRequest) {

		return null;
	}

	@RequestMapping("/modify")
	public VisualExpResponse modifyTransaction(@RequestBody TransactionRequest transactionRequest) {

		return null;
	}

	@RequestMapping("/remove")
	public VisualExpResponse removeTransaction(@RequestBody TransactionRequest transactionRequest) {

		return null;
	}

}
