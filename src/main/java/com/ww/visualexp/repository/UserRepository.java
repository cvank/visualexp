/**
 * 
 */
package com.ww.visualexp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ww.visualexp.entity.User;

/**
 * @author chandrashekarv
 *
 */
public interface UserRepository extends MongoRepository<User, String> {

}
