package com.yapikredi.dp.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Role implements Cloneable{
	private List<String> access;
	private String abc;
	private String xyz;
	
	private List<String> histories = new ArrayList<>();
	
	public List<String> getAccess() {
		return access;
	}
	public void setAccess(List<String> access) {
		this.access = access;
	}
	public List<String> getHistories() {
		return histories;
	}
	public void setHistories(List<String> histories) {
		this.histories = histories;
	}
	public String getAbc() {
		return abc;
	}
	public void setAbc(String abc) {
		this.abc = abc;
	}
	public String getXyz() {
		return xyz;
	}
	public void setXyz(String xyz) {
		this.xyz = xyz;
	}
	
	@Override
	protected Role clone() throws CloneNotSupportedException {
		Role role = new Role();
		role.setAccess(access);
		role.setAbc(abc);
		role.setXyz(xyz);
		return role;
	}
	
	
}
