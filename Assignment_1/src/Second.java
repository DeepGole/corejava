import java.util.*;
public class Second{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter the value of d1 :");
		
		if(!sc.hasNextDouble()) {
			System.out.println("Number is not double");
			return;
			
		}
		double d1 = sc.nextDouble();
		
		System.out.print("enter the value of d2 :");
		
		if(!sc.hasNextDouble()) {
			System.out.println("Number is not double");
			return;
		}
		double d2 = sc.nextDouble();
		
		System.out.println("average is : "+(d1+d2)/2);
	}
	
}