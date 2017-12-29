/**
 * 
 */
package com.ww.visualexp.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ww.visualexp.domain.UserRequest;
import com.ww.visualexp.domain.VisualExpResponse;

/**
 * @author chandrashekarv
 *
 */
@RestController
@RequestMapping("/users")
public class UserController {

	/**
	 * Populate landign page.
	 * 
	 * @return
	 */
	@RequestMapping("/")
	public Object loadAllUsers() {

		return null;
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

	@RequestMapping("/group/add")
	public VisualExpResponse addUserGroup(@RequestBody UserRequest userRequest) {

		return null;
	}

	@RequestMapping("/group/remove")
	public VisualExpResponse removeUserGroup(@RequestBody UserRequest userRequest) {

		return null;
	}

	@RequestMapping("/group/modify")
	public VisualExpResponse modifyUserGroup(@RequestBody UserRequest userRequest) {

		return null;
	}
}
