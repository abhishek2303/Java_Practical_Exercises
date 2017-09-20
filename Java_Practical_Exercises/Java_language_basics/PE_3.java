import java.util.Scanner;
import java.util.Scanner;

class PE_3 {
    public static void main(String[] args){
	String input = new Scanner(System.in).next();

	numberSeen(input, input.length()-1);
    }

    public static boolean numberSeen(String s, int i) {
	if (i < 0) return false;

	char c = s.charAt(i);

	if(!isLetter(c)) {
	    System.out.println("Non letter found at positon " + (i+1));
	    return true;
	}

	if (numberSeen(s, i-1)) return true;
	
	if(isVowel(c)) System.out.println(c + ": Vowel");
	else System.out.println(c + ": Consonant");
	return false;
    }

    public static boolean isLetter(char c){
	return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }

    public static boolean isVowel(char c) {
	return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    }

}
