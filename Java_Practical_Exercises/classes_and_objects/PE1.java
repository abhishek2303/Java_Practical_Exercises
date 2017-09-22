import java.util.Scanner;

class PE1 {
    public static void main(String[] args) {
	System.out.println(reverse("Hello"));
    }

    public static String reverse(String s) {
	String reversed = "";
	for(int i = s.length()-1; i != -1; i--) {
	    reversed += s.charAt(i);
	}
	return reversed;
    }
    
}
