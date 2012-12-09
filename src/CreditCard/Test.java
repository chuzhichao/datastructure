package CreditCard;

public class Test {
	public static void main (String[] args) {
		CreditCard cards[] = new CreditCard[10];
		cards[0] = new CreditCard("5391 0375 9387 5301", "John Bowman", "California Savings", 0.0, 2500);
		cards[1] = new CreditCard("3485 0399 3395 1954", "John Bowman", "California Federal", 0.0, 3500);
		cards[2] = new CreditCard("6011 4902 3294 2994", "John Bowman", "California Finance", 0.0, 5000);
		
		for (int i=0; i<18; i++) {
			cards[0].chargeIt((double)i);
			cards[1].chargeIt(2.0*i);
			cards[2].chargeIt((double)3*i);
		}
		
		for (int i=0; i<3; i++) {
			CreditCard.printCard(cards[i]);
			while (cards[i].getBalance()>100) {
				cards[i].makePayment(100.0);
				System.out.println("New balance = "	+ cards[i].getBalance());
			}
		}
	}
}