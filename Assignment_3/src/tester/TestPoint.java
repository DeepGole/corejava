package tester;
import com.app.geometry.*;
import java.util.*;

public class TestPoint {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the value of p1 :");
		double x1 = sc.nextDouble();
		System.out.println("enter the value of p2 :");
		double x2 = sc.nextDouble();
		
		System.out.println("enter the value of p1 :");
		double x3 = sc.nextDouble();
		System.out.println("enter the value of p2 :");
		double x4 = sc.nextDouble();
		
		Point2D p1 = new Point2D(x1, x2);
		Point2D p2 = new Point2D(x3, x4);
		
		
		System.out.println("p1:" +p1.getDetails());
		System.out.println("p2:" +p2.getDetails());
		
		if(p1.isEqual(p2)) {
			System.out.println("p1 & p2 are located at the same position ");
		} else {
			System.out.println("points are in different positio. ");
			System.out.println("Distance between two points are : " +p1.calculateDistance(p2));
		}

     
	}
}
