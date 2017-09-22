
public class PE7 {

    public static void main(String[] args){
	listFactorials();
    }

    public static void listFactorials() {
	int fact = 1;
	int iter = 1;
	while(true) {
	    printMessage(fact, iter);
	    iter++;
	    if(!multiplicationSanityCheck(fact, iter)){
		System.out.println("The factorial of " + iter + " is out of range");
		break;
	    }
	    fact *= iter;
	}
    }

    public static boolean multiplicationSanityCheck(int num, int i) {
	return Integer.MAX_VALUE/i >= num;
    }

    public static void printMessage(int num, int i) {
	System.out.println("The factorial of " + i + " is " + num);
    }
}
