package Rec;
import java.util.Scanner;

public class toi {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		int src = scn.nextInt();
		int dest = scn.nextInt();
		int aux = scn.nextInt();

		toh(n, src, dest, aux);

	}

	public static void toh(int n, int src, int dest, int aux) {
		
		if (n == 0) return;
			
		toh(n - 1, src, aux, dest);
		System.out.println(n + "[" + src + " -> " + dest + "]");
		toh(n - 1, aux, dest, src);
	}

}
