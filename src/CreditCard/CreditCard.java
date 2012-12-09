package CreditCard;
import java.util.Date;

public class CreditCard {
	
	//Instance variables
	private String number;
	private String name;
	private String bank;
	private double balance;
	private int limit;
	private double interest = 0.1;
	private double fee = 20.0;
	
	//Constructor
	public CreditCard (String no, String nm, String bk, double bal, int lim) {
		number = no;
		name = nm;
		bank = bk;
		balance = bal;
		limit = lim;
	}
	
	//Accessor methods
	public String getNumber() { return number; }
	public String getName() { return name; }
	public String getBank() { return bank; }
	public double getBalance() { return balance; }
	public int getLimit() { return limit; }
	public double getInterest() { return interest; }
	public double getFee() { return fee; }
	
	//Modifier methods
		public void setNumber(String no) { number = no; }
		public void setName(String nm) { name = nm; }
		public void setBank(String bk) { bank = bk; }
		public void setBalance(double bal) { balance = bal; }
		public void setLimit(int lim) { limit = lim; }
		public void setInterest(double ist) { interest = ist; }
		public void setFee(double f) { fee = f; }
	
	//Action methods
	public boolean chargeIt (double price) {
		if (price + balance > (double)limit)
			return false;
		balance += price;
		return true;
	}
	
	public void makePayment (double payment, Date payDate) {
		balance -= payment;
		//Charge interest
		balance += interest;
		//Pay late fee
		Date currentDate = new Date();
		if(currentDate.after(payDate) && (balance + fee) <= (double)limit) {
			balance += fee;
		}
	}
		
	public static void printCard(CreditCard c) {
		System.out.println("Number: " + c.getNumber());
		System.out.println("Name: " + c.getName());
		System.out.println("Bank: " + c.getBank());
		System.out.println("Balance: " + c.getBalance());
		System.out.println("Limit: " + c.getLimit());
		System.out.println("Interest: " + c.getInterest());
		System.out.println("Late Fee: " + c.getFee());
	}
	
}