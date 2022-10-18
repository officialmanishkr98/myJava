import java.util.*;

public class calculateDesktopProductIDs {
    public static void main(String[] args) {

        char[] cha = { 'a' , 'v' , 'i' , 'k' , 'e' , 'l' , 'O'};
        System.out.println(check(cha));
    }
    
    public static int check(char[] productID ) {

        int ans = 0;

        for(int i=0; i<productID.length; i++){
            char ch = productID[i];
            if( isLaptop(ch) == false ) ans++;
        }

        return ans;
        
    }
    public static boolean isLaptop(char ch ) {

        if( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ) return true;
        if( ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ) return true;

        return false;
    }
}

        

             
            

              

              

              
                

        

        

    

                       
                     
                     
                  

                       
                     
                     
                  

                       
                     
                     
                  