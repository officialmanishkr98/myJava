import java.util.*;

import javax.sql.rowset.spi.SyncResolver;

public class main{
    public static void main(String[] args) {

        String num = "3456070";
        // String num = "4567";

        System.out.println(calculate(num));
    }   
    public static String calculate( String num ) {
        String n = num;
        String ans = "";
        int l =  n.length()-1;
        for(int i=0; i<=l/2; i++){
            ans = n.charAt(l-i) + ans;
            ans = n.charAt(i) + ans;
        }
        
        if(l%2 == 0 )ans = ans.substring(1);

        return ans;


    }


}