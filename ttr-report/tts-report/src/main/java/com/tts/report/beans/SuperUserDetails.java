package com.sncr.tts.rest.report.beans;

import java.util.List;

public class SuperUserDetails {
	private long superUserId;
	private List<UserMapping> userList;
	/**
	 * @return the superUserId
	 */
	public long getSuperUserId() {
		return superUserId;
	}
	/**
	 * @param superUserId the superUserId to set
	 */
	public void setSuperUserId(long superUserId) {
		this.superUserId = superUserId;
	}
	/**
	 * @return the userList
	 */
	public List<UserMapping> getUserList() {
		return userList;
	}
	/**
	 * @param userList the userList to set
	 */
	public void setUserList(List<UserMapping> userList) {
		this.userList = userList;
	}
	
}
