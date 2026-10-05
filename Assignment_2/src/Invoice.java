

class Test{
	private String partNo;
	private String partDesc;
	private int quantity;
	private double price;
	
	public Test(String partNo, String partDesc, int quantity, double price) {
		this.partNo = partNo;
		this.partDesc = partDesc;
		setQuantity(quantity);
		setPrice(price);
	}
	public void setPartNo(String partNo) {
		this.partNo = partNo;
	}
	public String getPartNo() {
		return partNo;
	}
	public void setPartDesc(String partDesc) {
		this.partDesc = partDesc;		
	}
	public String getPartDesc() {
		return partDesc;
	}
	public void setQuantity(int quantity) {
		if(quantity > 0) {
			this.quantity = quantity;
		}
		else {
			this.quantity = 0;
		}
	}
	public int getQuantity() {
		return quantity;
	}
	public void setPrice(double price) {
		if(price > 0.0) {
			this.price = price;
		}
		else {
			this.price = 0.0;
		}
	}
	public double getPrice() {
		return price;
	}
	public double getIvoice() {
		return quantity * price;
		
	}
}
public class Invoice{
	public static void main(String[] args) {
		
		Test a = new Test( "H12", "Hammer", 5, 6 );
		
		System.out.println("part number is:" +a.getPartNo());
		System.out.println("part description :" +a.getPartDesc());
		System.out.println("part of quantity :" +a.getQuantity());
		System.out.println("part of price :" +a.getPrice());
		
		System.out.println("invoice amount is :" +a.getIvoice());
		
		Test a1 = new Test("S22", "Screw driver", -4, -4);
		
		System.out.println("quantity is:" +a1.getQuantity());
		System.out.println("price is :" +a1.getPrice());
		System.out.println("total amount :" +a1.getIvoice());
	}
}