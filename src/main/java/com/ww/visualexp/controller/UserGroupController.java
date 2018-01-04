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
import com.ww.visualexp.entity.UserGroup;
import com.ww.visualexp.service.GroupService;
import com.ww.visualexp.service.UserService;

/**
 * @author chandrashekarv
 *
 */
@RestController
@RequestMapping("/groups")
@CrossOrigin("*")
public class UserGroupController {


	@Autowired
	GroupService groupService;
	
	/**
	 * Populate landign page.
	 * 
	 * @return
	 */
	@RequestMapping("/all")
	public List<UserGroup> loadAllUsers() {
		return groupService.allGroups();
	}
	
	@RequestMapping("/add")
	public VisualExpResponse addUserGroup(@RequestBody UserRequest userRequest) {

		return null;
	}

	@RequestMapping("/remove")
	public VisualExpResponse removeUserGroup(@RequestBody UserRequest userRequest) {

		return null;
	}

	@RequestMapping("/modify")
	public VisualExpResponse modifyUserGroup(@RequestBody UserRequest userRequest) {

		return null;
	}
}
