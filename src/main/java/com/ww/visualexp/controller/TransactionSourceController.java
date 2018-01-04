/**
 * 
 */
package com.ww.visualexp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ww.visualexp.domain.TransactionSourceRequest;
import com.ww.visualexp.domain.VisualExpResponse;
import com.ww.visualexp.entity.TransactionSource;
import com.ww.visualexp.service.TransactionSourceService;

/**
 * @author chandrashekarv
 *
 */
@RestController
@RequestMapping("/transaction-source")
@CrossOrigin("*")
public class TransactionSourceController {

	@Autowired
	TransactionSourceService transactionSourceService;

	/**
	 * Populate Transaction Page Landing details.
	 * 
	 * @param transactionRequest
	 * @return
	 */
	@RequestMapping("/all")
	public List<TransactionSource> allTrasnactions() {
		return transactionSourceService.allTransactionSources();
	}

	
	@RequestMapping("/add")
	public VisualExpResponse addIncomeSource(@RequestBody TransactionSourceRequest incomeSourceRequest) {

		return null;
	}

	@RequestMapping("/remove")
	public VisualExpResponse removeIncomeSource(@RequestBody TransactionSourceRequest incomeSourceRequest) {

		return null;
	}

	@RequestMapping("/modify")
	public VisualExpResponse modifyIncomeSource(@RequestBody TransactionSourceRequest incomeSourceRequest) {

		return null;
	}

}
