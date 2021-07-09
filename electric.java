package pay;

public class electric {

	public static void main(String[] args) {
		
		int watt1=65;
		int watt2=100;
		int hour=6;
		double cost=87.0;
		
		System.out.printf("%25s\n","Cost Analysis");
		
		System.out.printf("\nWatts	hour	cost/km		  cost");
		System.out.printf("\n---------------------------------------");
		System.out.printf("\n%4d %5d    %7.0f   %15.2f",watt1,hour,cost,watt1*hour*87.0/1000);
		System.out.printf("\n%4d %5d    %7.0f   %15.2f",watt2,hour,cost,watt2*hour*87.0/1000);

	}

}
