package je;
import java.util.*;
class discount{
	
	void discount()
	{
		
		Scanner in=new Scanner(System.in);
		int flutter_price=50000;
		int percent;
		int flutter_Price_with_Discount;
		int temp;
		System.out.printf("Enter Percentage:");
		percent=in.nextInt();
		temp=percent;
		percent=percent-100;
		flutter_Price_with_Discount=flutter_price*percent/100;
		
		System.out.printf("Flutter Price (Including %d Percentage Discount ):%d",temp,flutter_Price_with_Discount);
	
	}
	
	void higher()
	{
		int a,b,c;
		Scanner in=new Scanner(System.in);
		System.out.printf("\nEnter A value :");
		a=in.nextInt();
		
		System.out.printf("\nEnter B value :");
		b=in.nextInt();
		System.out.printf("\nEnter C value :");
		c=in.nextInt();
		
		if((a>b) && (a>c))
		{
			System.out.printf("%d Is the greatest Value ",a);
		}
		else if(b>c)
		{
			System.out.printf("%d Is the greatest Value ",b);
		}
		else
		{
			System.out.printf("%d Is the greatest Value ",c);
		}
		
		System.out.printf("\nThank you for using jegan's Software ...");
	}
	
	
	void switchcase()
	{
		Scanner in=new Scanner(System.in);
		int a;
		String s;
		
		System.out.printf("\nEnter Value :");
		a=in.nextInt();
		
		switch(a)
		{
		case 1:
			s="Best";
			break;
		case 2:
			s="Better";
			break;
		case 3:
		case 4:
		case 5:
			s="Great";
			break;
		default:
			s="A Value should be entered between 1 to 5";
		}
		
		System.out.println(s);
		
		}
		
	void sale()
	{
		
		Scanner in=new Scanner(System.in);
		int sale;
		
		System.out.printf("Enter Sales Amount :");
		sale=in.nextInt();
		
		if(sale>=1000)
		{
			sale=sale/1000;
			
			switch(sale)
			{
			case 1:
			case 2:
			case 3:
			case 4:
				System.out.printf("Very Bad.......");
				break;
			case 5:
			case 6:
			case 7:
				System.out.printf("Better........");
				break;
			case 8:
			case 9:
			case 10:
				System.out.printf("Fantastic....");
				break;
			default:
				System.out.printf("Excellent.......");
			}
			
		}
		else
		{
			System.out.printf("Business was lost.........");

		}
		
	}
	
}
	
class jegan{
	
	
	void program()
	{
		String s1;
		char s;
		
		Scanner in=new Scanner(System.in);
		System.out.printf("Enter Your Id :");
		s1=in.nextLine();
		int i;
		for(i=0;i<12;i++)
		{ 
			
			s=s1.charAt(0);
			
			if(s=='8')
			{
				s=s1.charAt(1);
				if(s=='1')
				{
					s=s1.charAt(2);
					if(s=='4')
					{
						s=s1.charAt(3);
						
						if(s=='8')
						{
							System.out.printf("You were laid off");
							break;
						}
						else if(s=='2')
						{
							s=s1.charAt(4);
							if(s=='C')
							{
								System.out.printf("\nHey  Jegan ");
								System.out.printf("\nYou were Designated As CEO of this Company");
								break;
								
							}
						}
						else
						{
							System.out.printf("You weren't laid off");
							break;
						}
					}
				}
			}	
			
		}

	}
	
	void problem()
	{
		Scanner in=new Scanner(System.in);
		int i;
		int j;
		int res=0;
		
		for(i=1,j=5;j>3;i++,j--)
		{
			res=res+i+j;
		}
		
		System.out.printf("\nAnswer Is :%d",i);
	}
	
	void problem1()
	{
		Scanner in=new Scanner(System.in);
		int a,b,c;
		long res=0;
		
		System.out.printf("\nEnter A Value :");
		a=in.nextInt();
		
		System.out.printf("\nEnter B value :");
		b=in.nextInt();
		
		System.out.printf("\nEnter C value :");
		c=in.nextInt();
		
		
		while(res<10)
		{
			res+=(a++)+(++b)+(c-1);
		}
		
		System.out.printf("Answer is :- %d",res);
		
		System.out.printf("\nAnswer has displayed Successfully");
	}
	
	void problem3()
	{
		long n;
		int sum=0;
		n=38743;
		while(n>0)
		{
			sum=(int) (sum+n%10);
			n=n/10;
			
		}
		
		System.out.printf("\nAnswer is: %d", sum);
	}
	
	void problem4()
	{
		int n=5;
		int sum=1;
		int i;
		for(i=1;i<=5;i++)
		{
			sum=sum*i;
		}
		
		System.out.printf("\nAnswer is : %d",sum); 
		
	}
	
	void problem5() {
		
		int sum=0;
		int i;
		int n;
		Scanner in=new Scanner(System.in);
		
		System.out.printf("\nEnter Number:");
		n=in.nextInt();
		
		
		for(i=1;i<=n;i++)
		{
			sum=sum+i;
		}
		System.out.printf("SUM=%d", sum);
		
	}
	
	void problem6()
	{
		int n=123;
		int sum=0;

		
		
		while(n>0)
		{
			sum=sum+n%10;
			n=n/10;
		}
		
		System.out.printf("\n%d",sum);
	
	}
	
	void problem7(int a)
	{
		int k=1;
		int i,j;
		for(i=1;i<=21;i++)
		{
			for(j=1;j<=i;j++)
			{
				
				System.out.printf(" %d ",++k);
				
				if(k==21)
				{
					break;
				}
				
			}
			
			
			System.out.printf("\n");
		}
	
	}	
	
	
	
		
}




public class java3 {
	
	public static void main(String args[])
	{
		
		Scanner in=new Scanner(System.in);		
		discount ino=new discount();
		jegan in112=new jegan();
		int s;
		System.out.printf("\n1)Discount 	");
		System.out.printf("\n2)Highest 		");
		System.out.printf("\n3)Switchcase	");
		System.out.printf("\n4)Sale 	");
		System.out.printf("\n5)Employee Fire");
		System.out.printf("\n6)For ");
		System.out.printf("\n7)While ");
		System.out.printf("\n8)...........");
		System.out.printf("\n9)-----------");
		System.out.printf("\n10)SUM of Series..::");
		System.out.printf("\n11)SUM of Number..::");
		s=in.nextInt();
		
		switch(s)
		{
		case 1:
			ino.discount();
			break;
		case 2:
			ino.higher();
			break;
			
		case 3:
			ino.switchcase();
			break;
		case 4:
			ino.sale();
			break;
		case 5:
			in112.program();
			break;
		case 6:
			in112.problem();
			break;
		case 7:
			in112.problem1();
			break;
		case 8:
			in112.problem3();
			break;
		case 9:
			in112.problem4();
			break;
		case 10:
			in112.problem5();
			break;
		case 11:
			in112.problem6();
			break;
		
		case 12:
			in112.problem7(21);
			
		}	
		
	}

}
