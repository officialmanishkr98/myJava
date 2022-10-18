import java.util.*;

import javax.sql.rowset.spi.SyncResolver;

public class main1{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int t = scn.nextInt();
        
        while(t-- > 0){
            float hrs = scn.nextFloat(); 
            float extra = scn.nextFloat(); 

            float ans = hrs * 20;
            if( hrs > 40 ) ans += (hrs - 40) * extra;
            System.out.println(ans);
        }

        
    }  

}