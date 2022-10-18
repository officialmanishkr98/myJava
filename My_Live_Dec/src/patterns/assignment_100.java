package patterns;

public class assignment_100 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int ans = 0;
        int t = n;
        int cntr = 0;
        while(t>0)
        {
            cntr++;
            n /= 10;
        }
        
        while(n>0)
        {
            int d = n%10;
            n /= 10;

            ans += d * ((int)Math.pow(10 , cntr-1)) ;
            cntr--;
        }
        System.out.println(ans);

	}

}
