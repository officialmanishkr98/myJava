package Rec;

public class q506 {

//	public static void main(String args[]) 
//	{
////		Scanner scn = new Scanner(System.in);
//
//		String str = "ababba";
//		System.out.println(ispal(str));
//	}
//
//	public static boolean ispal(String str) 
//	{
//		if (str.length() <= 1) return true;
//			
//		char ch1 = str.charAt(0);
//		char ch2 = str.charAt( str.length() - 1 );
//		
////		System.out.println(ch1);
////		System.out.println(ch2);
//		
//		if (ch1 != ch2) return false;
//
//		return ispal(str.substring(1, str.length() - 1));
//	}
	public static void main(String args[]) 
    {
//        Scanner scn = new Scanner(System.in);

        // int n = scn.nextInt();
//        int n = 3;
		ArrayList<String> ans = new ArrayList<>();
        par(n*2 , "" , 0 , ans);
        System.out.println(ans);
    }
    public static void par(int dest ,String path , int count , ArrayList<String> ans)
    {
        if(count==dest) 
        {
            if( chk(path) == 0 ) 
            	{
            		System.out.println(path);
            		ans.add(path);
            	}
            return;
        }
//        System.out.println(path + "<=========");
        if( chk(path) >= 0 ) par(dest , path+'(' , count+1 , ans);
        if( chk(path) >= 0 ) par(dest , path+')' , count+1 , ans);
    }
    public static int chk(String str)
    {
        int count=0;
        if(str.length() == 0) return count;

        for(int i=0; i<str.length(); i++)
        {
            if(str.charAt(i)=='(') count++;
            if(str.charAt(i)==')') count--;

            if(count<0) return count;
        }
        return count;
    }

}
