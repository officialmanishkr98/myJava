package patterns;
//import java.util.*;

public class assignment_740 {

	public static void main(String[] args) {
//		Scanner scn = new Scanner (System.in);
//		int n = scn.nextInt();
		int n = 5;
		int str = n-1;
		int sp = 1;

		for (int i = 1; i <= (2 * n - 1); i++) 
		{
			if (i == 1 || i == 2 * n - 1) 
			{
				for (int j = 1; j <= (2 * n - 1); j++) 
				{
					System.out.print("*");
				}
			}
			
			else 
			{
				for(int j=1; j<=str; j++)
				{
					System.out.print("*");
				}
				for(int j=1; j<=sp; j++)
				{
					System.out.print(" ");
				}
				for(int j=1; j<=str; j++)
				{
					System.out.print("*");
				}
				
				if(i<n)
				{
					str--;
					sp += 2;
				}
				else
				{
					str++;
					sp -= 2;
				}
			}

			System.out.println();
		}

	}

}
