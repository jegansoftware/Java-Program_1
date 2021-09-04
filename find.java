package je;
import java.util.*;
public class JEGAB {

	public static void main(String[] args) {
		int[] list=new int[] {9,8,7,6,5,4,3,2,1,10};
		int n;
		int i;
		int j;
		int temp;
		n=list.length;
		int mid;
		int target;
		int choose;
		
		
		
		   
		Scanner in=new Scanner(System.in);
		
		
		System.out.println("Do you want to find ? Press 1 ");
		System.out.println("Do you want to see the list  Press 2");
		choose=in.nextInt();
		
		
		switch(choose)
		{
		
		case 1:
				
			System.out.printf("Enter Value to find :");
			target=in.nextInt();
			
				 for(i = 0; i<n; i++)  
				    {  
				        for(j = i+1; j<n; j++)  
				        {  
				            if(list[j] < list[i])  
				            {  
				                temp = list[i];  
				                list[i] = list[j];  
				               	list[j] = temp;   
				            }   
				        }   
				    }   
				
				
				 mid=n/2;
				
				 
				 for(i=mid;i<n;i++)
				 {
					 if(list[i]==target)
					 {
						System.out.println("Entered Value has been found");
					 }
				 }
				 
				 for(i=0;i<mid;i++)
				 {
					 if(list[i]==target)
					 {
						System.out.println("Entered Value Has bee found");
					 }
				 }
				 
				 break;
				
		case 2:
			
			
			 for(i = 0; i<n; i++)  
			    {  
			        for(j = i+1; j<n; j++)  
			        {  
			            if(list[j] < list[i])  
			            {  
			                temp = list[i];  
			                list[i] = list[j];  
			               	list[j] = temp;   
			            }   
			        }   
			    }   
			

			 for(i=0;i<n;i++)
			 {
				 System.out.println(list[i]);
			 }
			break;
				 
		} 
		 
		
		
	}
		
		
}


