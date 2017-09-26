package PS4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

class PE5 {
	public static void main(String[] args) throws Exception {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String input;
		Map<String, String> map = new TreeMap<String, String>();
		map.put("val1", "java");
		map.put("val2", "c++");
		
		printMap(map);
		
		process(map);
		
		printMap(map);
	}
	
	public static void process(Map<String, String> map) throws Exception {
		if(map.size() != 2) throw new Exception("Please keep the map with 2 keys");
		if(map.get("val1") != null || map.get("val1") != "") {
			map.put("val2", map.get("val1"));
			map.put("val1", "");
		}
	}
	
	public static void printMap(Map<String, String> map) {
		for(String key: map.keySet()) {
			System.out.println(key + " " + map.get(key));
		}
	}
}