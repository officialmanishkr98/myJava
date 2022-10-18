
import java.util.*;

public class sumPrimeNum {
    public static void main(String[] args) {

        int rangeLeft = -30;
        int rangeRight = -11;

        System.out.println(sumPrime(rangeLeft , rangeRight));
    }

    public static int sumPrime(int rangeLeft, int rangeRight) {
        
        int ans = 0;

        for(int i=rangeLeft; i<=rangeRight; i++){
            if(isPrime(i)) ans += i;
        }
        return ans;
    }

    public static boolean isPrime(int num) {
        
        if(num < 0) num *= -1;

        for(int i=2; i*i<=num; i++){
            if(num%i == 0) return false;
        }

        return true;
    }
}
