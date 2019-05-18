

class Payment
{
	double payment;
	

	public Payment(double payment) {
		
		this.payment = payment;
	}

	public double getPayment() {
		return payment;
	}

	public void setPayment(double payment) {
		this.payment = payment;
	}
	public void paymentDetails() {
		System.out.println("Payment Details"+payment);
	}
}
class CashPayment extends Payment
{
	

	public CashPayment(double payment) {
		super(payment);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void paymentDetails() {
		// TODO Auto-generated method stub
		
		System.out.println("Payment made in cash "+payment);
	}
}
class CreditCardPayment extends Payment
{
	String name, expiration;
	long credit_card_number;
	public CreditCardPayment(String name, String expiration, long credit_card_number, double payment) {
		super(payment);
		this.name = name;
		this.expiration = expiration;
		this.credit_card_number = credit_card_number;
	}
	
	@Override
	public void paymentDetails() {
		
		System.out.println("Payment with credit card: ");
		System.out.println("Payment: "+payment);
		System.out.println("name: "+name);
		System.out.println("expiration date: "+expiration);
		System.out.println("credit card number: "+credit_card_number);
	}
	
}

public class Topic2Assignment4 {
	
	public static void main(String a[])
	{
		CashPayment cashPayment=new CashPayment(1000);
		cashPayment.paymentDetails();
		cashPayment=new CashPayment(2000);
		cashPayment.paymentDetails();
		
		CreditCardPayment creditCardPayment=new CreditCardPayment("suyash", "10-10-2023", 5421326577l, 1000);
		creditCardPayment.paymentDetails();
		creditCardPayment=new CreditCardPayment("deepanshu", "10-10-2027", 9421326577l, 2000);
		creditCardPayment.paymentDetails();
		
	}

}
