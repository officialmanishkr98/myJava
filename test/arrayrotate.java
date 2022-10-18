// import java.io.*;
import java.util.*;

public class arrayrotate {

    public static void rotate(int [] arr , int left , int right)
    {
        while(left<right)
        {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;right--;
        }
    }


    public static void arrotate(int [] arr , int r)
    {
        rotate(arr , 0 , arr.length - r -1);

        rotate(arr , arr.length - r , arr.length - 1);

        rotate(arr , 0 , arr.length -1);
    }

    public static void displayarr(int [] arr)
    {
        System.out.print("{");

        for(int val : arr)
        {
            System.out.print(val + " ");
        }
        System.out.println("}");
    }

    public static void main(String[] args)
    {
        // Scanner scn = new Scanner(System.in);
        // int n = scn.nextInt();
        System.out.println("hello world");

        int r = 3;
        int [] arr = {10,20,30,40,50};

        arrotate(arr , r);

        displayarr(arr);
    }

}