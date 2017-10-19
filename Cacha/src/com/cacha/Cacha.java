package com.cacha;

import java.util.HashMap;
import java.util.Map;

public class Cacha {
	Map<Class, Map<Object, Object>> metaData = null;

	public Cacha() {
		metaData = new HashMap<Class, Map<Object, Object>>();
	}

	public void put(Class zlass,String key, Object value){
		Map<Object, Object> entityData=null;
		if(metaData.containsKey(zlass)==true){	
			entityData=metaData.get(zlass);			
		}else{
			entityData=new HashMap<Object,Object>();
		}
		entityData.put(key, value);
	}

	public Object get(Class zlass) {
		Map<Object, Object> entityData=null;
		if (metaData.containsKey(zlass) == true) {
			entityData = metaData.get(zlass);
			if (entityData.containsKey(key)) {
				return entityData.get(key);
			}
		}
		return null;
	}

	public Object containkey(Class zlass) {
		Map<Object, Object> entityData=null;
		if (metaData.containsKey(zlass) == true) {
			entityData = metaData.get(zlass);
			if (entityData.containsKey(key)) {
				return true;
			}
		}
		return false;
	}
}
