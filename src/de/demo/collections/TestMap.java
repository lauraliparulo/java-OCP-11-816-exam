package de.demo.collections;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BinaryOperator;

public class TestMap {

	public static void main(String[] args) {
		Map<String, String> map = new LinkedHashMap<>();
		
		BinaryOperator<String> operator = (s1,s2) -> null;
		
		map.put("John","Teacher");
		
		map.merge("John",  "Doctor",  operator);
		
		
		map.merge("Jane",  "Doctor",  operator);
	
		
		System.out.println(map);
		
		
		
		BinaryOperator<String> operator2 = (s1,s2) -> s1.endsWith("r") ? "ok" : "no";
		
		map.put("John","Teacher");

		map.merge("John",  "Doctor",  operator2);
		map.merge("mike",  "chef",  operator2);
		
		map.merge("Jane",  "Doctor",  operator2);
	
		
		System.out.println(map);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
