/**
 * 
 */
package com.ww.visualexp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ww.visualexp.domain.TransactionRequest;
import com.ww.visualexp.domain.VisualExpResponse;

/**
 * @author chandrashekarv
 *
 */
@Controller
@RequestMapping("/transaction")
public class TransactionController {

	/**
	 * Populate Transaction Page Landing details.
	 * 
	 * @param transactionRequest
	 * @return
	 */
	@RequestMapping("/")
	public Object allTrasnactions(@RequestBody TransactionRequest transactionRequest) {

		return null;
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
