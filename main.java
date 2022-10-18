import java.util.*;

public class energyProduced {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        
        int[] M = new int[n];
        
        for(int i=0; i<n; i++) M[i] = scn.nextInt();
        
        for(int i=0; i<k; i++){
            int x = scn.nextInt();
            int y = scn.nextInt();
            
            M[x-1] = y;

            evaluate(M);
            
        }

        int students = 0;
        for(int i=0; i<M.length; i++)
            if(M[i] != -1) students++;


        System.out.println(M.length + " " + students);


        System.out.println(Arrays.toString(M));
        
        
    }
    public static void evaluate(int[] arr) {
        for(int i=arr.length-1; i>0; i--){
            int j=0;
            for(j=i-1; j>=0; j--){
                if(arr[j] != -1) break;

                else if( j == 0) break;
            }
            if(arr[i] == arr[j] && i != j) arr[i] = -1;
            i = j+1;
        }
    }
}
