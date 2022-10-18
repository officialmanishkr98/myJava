import java.util.*;

public class calculateDesktopProductIDs {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        System.out.println(minCost(n));
        
        
    }
    public static int minCost(int n) {

        int amount = 0;
        
        while(n>0){

            if( n/50 > 0){
                amount += 15000;
                n -= 50;
                continue;
            }

            else if( n/10 > 0){
                amount += 3250;
                n -= 10;
                continue;
            }

            else if( n/2 > 0){
                amount += 750;
                n -= 2;
                continue;
            }

            else if( n/1 > 0){
                amount += 400;
                n -= 1;
                continue;
            }
        }

        return amount;
    }
}
