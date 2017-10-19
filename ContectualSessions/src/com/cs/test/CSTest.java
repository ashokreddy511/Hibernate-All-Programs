package com.cs.test;

import java.util.HashMap;
import java.util.Map;

public class CSTest {
public static void main(String[] args) {
	Map <String,String> m1=new HashMap<>();
	m1.put("1", "one");
	m1.put("2", "two");
	Map <String,String> m2=new HashMap<>();
	m2.put("1", "two");
	m2.put("3", "three");
	for (String string : m1.keySet()) {
		for (String string1 : m2.keySet()) {
			if (m1.get(string).equals(m2.get(string1))) {
				System.out.println(m1.get(string));
			}
		}
	}
	System.out.println(m1);
	Map<String,String> m3=new HashMap<String, String>();
	m1.forEach((i,j)->{m3.put(j, i);});	
	System.out.println(m3);
	m1.forEach((i,j)->{System.out.print(i+"="+j+"\n");});
}
}
