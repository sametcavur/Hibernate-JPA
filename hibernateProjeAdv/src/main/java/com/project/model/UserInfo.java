package com.project.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@NamedQueries({
	@NamedQuery(name="findUserInfoById" ,query ="SELECT ud FROM UserInfo ud WHERE ud.userInfoId= :userInfoId"),
	@NamedQuery(name="findUserInfos" ,query ="SELECT ud FROM UserInfo ud")
})
public class UserInfo implements Serializable{

	private static final long serialVersionUID = -5706096865261630854L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userInfoId;
	private String name;
	private String surname;
	@Temporal(TemporalType.DATE)
	private Date birthOfDate;
	public UserInfo() {
		// TODO Auto-generated constructor stub
	}
	public UserInfo(String name, String surname, Date birthOfDate) {
		this.name = name;
		this.surname = surname;
		this.birthOfDate = birthOfDate;
	}
	public int getUserInfoId() {
		return userInfoId;
	}
	public void setUserInfoId(int userInfoId) {
		this.userInfoId = userInfoId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public Date getBirthOfDate() {
		return birthOfDate;
	}
	public void setBirthOfDate(Date birthOfDate) {
		this.birthOfDate = birthOfDate;
	}

	@Override
	public String toString() {
		return "UserInfo [userInfoId=" + userInfoId + ", name=" + name + ", surname=" + surname + ", birthOfDate="
				+ birthOfDate +"]";
	}
	
}
