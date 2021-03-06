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

import com.ww.visualexp.domain.UserRequest;
import com.ww.visualexp.domain.VisualExpResponse;
import com.ww.visualexp.entity.User;
import com.ww.visualexp.service.UserService;

/**
 * @author chandrashekarv
 *
 */
@RestController
@RequestMapping("/users")
@CrossOrigin("*")
public class UserController {

	@Autowired
	UserService userservice;
	
	/**
	 * Populate landign page.
	 * 
	 * @return
	 */
	@RequestMapping("/all")
	public List<User> loadAllUsers() {
		return userservice.allUsers();
	}

	/**
	 * Add users to group.
	 * 
	 * @param userRequest
	 * @return
	 */
	@RequestMapping("/add")
	public VisualExpResponse addUser(@RequestBody UserRequest userRequest) {

		return null;
	}

	/**
	 * Remove user.
	 * 
	 * @param userRequest
	 * @return
	 */
	@RequestMapping("/remove")
	public VisualExpResponse removeUser(@RequestBody UserRequest userRequest) {

		return null;
	}

	/**
	 * Modify existing user.
	 * 
	 * @param userRequest
	 * @return
	 */
	@RequestMapping("/modify")
	public VisualExpResponse modifyUser(@RequestBody UserRequest userRequest) {

		return null;
	}

}
