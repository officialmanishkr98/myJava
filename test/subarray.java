import java.util.*;

public class subarray {


public static void subarray(int[]arr)
{
    for(int start = 0; start <arr.length; start++)
    {
        for(int end = start; end<arr.length; end++)
        {
            for(int i=start; i<=end; i++)
            {
                System.out.print( arr[i] + " " );
            }
            System.out.println( );
        }

    }
}

public static void main(String[] args)
{
    // Scanner scn = new Scanner(System.in);
    // int n = scn.nextInt();
    int [] arr = {10,20,30,40,50};

    subarray(arr);
}

}