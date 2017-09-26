package PS4;


import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class PE1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		printList(convertIntoArrayList(input));
	}
	
	public static ArrayList<Integer> convertIntoArrayList(String input) {
		String[] intArr = input.split(" ");
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		for(String sInt: intArr) {
			arrList.add(Integer.parseInt(sInt));
		}
		return arrList;
	}
	
	public static void printList(ArrayList<Integer> list) {
		for(Integer i: list) {
			System.out.println(i);
		}
	}
}