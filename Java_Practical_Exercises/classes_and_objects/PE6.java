import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class PE6 {
    public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	int[] grades;
	//int[] grades = {86, 65, 98, 77};

	try {
	    grades = getUserInputs(br);
	} catch (Exception e) {
	    System.out.println(e);
	    return;
	}

	Stats stats = processData(grades, grades.length);
	printStats(stats);
	
    }

    public static int[] getUserInputs(BufferedReader br) throws Exception {
	System.out.println("Enter the number of students: ");
	int input = validateInput(br.readLine());
	if(input < 0) {
	    System.out.println(input);
	    throw new Exception("Number format invalid");
	}

	int[] grades = new int[input];
	int len = input;

	for(int i = 0; i < len; i++) {
	    System.out.print("Enter grade of student " + (i+1) + ": ");
	    input = validateInput(br.readLine());
	    if(input < 0) {
		throw new Exception("Number format invalid");
	    }
	    grades[i] = input;
	    System.out.println();
	    
	}
	return grades;
	
    }

    public static Stats processData(int[] grades, int n) {
	int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
	double sum = 0;
	for(int i = 0; i < n; i++) {
	    int a = grades[i];
	    sum += (double)a;
	    min = Math.min(min, a);
	    max = Math.max(max, a);
	}
	return new Stats((double)sum / (double)n, min, max);
    }

    public static void printStats(Stats stats) {
	System.out.println("The average is " + stats.av);
	System.out.println("The minimum is " + stats.min);
	System.out.println("The maximum is " + stats.max);
    }

    public static int validateInput(String s) throws IOException{
	String[] strArr = s.split(" ");

	//System.out.println("Printing input after splitting");
	//for(int i = 0; i < strArr.length; i++) System.out.println(strArr[i]+ " ");
	//System.out.println("Length of the split array: " + strArr.length);
	
	if(strArr.length != 1) return -1;

	int num = 0;
	try {
	    num = Integer.parseInt(strArr[0]);
	} catch (Exception e) {
	    return -1;
	}

	if(num < 0){
	    System.out.println("Number cannot be negative");
	    return -1;
	}

	return num;
    }

}

class Stats {
    int min;
    int max;
    double av;

    Stats(double av, int min, int max){
	this.av = av;
	this.min = min;
	this.max = max;
    }
}
