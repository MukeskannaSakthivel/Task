package org.testing;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.Hashtable;

public class MapTask {
	public static void main(String[] args) {

		Map m = new Hashtable();
		m.put("vel", "Selenium");
		m.put("Ganesh", "framework");
		m.put("Dinesh", "oracle");
		m.put("Vengat", "corejava");
		m.put("subash", "jira");
		
		Set keys = m.keySet();
		for(Object key : keys) {
			System.out.println(key +" --> "+m.get(key));
		}
	}
}
