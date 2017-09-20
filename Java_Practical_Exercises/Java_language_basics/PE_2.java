import java.util.Scanner;

class PE_2{

    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		//if((input&1) == 0){
		//	if(isBetween(20, 30, input)) System.out.println("Tom");
		//} else {
		//	if(isBetween(20, 30, input)) System.out.println("Jerry");
		//}

		if(isBetween(20, 30, input)) {
			if((input&1) == 0) System.out.println("Tom");
			else System.out.println("Jerry");
		}
    }

    public static boolean isBetween(int lo, int hi, int input){
	return input > lo && input < hi;
    }
}
