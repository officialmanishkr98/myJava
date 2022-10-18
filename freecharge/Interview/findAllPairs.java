import java.util.*;

public class findAllPairs {
    public static void main(String[] args) {
        int[] arr = { 8, 7, 2, 5, 3, 1 , 9 };
        int t = 10;

        // printAllPairsUsingHashmap(arr, t);
        // printOnePairsUsingHashset(arr, t);
        printAllPairsUsingHashset(arr, t);
        
    }

    public static void printAllPairsUsingHashmap(int[] arr , int t) {
        // here i have to print all the pair from array whose sum equals to target
        
        HashMap<Integer , Boolean> hshmap = new HashMap<>();

        for(int i=0; i<arr.length; i++ ){
            hshmap.put( arr[i], false );
        }
        
        
        for(int i=0; i<arr.length; i++) {
            if( hshmap.get(arr[i]) ) continue;
            
            hshmap.replace( arr[i], true );
            
            int res = t - arr[i];
            
            if( hshmap.containsKey( res ) && !hshmap.get(res) ) {
                System.out.println( arr[i] + " " + res );
                hshmap.replace( res, true );
            }
            
        }
        
    }
    
    public static void printOnePairsUsingHashset(int[] arr , int t) {
        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<arr.length; i++ ){
            set.add( arr[i ]);
        }

        for(int i=0; i<arr.length; i++){
            
            int res = t - arr[i];

            if( set.contains(res) ){
                System.out.println( arr[i] + " " + res );
                return;
            }
        }
        
    }
    
    public static void printAllPairsUsingHashset(int[] arr , int t) {
        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<arr.length; i++ ){
            set.add( arr[i ]);
        }

        for(int i=0; i<arr.length; i++){
            
            int res = t - arr[i];

            if( set.contains(res) ){
                System.out.println( arr[i] + " " + res );
                set.remove(arr[i]);
            }
        }
        
    }
}
