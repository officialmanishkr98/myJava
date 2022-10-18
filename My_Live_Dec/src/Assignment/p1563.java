package Assignment;
import java.util.Scanner;

public class p1563 {

	public static void kkk(String str, int k) {
		int ans = 0;

		int s = 0;
		int e = 0;
		int score = 0;
		int[] batua = new int[26];
		while (e < str.length()) {
			if (score <= k) {
				char ch = str.charAt(e);
				if (batua[ch - 'a'] == 0)
					score++;

				batua[ch - 'a']++;
				e++;
			} else {
				char ch = str.charAt(s);
				if (batua[ch - 'a'] == 1)
					score--;

				batua[ch - 'a']--;
				s++;
			}
			if (score <= k) {
				// System.out.println(str.substring(s,e))
				ans = Math.max(e - s, ans);
			}
		}
		System.out.println(ans);
	}

	public static void main (String args[]) {

    Scanner scn = new Scanner(System.in);

    int test = scn.nextInt();

    while(test-->0)
    {
        String str = scn.next();
        int k = scn.nextInt();
        kkk(str , k);

    }
}}
