import java.util.Scanner;

class PE_1 {
    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	int input = sc.nextInt();
	String palindromeMessage = "not",
	    evenMessage = "";
	if(isPalindrome(input)) {
	    palindromeMessage = "";
	    if(!sumGreaterThan25(input)){
		evenMessage = "and sum of even numbers is less than 25";
	    }
	    else{
		evenMessage = "and sum of even numbers is greater than 25";
	    }
	}
	
	String message = "";

	message = " is " + palindromeMessage +
	    " a palindrome " + evenMessage;
	
	System.out.println(input + message);
    }

    private static boolean isPalindrome(int input){
	int num = input;
	int reverted = 0;
	while(num > 0){
	    reverted = 10*reverted + num%10;
	    num /= 10;
	}
	return input == reverted;
    }

    public static boolean sumGreaterThan25(int input){
	int sum = 0;
	int digit = input%10;
	while(input > 0){
	    if(digit % 2 == 0){
		sum += digit;
	    }
	    input /= 10;
	    digit %= 10;
	}
	return sum > 25;
    }
}
