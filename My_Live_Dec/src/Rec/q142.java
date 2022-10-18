package Rec;

public class q142 {
	
	public static int chk = 0;
	
	public static void main(String args[])
	{
//        Scanner scn = new Scanner(System.in);

        int n = 5;
        int d = n;
//        poe(n , d );
        pdi(n);
    }
	
	public static void poe(int n)
	{
		if(n==1)
			{
				System.out.println(n);
				return;
			}
		
		if(n%2!=0)System.out.println(n);
		pdi(n-1);
		if(n%2==0)System.out.println(n);
	}
    public static void poe( int n , int d ) 
    {
        if(d==0 || d==n+1) 
        	{
        		chk++;
        		return;
        	}
        
        if(chk==0)
        {
        	if(d%2!=0) System.out.println(d);
        	poe( n , d-1 );
        }
        
        if(chk==1)
        {
        	if(d%2==0) System.out.println(d);
        	poe( n , d+1 );
        }


    }
}
