import java.util.Scanner;

class PE_8 {
    public static void main(String[] args) {

	//first variant of the game
	System.out.println("Input a number");

	Scanner sc = new Scanner(System.in);
	int userIn = Integer.parseInt(sc.next());
	System.out.println("Guess the number!");
	while(true) {
	    int n = Integer.parseInt(userInput(sc));
	    if(n == userIn) {
		System.out.println("You got it!");
		break;
	    }
	    if(userIn > n) System.out.println("The number is bigger. Guess again!");
	    else System.out.println("The number is smaller. Guess again!");
	}


	//other variant of the game
	System.out.println("Think of a number. Don't say it aloud!");
	int lo = 1, hi = 100;
	while(lo <= hi) {
	    int mid = lo + (hi-lo)/2;
	    System.out.println("Is the number " + mid + " ?");
	    boolean response = userResponse(sc);
	    if(response) {
		System.out.println("Number found!");
		break;
	    }

	    System.out.println("Is the number higher than " + mid + " ?");
	    response = userResponse(sc);
	    if(response) {
		lo = mid+1;
	    }
	    else hi = mid-1;
	}
	System.out.println("Please fixate on a number between 1 to 100 next time");
	
    }

    public static boolean userResponse(Scanner sc) {
	return sc.next().equals("y");
    }

    public static String userInput(Scanner sc) {
	return sc.next();
    }

}
