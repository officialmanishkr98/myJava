//import java.util.*;
package Rec;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class q153 {
	public static void main(String args[]) 
	{
        Scanner scn = new Scanner(System.in);
//
        int n = scn.nextInt();
        scn.nextLine();
        while(n-->0)
        {
        	String str = scn.nextLine();
        	
        	ArrayList<String> ANS = new ArrayList<>();
        	subseq("" , str , ANS);
        	Collections.sort(ANS);
        	System.out.println(ANS);
        }
	}
	public static void subseq(String ans , String str , ArrayList<String> ANS ) 
	{
		if(str.isEmpty())
		{
//			System.out.println(ans);
			ANS.add(ans);
			return;
		}
		
			char ch = str.charAt(0);
			subseq(ans+ch , str.substring(1) , ANS );
			subseq(ans , str.substring(1) , ANS );			
	}
   	
    	

}