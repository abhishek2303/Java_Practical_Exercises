import java.util.Scanner;

class PE_6 {
    public static void main(String[] args) {
	String s = new Scanner(System.in).next();
	char c = s.charAt(0);
	if(isNumber(c)) System.out.println("Is number");
	else if(isLetter(c)) System.out.println("Is alphabet");
	else System.out.println("Is symbol");
    }

    public static boolean isNumber(char c){
	return c >= '0' && c <= '9';
    }

    public static boolean isLetter(char c) {
	return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }

}
