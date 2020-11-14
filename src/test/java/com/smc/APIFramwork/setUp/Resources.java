package com.smc.APIFramwork.setUp;

import java.util.HashMap;

public class Resources extends BaseTest{
	
	public HashMap<Object, Object> createUser()
	{	
	HashMap<Object ,Object> map=new HashMap();
	map.put("email", "Gouri@gmail.com");
	map.put("firstName", "Gouri");	  
	map.put("id",9);	
	map.put("lastName", "Gouri");		
	return map;
	}

}
