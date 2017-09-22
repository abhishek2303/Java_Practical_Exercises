
class PE2 {
    public static void main(String[] args) {
	System.out.println(powerOf4(2));
    }

    public static boolean powerOf4(int n) {
	int num = n;
	
	while(num > 0) {
	    if (num < 4){
		if(num == 1) return true;
		else return false;
	    }
	    num /= 4;
	}
	return false;

    }
}
