import java.util.Scanner;

class PE_5 {
    public static void main(String[] args) {

	String[] arr;
	Scanner sc = new Scanner(System.in);

	int sum = 0;
	boolean end = false;

	while(sc.hasNext()){
	    String next = sc.next();
	    if(next.equals("exit")) end = true;
	    if(end) break;
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
