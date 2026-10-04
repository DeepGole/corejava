import java.util.*;
public class First{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.print("Enter number :" );
		a = sc.nextInt();
		
		System.out.println("Given number :" +a);
		
		String b = Integer.toBinaryString(a);
		String c = Integer.toOctalString(a);
		String d = Integer.toHexString(a);
		
		System.out.println("Binary equivalent: " +b);
		System.out.println("Octal equivalent: " +c);
		System.out.println("Hexadecimal Equivalent:" +d);
	}
}