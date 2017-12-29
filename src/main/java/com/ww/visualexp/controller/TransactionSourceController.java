/**
 * 
 */
package com.ww.visualexp.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ww.visualexp.domain.TransactionSource;
import com.ww.visualexp.domain.VisualExpResponse;

/**
 * @author chandrashekarv
 *
 */
@RestController
@RequestMapping("/transaction-source")
public class TransactionSourceController {

	@RequestMapping("/add")
	public VisualExpResponse addIncomeSource(@RequestBody TransactionSource incomeSourceRequest) {

		return null;
	}

	@RequestMapping("/remove")
	public VisualExpResponse removeIncomeSource(@RequestBody TransactionSource incomeSourceRequest) {

		return null;
	}

	@RequestMapping("/modify")
	public VisualExpResponse modifyIncomeSource(@RequestBody TransactionSource incomeSourceRequest) {

		return null;
	}

	/**
	 * Populate Transaction source Page landing details.
	 * 
	 * @param transactionRequest
	 * @return
	 */
	@RequestMapping("/all")
	public Object allTransactionSourceDetails() {

		return null;
	}
}
