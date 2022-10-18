package Rec;

public class q131 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
        int[] arr = {1 , 2 , 3};

//        for(int i=0; i<n; i++) arr[i] = scn.nextInt();

        int t = 3;

        subset( arr , t , 0 , 0 , "");

	}
	
	public static void subset( int[] arr , int t , int idx , int sum , String path ) 
    {
        // System.out.println(t+"-----------");
        if(sum >= t || idx == arr.length)
        {
//        	System.out.println("idx=>" + idx + " | sum =>" + sum + " | path=>" + path);
            if(sum==t) System.out.println(path);
            // System.out.print(" ");
            return;
        }
        for(int i=idx; i<arr.length; i++)
        {
            int d = arr[i];
//            System.out.println("idx=>" + idx + " | d=>"+ d + " | sum =>" + sum + " | path=>" + path);
            subset( arr , t , i+1 , sum+d , path+d+" " );
//            if(idx >= 0) subset( arr , t , 1 , sum+d , path+d+" " );
//            if(idx >= 1) subset( arr , t , 2 , sum+d , path+d+" " );
//            if(idx >= 2) subset( arr , t , 3 , sum+d , path+d+" " );
            
        }
    }

}
