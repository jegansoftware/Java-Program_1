package je;

public class jegan {

	public static void main(String[] args) {
		
		int s1=1;
		int s2=2;
		int s3=3;
		int i=0;
		int s4;
		
		
		for(i=1;i<=5;i++)
		{
			s4=s1+s2+s3;
			
			System.out.printf("Answer Is :\n%d",s4);
			
			s1=s2;
			s2=s3;
			
			s3=s4; 
			
			System.out.printf("\nS1=%s",s1);
			System.out.printf("\nS2=%s",s2);
			System.out.printf("\nS3=%s",s3);
		}
		
		

	}

}
