/**
 * 
 */
package com.ww.visualexp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ww.visualexp.entity.TransactionSource;

/**
 * @author chandrashekarv
 *
 */
@RepositoryRestResource(path="transactionsources")
public interface TransactionSourceRepository extends MongoRepository<TransactionSource, String> {

}
