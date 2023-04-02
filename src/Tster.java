import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Tster {

	public static void main(String[] args) throws FileNotFoundException 
	{
		 new Tster().tester();
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

			//System.out.println("is the value "+(N % 2 != 0));
			if (A)//(((N % 2 != 0) && (N>= 0)&& (N < 2) )) // 0 to 2
			{		
				System.out.println("Weird");
			}
				else if (B && (N % 2 == 0)) // 2 to 5
			{	
				 System.out.println("Not Weird");
			}
//				else if (B && (N % 2 != 0))
//			{
//				 System.out.println("Weird");
//			}
				else if (C && (N % 2 == 0))// 6 to 20 //((R.contains("Not Weird")||(!R.contains("Weird"))) && C)//((R.contains("Not Weird")) && C && (!R.contains("Weird")))
			{
				System.out.println("Weird");
			}
				else if (D && (N % 2 == 0)) //(D && (!R.contains("Weird"))) // 20 to 100 
			{
					System.out.println("Not Weird");
			}
			
			R = "";
			
//				else if(N >= 2 && N <= 5 && (false == R.contains("Weird")))
//	        {
//				//System.out.println(N);
//				System.out.println("Not Weird");
//	        }
//				else if(N >= 6 && N <= 20 && (false == R.contains("Weird")))
//	        {
//	        	//System.out.println(N);
//	            System.out.println("Weird");
//	        }
//				else if (N > 20 && (false == R.contains("Weird")))
//	        {
//	        	//System.out.println(N);
//	            System.out.println("Not Weird");
//	        }
			
		}

	}

}
