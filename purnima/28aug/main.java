import java.util.*;

public class main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int[] arr1  = new int[n];
        int[] arr2  = new int[n];

        for(int i=0; i<n; i++) arr1[i] = scn.nextInt();

        for(int i=0; i<n; i++) arr2[i] = scn.nextInt();
        
        // System.out.println( check(arr1,arr2));

        if( check( arr1 , arr2 ) ) System.out.println(1);
        else System.out.println(0);
        
    }
    
    public static boolean check(int[] arr1 , int[] arr2) {

        HashMap <Integer,Integer> map1 = new HashMap<>();

        HashMap <Integer,Integer> map2 = new HashMap<>();

        for(int i=0; i<arr1.length; i++){
            int key = arr1[i];
            if( map1.containsKey(key)){
                int value = map1.get(key);
                map1.replace( key , value+1 );
            }
            else{
                map1.put( arr1[i] , 1 );
            }
        }
        
        for(int i=0; i<arr2.length; i++){
            int key = arr2[i];
            if( map2.containsKey(key)){
                int value = map2.get(key);
                map2.replace( key , value+1 );
            }
            else{
                map2.put( key , 1 );
            }
        }

        for ( HashMap.Entry<Integer , Integer> entry : map1.entrySet() ) {

            // System.out.println("Key = " + entry.getKey() + ", Value = " + Arrays.toString(entry.getValue()) );
            int key = entry.getKey();
            int value = entry.getValue();

            if(map2.containsKey(key)){
                if(map2.get(key) != value) return false;
            }
            else return false;

            map2.remove(key);
 
        }

        if( !map2.isEmpty() ) return false;
        
        return true;
    }
}

        

             
            

              

              

              
                

        

        

    

                       
                     
                     
                  

                       
                     
                     
                  

                       
                     
                     
                  