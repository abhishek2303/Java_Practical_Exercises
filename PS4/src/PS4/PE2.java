package PS4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class PE2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input;
		//input = br.readLine();
		input = "one one -one___two,,three,one @three*one?two";
		String[] tokens = splitString(input);
		
		HashMap<String, Integer> freqMap = new HashMap<String, Integer>();
		countFreq(freqMap, tokens);
		printMap(freqMap);
	}
	
	//takes an input string and splits the input depending on the conditions(regex)
	public static String[] splitString(String input) {
		String regex = "[ ,\\.\\*@?_-]+";
		return input.split(regex);
	}
	
	public static void countFreq (Map<String, Integer> freqMap, String[] tokens) {
		
		for(String token: tokens) {
			if(freqMap.get(token) == null) {
				freqMap.put(token, 1);
			} else {
				freqMap.put(token, freqMap.get(token)+1);
			}
		}
		return ;
	}
	
	public static void printMap (Map<String, Integer> freqMap) {
		for(String token: freqMap.keySet()) {
			System.out.println("Frequency of " + token + " is: " + freqMap.get(token));
		}
	}
}