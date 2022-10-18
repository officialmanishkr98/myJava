import java.util.*;

public class main1{
    public static void main(String[] args) {
        int [] arr = { 2,-3,8,-6,-7,18,1 };

        System.out.println(memserver1(arr));

    }   
    public static int memserver1( int[] req) {
        int answer = 0;

        for(int i=0; i<req.length; i=i+2){
            answer += req[i];
        }

        return answer;
    }

}