/**
 * 
 */
package com.ww.visualexp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ww.visualexp.entity.User;

/**
 * @author chandrashekarv
 *
 */
@RepositoryRestResource
public interface UserRepository extends MongoRepository<User, String> {

}
