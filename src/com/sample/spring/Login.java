package com.sample.spring;

import org.springframework.stereotype.Component;

@Component
public class Login {
private String userName;
private String pwd;
private String gender;
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getPwd() {
	return pwd;
}
public void setPwd(String pwd) {
	this.pwd = pwd;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}

}
