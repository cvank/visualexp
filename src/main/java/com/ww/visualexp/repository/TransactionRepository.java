/**
 * 
 */
package com.ww.visualexp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ww.visualexp.entity.Transaction;

/**
 * @author chandrashekarv
 *
 */
@RepositoryRestResource
public interface TransactionRepository extends MongoRepository<Transaction, String> {

}
