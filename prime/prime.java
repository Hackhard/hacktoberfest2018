import java.util.*; 
class Prime{ 
	static boolean is_prime(int n) 
	{ 
		if (n <= 1) 
			return false; 
	
		// Check from 2 to sqrt(n) 
		for (int i = 2; i*i <= n; i++) 
			if (n % i == 0) 
				return false; 
	
		return true; 
	} 
	public static void main(String[] args) 
	{ 
	    Scanner in=new Scanner(System.in);
	    System.out.println("Enter the value of n");
	    int n=in.nextInt();     //Enter n
	    System.out.println("The prime numbers from 1 to "+n+" are: ");
	     for(int i=1;i<=n;i++)
	    {    
		    if(is_prime(i)) 
		    System.out.println(i) ; 

	    } 
    } 
}
	

