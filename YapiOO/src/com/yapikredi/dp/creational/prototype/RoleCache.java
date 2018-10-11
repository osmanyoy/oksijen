package com.yapikredi.dp.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class RoleCache {
	private Map<String, Role> roleMap = new HashMap<>();
	
	public Role getRole(String roleName) throws CloneNotSupportedException {
		Role role = roleMap.get(roleName);
		Role clone = role.clone();
		return clone;
		
	}
}
