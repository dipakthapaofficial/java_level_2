package com.codeinteracts.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {

public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Hari");
		map.put(10, "Geeta");
		map.put(3, "Ram");
		
		System.out.println(map);
		
		Set<Integer> keys = map.keySet();
		
		//Looping in keys of map
		for(Integer key: map.keySet() ) {
			System.out.println("key:"+key);
			
//			System.out.println(map.get(key));
		}
		
		for(String value: map.values()) {
			System.out.println(value);
		}
		
		for(Map.Entry<Integer, String> val: map.entrySet()) {
			System.out.println(val.getKey());
			System.out.println(val.getValue());	
		}
		
		
		Map<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(5, "Hari");
//		map1.put(7, "Geeta");
		
		
		map.putAll(map1);
		System.out.println(map);
		
		
		map.putIfAbsent(7, "Shyam");
		System.out.println(map);
		
		map.replace(7, "Geeta");
		System.out.println(map);
		
//		map.clear();
//		map.remove(7);
//		System.out.println(map);
		
		System.out.println(map.isEmpty());
		
		
		for(Map.Entry<Integer, String> keyVal: map.entrySet()) {
			if (keyVal.getValue().equals("Geeta")) {
				System.out.println("Key ::"+keyVal.getKey());
			}
			
		}
		
//		map.put(null, null);
		
		System.out.println(map);
		
		
//		Map<Integer, String> treeMap = new TreeMap<Integer, String>(map);
//		
//		Collections.sort(treeMap, new Comparator<Map<Integer, String>>() {
//
//			@Override
//			public int compare(Map<Integer, String> o1, Map<Integer, String> o2) {
//				
//				for (String val: o1.values())
//				
//				if (o1.values() > o2.values()) {
//					return 1;
//				}
//				return 0;
//			}
//			
//		});
		
		
		System.out.println(map);
		
	
		
		
		Map<String, String> country = new HashMap<String, String>();
		
		country.put("Kathmandu", "Nepal");
		country.put("Delhi", "India");
		country.put("Dhaka", "Bangladesh");
		country.put(null, null);
		country.put("Somewhere", null);
		country.put("Somewhere1", null);
		country.putIfAbsent("Kathmandu", "New Planet");
		
		
		country.put("salary", "100");
		country.put("salary", "1000");
		
		
		for(String key: country.keySet()) {
			System.out.println(key);
			System.out.println(country.get(key));
		}
		
//		for(String value: country.values()) {
//			System.out.println(value);
//		}
		
		for(Map.Entry<String, String> keyVal: country.entrySet()) {
			System.out.println(keyVal.getKey() +"::" + keyVal.getValue());
		}
		
		country.remove(null);
		
		System.out.println(country);
		
		System.out.println(country.containsKey(null));
		System.out.println(country.containsValue(null));

		
		
	}

}
