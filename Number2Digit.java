package je;
import java.util.*;

 class jegan {
	
	public void create(int a)
	{
		if(a<=9)
		{
			switch(a)
			{
			case 1:
				System.out.printf("one");break;
			case 2:
				System.out.printf("two");break;
			case 3:
				System.out.printf("Three");break;
			case 4:
				System.out.printf("Four");break;
			case 5:
				System.out.printf("Five");break;
			case 6:
				System.out.printf("Six");break;
			case 7:
				System.out.printf("Seven");break;
			case 8:
				System.out.printf("eight");break;
			case 9:
				System.out.printf("nine");break;
			}
		}
		else
		{
			System.out.printf("The Value is More than Nine");
		}
	}

}

public class Number2Digit {

	public static void main(String[] args) {

		int a;
		Scanner in=new Scanner(System.in);
		
		System.out.printf("Enter A Value :");
		a=in.nextInt();
		
		jegan in1=new jegan();
		in1.create(a);
	
	}
}
