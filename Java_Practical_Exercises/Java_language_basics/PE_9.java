import java.util.Scanner;

class PE_9 {
    public static void main(String[] args) {
	String input = new Scanner(System.in).next();
	String reversed = "";

	for(int i = input.length()-1; i != -1; i--) {
	    reversed += input.charAt(i);
	}

	System.out.println(reversed);
    }

}
