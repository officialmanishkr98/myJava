import java.util.*;

import javax.sql.rowset.spi.SyncResolver;

public class main{
    public static void main(String[] args) {
        // int n = 1;
        Scanner scn = new Scanner(System.in);

        float fl = scn.nextFloat(); 
        System.out.println(calculate("AC"));
        System.out.println(fl);

        
    }  
    public static int calculate(String column_letter) {
        int result = 0;
        for (int i = 0; i < column_letter.length(); i++){
            result *= 26;
            result += column_letter.charAt(i) - 'A' + 1;
        }
        return result;
    } 
}