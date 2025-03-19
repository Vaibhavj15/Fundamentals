package javatopics;

import java.util.Scanner;

public class Ifelse {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("number :");
		int num=sc.nextInt();
		if (num%2==0)
			System.out.print(num+"is even.");
		else
			System.out.print(num+"is odd.");
	}
}