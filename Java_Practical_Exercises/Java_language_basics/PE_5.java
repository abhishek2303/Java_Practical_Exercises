import java.util.Scanner;

class PE_5 {
    public static void main(String[] args) {

	String[] arr;
	Scanner sc = new Scanner(System.in);

	int sum = 0;

	while(sc.hasNext()){
	    int a = Integer.parseInt(sc.next());
	    if(a < 0) {
		System.out.println("Error");
		sc.close();
		return ;
	    }
	    sum += a;

	}

	System.out.println(sum);
    }

}
