package de.demo.collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class TestMap2 {

	public static void main(String[] args) {
		
		Map<String, String> map = new LinkedHashMap<>();
		
		map.put("John","Teacher");
		map.put("Jane","Docter");
		map.put("John","Singer");
		map.put("Jane","Actress");
		
		System.out.println(map);
				
	}
}
