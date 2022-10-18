package Rec;

public class main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pdi(4, 1);

	}
	
	public static void pdi(int n ,int d)
	{
		if(d==n+1)
			{
//				System.out.println(n);
				return;
			}
        
		System.out.println(d);
		pdi(n , d+1);
		pdi(n, d-1);

//		pdi(n-1);

//        System.out.println(n);
	}

}
