/**
 * 
 */
package com.ww.visualexp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ww.visualexp.entity.User;
import com.ww.visualexp.repository.UserRepository;

/**
 * @author chandrashekarv
 *
 */
@Service
public class UserService {

	@Autowired
	UserRepository userRepository;

	public List<User> allUsers() {
		return userRepository.findAll();
	}

}
