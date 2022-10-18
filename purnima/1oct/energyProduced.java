import java.util.*;

public class energyProduced {
    public static void main(String[] args) {

        int x = 5;
        int y = 3;
        int z = 4;

        int[] ans = check(x,y,z);
        System.out.println(Arrays.toString(ans));
    }
    
    public static int[] check(int initialEnergy , int rate, int seconds) {
        
        int[] ans = new int[seconds];
        ans[0] = initialEnergy; 
        for(int i=1; i<seconds; i++){
            ans[i] = ans[i-1]*rate; 
        }
        return ans;
    }
}

        

             
            

              

              

              
                

        

        

    

                       
                     
                     
                  

                       
                     
                     
                  

                       
                     
                     
                  