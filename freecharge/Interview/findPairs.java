import java.util.*;

public class main {
    public static void main(String[] args) {
        int[] arr = { 8, 7, 2, 5, 3, 1 };
        int t = 10;

        // Arrays.sort(arr);

        // hashsetWay(arr, t);
        Bruteforce(arr, t);

        
    }
    
    public static void hashsetWay(int[] arr, int t) {
        
        // HashMap<Integer, Boolean> Hshmap = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<arr.length; i++){
            set.add(arr[i]);
        }
        
        for(int i=0; i<arr.length; i++){

            int res = t - arr[i];
            if(res <= 0) continue;

            if( set.contains(res) ) {
                System.out.println( arr[i] + " " + res );
                return;
            }


        }

    }
    public static void Bruteforce(int[] arr, int t) {

        for (int i = 0; i < arr.length; i++) {

            int res = t - arr[i];
            if (res <= 0)
                continue;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == res) {
                    System.out.println("[ " + arr[i] + " , " + arr[j] + " ]");
                    return;
                }
        }
    }

}
