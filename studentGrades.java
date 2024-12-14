package classwork_day_4;
import java.util.Scanner;
public class studentGrades {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter your marks: ");
		int marks = sc.nextInt();
		
		if(marks >= 75 && marks <= 100) {
			System.out.println("Your marks is : "+marks+" your achive A Grade");
		}else if(marks >= 50 && marks <= 74) {
			System.out.println("Your marks is : "+marks+" your achive B Grade");
		}else if(marks >= 25 && marks <= 49) {
			System.out.println("Your marks is : "+marks+" your achive C Grade");
		}else if(marks == 0 && marks <= 24) {
			System.out.println("Your marks is : "+marks+" your achive D Grade");
		}else {
			System.out.println("Your marks is : "+marks+" its invalid marks! please enter valid marks");
		}
	}
}
