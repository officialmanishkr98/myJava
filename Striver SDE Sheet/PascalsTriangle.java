import java.util.*;

public class PascalsTriangle {
    public static void main(String[] args) {
        
        int num = 6;
        
        PascalsTriangle(num);
        
    }
    public static void PascalsTriangle(int num) {

        int[][] sol = new int [num][2*num -1];
        sol[0][num-1] = 1;
        for(int i=0; i<sol.length-1; i++){
            for(int j=0; j<sol[i].length; j++){

                if( sol[i][j] != 0 ){
                    int d = sol[i][j];

                    if( j-1 >= 0 ) sol[i+1][j-1] += d;
                    if( j+1 < sol[i+1].length ) sol[i+1][j+1] += d;
                }
            } 
        }

        display(sol);

    }

    public static void display(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
    }
}
