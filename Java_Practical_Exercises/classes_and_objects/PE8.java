
public class PE8 {

    public static void main(String[] args){
		longFactorial();
    }

    public static void longFactorial() {
		long fact = 1;
		long iter = 1;
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

    public static boolean multiplicationSanityCheck(long num, long i) {
		return Long.MAX_VALUE/i >= num;
    }

    public static void printMessage(long num, long i) {
		System.out.println("The factorial of " + i + " is " + num);
    }
}
