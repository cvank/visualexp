/**
 * 
 */
package com.ww.visualexp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ww.visualexp.entity.UserGroup;
import com.ww.visualexp.repository.UserGroupRepository;

/**
 * @author chandrashekarv
 *
 */
@Service
public class GroupService {

	
	@Autowired
	UserGroupRepository userGroupRepository;
	
	public List<UserGroup> allGroups() {
		return userGroupRepository.findAll();
	}
}
