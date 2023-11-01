package org.testing;

import java.util.Map;
import java.util.TreeMap;

public class MapTask1 {
	public static void main(String[] args) {
	
		Map m = new TreeMap();
		m.put('!', 10);
		m.put('@', 20);
		m.put('#', 30);
		m.put('$', 40);
		m.put('%', 50);
		m.put('^', 60);
		m.put('&', 10);
		m.put('*', 50);
		m.put('(', 409);
		
		System.out.println("Keys : "+m.keySet());
		
	}
}
