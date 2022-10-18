// str = mainshkumar
// ans = m2a2n1i1s1h1k1u1r1

import java.util.*;

public class stringCompress {
    public static void main(String[] args) {
        String str = "manishkumar";
        
        System.out.println( stringCompression(str) );
        System.out.println( stringCompression2(str) );
        
        
    }


    public static String stringCompression2(String str) {
        //non - Advance data structure
        int[] letter = new int[26];

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            int idx =  ch - 'a' ;
            
            letter[idx] = letter[idx] + 1;
        }

        String ans = "";

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            int idx =  ch - 'a' ;

            if(letter[idx] == -1) continue;
            ans += ch;
            ans += letter[idx] + "";

            letter[idx] = -1;
        }

        return ans;
    }

    public static String stringCompression(String str) {

        HashMap<Character , Integer> comp = new HashMap<>();

        for(int i=0; i<str.length(); i++){

            char ch = str.charAt(i);
            
            if( comp.containsKey( ch ) ){

                int value = comp.get( ch );

                comp.replace( ch , value+1 );
            }

            else {
                comp.put( ch , 1);
            }
        }

        String ans = "";
        for( int i=0; i<str.length(); i++ ){

            char ch = str.charAt(i);
            if( comp.containsKey( ch )){
                ans += ch ; 
                ans += comp.get( ch ) + "" ;
            }
            comp.remove( ch );

        }
        

        return ans;

    }

}
