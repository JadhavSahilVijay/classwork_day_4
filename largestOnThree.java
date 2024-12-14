package classwork_day_4;

import java.util.Scanner;

public class largestOnThree {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Number");
		int First = sc.nextInt();
		
		System.out.println("Enter Second Number");
		int Second = sc.nextInt();
		
		System.out.println("Enter Third Number");
		int Third = sc.nextInt();
		
		if(First >= Second && First >= Third) {
			System.out.println(First+"is greater than "+Second+" and "+Third);
		}else if(Second >= First && Second >= Third) {
			System.out.println(Second+"is greater than "+First+" and "+Third);
		}else {
			System.out.println(Third+"is greater than "+First+" and "+Second);
		}
	}
}
