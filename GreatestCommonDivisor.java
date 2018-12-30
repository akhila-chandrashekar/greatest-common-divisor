import java.io.IOException;
import java.io.BufferedReader; 
import java.io.InputStreamReader;

public class GreatestCommonDivisor {
	
	public static void main(String[] args) {
		int a = 0, b = 0;
		
		BufferedReader reader =  
                 new BufferedReader(new InputStreamReader(System.in)); 
		 
	
		try {
			
			 System.out.println("Enter a : ");
		      // Reading data using readLine 
			 a = Integer.parseInt(reader.readLine()); 
				 
			 System.out.println("Enter b : ");
			 b = Integer.parseInt(reader.readLine());
		
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		int gcd = commondivisor(a, b);
		System.out.println("GCD of "+a+" and "+b+" is "+gcd);
	}

	private static int commondivisor(int a, int b) {
		//method to calculate all common divisors
		
		//Find GCD of a and b
		int gcd = 1;
		
        a = ( a > 0) ? a : -a;
        b = ( b > 0) ? b : -b;
		
		for(int i = 1; i <= a && i <= b; ++i)
        {
            // Checks if i is factor of both integers
            if(a % i==0 && b % i==0)
                gcd = i;
        }
		
		return gcd;
	}

}
