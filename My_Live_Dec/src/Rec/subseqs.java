package Rec;

public class subseqs {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String str = "abc";
//		subseq("" , str);
//		cointoss(3, "");

		tree(5, "123", "" , 0);

	}

	public static List<String> fnl = new ArrayList<String>();
	
	public static void tree(int num , String str , String ans , int total) 
	{
		if(total >= num) 
			{
				if(total == n) fnl.add(ans);
				return;
			}
		
		for(int i=0; i<str.length(); i++)
		{
			int n = (int)str.charAt(i);
			tree( num - n , str , ans+n , total+n )
		}
		
	}

	public static void subseq(String ans, String str) {
		if (str.isEmpty()) {
			System.out.println(ans);
			return;
		}
		char ch = str.charAt(0);
		subseq(ans + ch, str.substring(1));
		subseq(ans, str.substring(1));
	}

	public static void cointoss(int num, String ans) {
		if (num == 0) {
			System.out.println(ans);
			return;
		}
		if (str.charAt(str.length() - 1) != 'H')
			cointoss(num - 1, ans + "H");
		cointoss(num - 1, ans + "T");
	}
}