package pay;

public class Java {

	public static void main(String[] args) {
		
		double  N=12;
		double F;
		double n=36;
		double p=5000;
		double r;
		double r1;
		F=36*162.50-5000;
		
		r=(2+N)*F/(p*(n+1));
		
		
	
		
		System.out.printf("Rate of interest  : %.2f Percentage.",r*100);
	}

}
