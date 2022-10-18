import java.util.*;

public class apples {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int t = scn.nextInt();

        while (t-- > 0) {
            int a = scn.nextInt();
            int b = scn.nextInt();
            int c = scn.nextInt();

            System.out.println(possibleArrangements(a, b, c));
        }

        // System.out.println( possibleArrangements(a, b, c) );

    }


    public static int possibleArrangements(int a, int b, int c) {
        int dif = a - b;
        if(dif < 0 && c < -1*dif ) return 0;
        if( c == 0 && a > b ) return 1;
        if( c == 0 && a < b ) return 0;
        if( dif > c ) return c+1;
        // if( a-b > c ) return possibleArrangements2(a , b , c );
        if( a < b ) return possibleArrangements2(a , b , c );
        
        return possibleArrangements1(a , b , c);
    }
    public static int possibleArrangements1(int a, int b, int c) {

        int dif = a - b; 
        
        int part1 = dif-1; 
        int part2 = ( ( c - part1 ) / 2 ) + 1; 
        
        int ans = part1 + part2;

        return ans;
    }

    public static boolean check(int a, int b, int c, int mid) {

        return (a + mid) > (b + (c - mid));
    }

    public static int possibleArrangements2(int a, int b, int c) {

        int low = 0;
        int high = c;
        int ans = c + 1;

        while (low <= high) {

            // int mid = low + (high/2);
            int mid = (low + high) / 2;

            if (check(a, b, c, mid)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        // System.out.println(ans);

        return c - ans + 1;
    }

    public static int possibleArrangements3(int a, int b, int c) {

        int part1 = c;
        int part2 = 0;
        int ans = 0;

        while (part1 >= 0) {

            if (a + part1 > b + part2)
                ans++;
            else
                break;

            part1 -= 1;
            part2 += 1;
        }

        return ans;
    }
}

/*
 * 
 * public class Solution {
 * static int possibleArrangements(int a, int b, int c) {
 * // Write your code here.
 * int low=0;
 * int high=c;
 * int ans=c+1;
 * while(low<=high){
 * 
 * int mid= low+ (high/2);
 * // cout<<mid<<endl;
 * if( check(a,b,mid, c-mid) ){
 * ans=mid;
 * high=mid-1;
 * }else{
 * low=mid+1;
 * }
 * }
 * return (c-ans)+1;
 * 
 * }
 * static boolean check(int a, int b, int a1, int b1){
 * 
 * int val= a+a1;
 * int val2= b+b1;
 * if(val>val2){
 * return true;
 * }else{
 * return false;
 * }
 * }
 * }
 */
