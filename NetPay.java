package pay;

public class ynetpay {

	public static void main(String[] args) {
	 double t;
	 double a;
	 double amount=19874;
	 double ypay;
		t=850.45;
		a=amount*16.03/100;
		
		ypay=amount-t-a;
		
		
		System.out.printf("\nY Net Pay Is : %.2f", ypay);
	}
}
