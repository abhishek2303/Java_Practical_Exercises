import java.util.Scanner;

class PE_10 {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String inpStr = sc.next();
	int n = Integer.parseInt(sc.next());
	String message = inpStr;
	String lastn = inpStr.substring(inpStr.length()-n, inpStr.length());

	for(int i = 0; i < n; i++) {
	    message += lastn;
	}

	System.out.println(message);
    }
}
