package Rec;

public class q1375 {
	public static int count = 0;		
	
	public static void main(String args[]) {
//        Scanner scn = new Scanner(System.in);
        String str = "abcd";

        // int count = 0;
        subseq(str , "" );
        System.out.println();
        System.out.println(count);
    }
    public static void subseq(String str, String path ) 
    {
        if(str.isEmpty())
        {
            System.out.println(path + " ");
            count++;
            return;
        }
        for(int i=0; i<str.length(); i++)
        {
            char ch = str.charAt(i);
            subseq(str.substring(i+1) , path);
            subseq(str.substring(i+1) , path+ch);
        }
    }

}
