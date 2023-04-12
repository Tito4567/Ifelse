import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Tester 
{

	public static void main(String[] args) throws FileNotFoundException 
	{
		 new Tester().tester();
		//System.out.println("is the value "+(2 % 2 != 0));
	}
	
	public void tester() 
	{
		String R = "";
		for (int N = 0; N <= 100; N++) 
		{
			System.out.println(N);
			boolean A = (N % 2 != 0);
			boolean B = ((N <= 5) && (N >= 2));
			boolean C = ((N <= 20) && (N >= 6));
			boolean D = (N > 20);
			//System.out.println("results "+A+" "+B);

			//	System.out.println("is the value "+(N % 2 != 0));
			if((N % 2 != 0) && A)
	        {
	            System.out.println("Weird");            
	        }
	        else if((N % 2 != 0) && B)
	        {
	            System.out.println("Weird");
	        }
	        else if((N % 2 == 0) && B)
	        {
	            System.out.println("Not Weird");
	        }
	        else if((N % 2 == 0) && C)
	        {
	            System.out.println("Weird");            
	        }
	        else if ((N % 2 == 0) && D)
	        {
	            System.out.println("Not Weird");
	        }
	        else if((N % 2 != 0) && D)
	        {
	           System.out.println("Weird");            
	        }
			
		}

	}

}
