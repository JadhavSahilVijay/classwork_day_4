package classwork_day_4;

import java.util.Scanner;

public class switchCase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the First Number : ");
		int First = sc.nextInt();
		System.out.println("enter the Second Number : ");
		int Second = sc.nextInt();
		System.out.println("enter operator : ");
		String Op = sc.next();
		switch(Op) {
			case "+":
				System.out.println("Addition of "+First+" and "+Second+" is : "+(First+Second));
				break;
			case "-":
				System.out.println("Substraction of "+First+" and "+Second+" is : "+(First-Second));
				break;
			case "*":
				System.out.println("Multiplication of "+First+" and "+Second+" is : "+(First*Second));
				break;
			case "/":
				System.out.println("Division of "+First+" and "+Second+" is : "+(First/Second));
				break;
			case "%":
				System.out.println("Modulus of "+First+" and "+Second+" is : "+(First%Second));
				break;
			default:
				System.out.println("Invalid Operator");
		}
	}
}
