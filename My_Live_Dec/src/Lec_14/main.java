package Lec_14;

import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
//		Scanner scn = new Scanner(System.in);

		// int n = scn.nextInt();
		
		int [] arr1 = { 1 , 2 , 9 , 3 , 6 };
		int [] arr2 = { 5 , 4 , 3 , 2};
		
		int idx1 = arr1.length-1;
		int idx2 = arr2.length-1;
		int c = 0;
		
		ArrayList<Integer> ans = new ArrayList<>();
		
		while(idx1 >= 0 || idx2 >= 0 || c > 0)
		{
			int d1 = (idx1 >= 0 ) ? arr1[idx1] : 0;
			int d2 = (idx2 >= 0 ) ? arr2[idx2] : 0;
			
			int d = d1+d2+c;
			
			c = (d1+d2)/10;
			
			d = d%10;
			
			ans.add(0 , d);
			
			idx1--;idx2--;
			
		}
		
		System.out.println(ans);
		
		
		
		
		
////		int n = 5;
//		int [] arr1 = {5,7,10,10,10,20,30,30,50,60,60,80};
//		int [] arr2 = {10,10,15,20,30,30,30,60,70,80,90};
//		ArrayList<Integer> ans = new ArrayList<>();
//		int j=0;int i=0;
//		while(i<arr1.length && j<arr2.length )
//		{
//			
//				if(arr1[i] == arr2[j]) 
//				{
//					ans.add(arr1[i]);
//					i++;
//					j++;
//				}
//				else if(arr2[j] < arr1[i]) j++;
//				
//				else i++;
//			
//		}
//
//		System.out.println(ans);

	}

}
