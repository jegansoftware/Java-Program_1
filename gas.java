package pay;

public class Gas {

	public static void main(String[] args) {
		double mile=1050;
		double hour=17.5;
		double price=86.75;
		double avgsp,gas,cost;
		
		avgsp=mile/hour;
		gas=mile/14.5;
		cost=86.75/gas;
		
		System.out.printf("\nMile     	   = %8.2f",mile);
		System.out.printf("\nHour 	  	   = %8.2f",hour);
		System.out.printf("\nGas Cost 	   = %8.2f", price);
		System.out.printf("\nAverage Speed      = %8.2f",avgsp);
		System.out.printf("\nNo.of Gas	   = %8.2f",gas);
		System.out.printf("\nCost		   = %8.2f",cost);
		
		
		System.out.printf("\n\nValues have been printed Successfully.");

	}

}
