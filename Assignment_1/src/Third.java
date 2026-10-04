import java.util.*;

public class Third{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double totalBill = 0.0;
		int choice ;
		
		
		while(true) {
			System.out.println("===========Menu=========");
			System.out.println("1. Dosa = 50rs");
			System.out.println("2. idli = 30rs");
			System.out.println("3. Samosa = 25rs ");
			System.out.println("4. kachori = 25rs");
			System.out.println("5. palakwada = 25rs");
			System.out.println("6. Tea = 6rs");
			System.out.println("7. Coffee = 30rs");
			System.out.println("8. Egg = 20rs");
			System.out.println("9. oats = 25rs");
			
			System.out.println("enter your choice :");
			choice = sc.nextInt();
			
			if (choice == 10) {
				break;
			}
			
			System.out.println("enter quantity :");
			int quantity = sc.nextInt();
			
			switch(choice) {
			case 1:
				totalBill += 50 * quantity;
				break;
			case 2:
				totalBill += 30 * quantity;
				break;
			case 3:
				totalBill += 25 * quantity;
				break;
			case 4:
				totalBill += 25 * quantity;
				break;
			case 5:
				totalBill += 25 * quantity;
				break;
			case 6:
				totalBill += 6 * quantity;
				break;
			case 7:
				totalBill += 30 * quantity;
				break;
			case 8:
				totalBill += 20 * quantity;
				break;
			case 9:
				totalBill += 25 * quantity;
				break;
				
			default: System.out.println("Invalid item choice!");
			}
			
		}
		System.out.println("\n--- FINAL BILL ---");
        System.out.println("Total Amount: ₹" + totalBill);
        System.out.println("Thank you!");
	}
}