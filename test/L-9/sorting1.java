import java.util.*;

public class sorting1 {
    public static void main(String[] args){
        // int[] arr = {3,8,6,90,10,7};
        int[] arr = {50,40,90,20,10};

        disp(arr);
        
        bubble(arr);
        // insertion(arr);
        // selection(arr);
        disp(arr);
        
        

    }

    

    public static void bubble(int[] arr)
    {
        for(int count=1; count<arr.length; count++)
        {
            for(int i=0; i<=arr.length-1-count; i++)
            {
                if(arr[i] > arr[i+1])
                {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
    }

    public static void selection(int[] arr) //--> last and max
    {
        for(int last=arr.length-1; last>0; last--)
        {
            int max = last;
            for(int i=0; i<=last; i++)
            {
                if(arr[i] > arr[max]) max = i;
            }

            if(last!=max)
            {
                int temp = arr[max];
                arr[max] = arr[last];
                arr[last] = temp;
            }
        }
    }
    public static void insertion(int[] arr)
    {
        for(int last_idx = 1; last_idx < arr.length; last_idx++)
        {
            int num = arr[last_idx];
            int idx = last_idx-1;
            while(arr[idx]>num)
            // while(idx!=-1 && arr[idx]>num)
            {
                arr[idx+1] = arr[idx];
                disp(arr);
                idx--;
                if(idx==-1) break;
            }
            arr[idx+1] = num;
            
        }
        disp(arr);
    }

    public static void disp(int[] arr)
    {
        for(int val : arr)
        {
            System.out.print(val + " ");
        }
        System.out.println();
    }

}