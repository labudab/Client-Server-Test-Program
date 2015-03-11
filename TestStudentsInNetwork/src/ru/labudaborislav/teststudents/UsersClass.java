package ru.labudaborislav.teststudents;

import java.io.Serializable;
import java.util.ArrayList;

public class UsersClass implements Serializable  {
	
	private String loginreg;
	private String passreg;
	private String grpreg;
	
	public String getLoginreg() {
		return loginreg;
	}
	public void setLoginreg(String loginreg) {
		this.loginreg = loginreg;
	}
	public String getPassreg() {
		return passreg;
	}
	public void setPassreg(String passreg) {
		this.passreg = passreg;
	}
	public String getGrpreg() {
		return grpreg;
	}
	public void setGrpreg(String grpreg) {
		this.grpreg = grpreg;
	}
	
}
