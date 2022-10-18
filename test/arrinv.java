import java.util.*;

public class arrinv {

public static void displayarr(int [] arr)
{
    System.out.print("{");
    for(int val : arr)
    {
        System.out.print(val + " ");
    }
    System.out.println("}");
}

public static void rotate(int [] arr , int left , int right)
{
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