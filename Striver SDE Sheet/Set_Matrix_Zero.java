import java.lang.Thread.State;
import java.util.*;

class Set_Matrix_Zero {
    public static void main(String[] args) {
        // System.out.println("hello");
        int[][] matrix = { { 0, 1, 2, 0 },//0 3
                           { 3, 4, 5, 2 },
                           { 1, 3, 1, 5 } };
        // int[][] matrix = { { 1, 1, 1 },
        // { 1, 0, 1 },
        // { 1, 1, 1 } };

        display(matrix);
        setMatrix0(matrix);
        display(matrix);
    }

    public static void setMatrix0(int[][] arr) {

        ArrayList<Integer> cord = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 0) {
                    cord.add(i);
                    cord.add(j);
                }
            }

        }

        for (int i = 0; i < cord.size(); i = i + 2) {
            makeRowZero(arr, cord.get(i));
            makeColumnZero(arr, cord.get(i+1));
        }

    }

    public static void makeColumnZero(int[][] arr, int col) {
        for (int i = 0; i < arr.length; i++)
            arr[i][col] = 0;

    }

    public static void makeRowZero(int[][] arr, int row) {
        for (int i = 0; i < arr[row].length; i++)
            arr[row][i] = 0;
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