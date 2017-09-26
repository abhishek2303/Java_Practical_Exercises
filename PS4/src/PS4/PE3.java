package PS4;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

class PE3 {
	public static void main(String[] args) throws IOException {
		String[] arr = {"a","b","c","d","a","c","c"};
		
		Map<String, Boolean> markMap = new HashMap<String, Boolean>();
		
		countFreqAndMark(markMap, arr);
		printMap(markMap);
	}
	
	public static void countFreqAndMark (Map<String, Boolean> markMap, String[] tokens) {
		Map<String, Integer> freqMap = new HashMap<String, Integer>();
		for(String token: tokens) {
			if(!freqMap.containsKey(token)) {
				freqMap.put(token, 1);
				markMap.put(token, false);
			} else {
				int freq = freqMap.get(token);
				if(freq+1 > 1) {
					markMap.put(token, true);
					freqMap.put(token, freq+1);
				}
				else
					freqMap.put(token, freq+1);
			}
			
		}
		return ;
	}
	
	
	//overloaded static method
	public static void printMap (Map<String, Boolean> markMap) {
		for(String token: markMap.keySet()) {
			System.out.println("Frequency of " + token + " is: " + markMap.get(token));
		}
	}
}