/**
 * 
 */
package com.ww.visualexp.controller.sample;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ww.visualexp.service.SmapleMongoDataService;

/**
 * @author chandrashekarv
 *
 */
@RestController
@RequestMapping("/mongo/add")
public class SampleMongoDataController {

	@Autowired
	SmapleMongoDataService mongoDataService;

	@GetMapping("/all")
	public Object addSampleDataAll() {
		return mongoDataService.addSampleDataAll();
	}

	@GetMapping("/users")
	public List<Object> addSampleUsersData() {

		return null;
	}

	@GetMapping("/groups")
	public List<Object> addSampleGroupsData() {

		return null;
	}

	@GetMapping("/transactions")
	public Object addSampleTransactionsData() {

		return mongoDataService.addTransactions();
	}

	@GetMapping("/transaction-sources")
	public Object addSampleTransactionSourcesData() {
		return mongoDataService.addTransactionSources();
	}
}
