/**
 * 
 */
package com.ww.visualexp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ww.visualexp.repository.SampleDataRepo;

/**
 * @author chandrashekarv
 *
 */
@Service
public class SmapleMongoDataService {

	@Autowired
	SampleDataRepo dataRepoFacade;

	public Object addSampleDataAll() {

		return dataRepoFacade.persist();
	}

	public Object addSampleUsersData() {

		return null;
	}

	public Object addTransactions() {

		return dataRepoFacade.transactions();
	}
	
	public Object addTransactionSources() {
		return dataRepoFacade.transactionSources();
	}

	public Object addSampleGroupsData() {

		return null;
	}
}
