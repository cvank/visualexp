/**
 * 
 */
package com.ww.visualexp.entity;

import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author chandrashekarv
 *
 */
@Document(collection = "usergroup")
public class UserGroup {

	@Id
	private String id;

	private String name;

	private Set<User> users;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

	public String getId() {
		return id;
	}

}
