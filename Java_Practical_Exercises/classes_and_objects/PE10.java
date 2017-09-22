import java.io.File;
import java.util.HashMap;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

class PE10 {
    public static void main(String[] args) throws IOException {
	File f = new  File("file.txt");
	HashMap<String, Integer> freq = new HashMap<String, Integer>();
	BufferedReader br = new BufferedReader(new FileReader(f));
	
	//String[] textArr = {"I", "am", "a", "boy", "I", "am"};
	ArrayList<String> textArr = readFile(br);
	
	countWordFreq(textArr, freq);
	for(String word : freq.keySet()){
	    System.out.println(word + ": " + freq.get(word));
	}
	System.out.println();
    }

    public static ArrayList<String> readFile(BufferedReader br) throws IOException {
	ArrayList<String> tokens = new ArrayList<String>();
	while(true){
	    String newLine = br.readLine();
	    if(newLine == null) break;
	    for(String token : newLine.split("[ ,.]+")){
		tokens.add(token);
	    }
	}
      	return tokens;
    }

    public static void countWordFreq(ArrayList<String> words, HashMap<String, Integer> freq){
	for(String word: words) {
	    if(freq.containsKey(word)){
		freq.put(word, freq.get(word)+1);
	    } else {
		freq.put(word, 1);
	    }

	}
    }

}
