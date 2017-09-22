import java.util.Scanner;

class PE_7 {
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int[] frequency = new int[10];
	String input = sc.next();
	int sum = 0;
	for(int i = 0; i < input.length(); i++) {
	    frequency[input.charAt(i)-'0']++;
	    sum += input.charAt(i)-'0';
	}

	//reconstruct
	int reconstruct = 0;
	for(int i = 1; i <= 9; i++) {
	    for(int j = 0; j < frequency[i]; j++){
		reconstruct = 10*reconstruct + i;
	    }
	}

	System.out.println(reconstruct);
	System.out.println(sum);
	
    }
}
