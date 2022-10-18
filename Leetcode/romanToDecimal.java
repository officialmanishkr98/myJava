import java.util.*;

public class romanToDecimal {

    public static void main(String[] args) {
        // String str = "IV";
        String str = "MCMXCIV";

        System.out.println(romanToInt(str));

    }

    public static int romanToInt(String s) {

        int ans = 0;

        for (int i = s.length() - 1; i >= 0; i--) {

            int num = value(s.charAt(i));

            if (num * 3 < ans)
                ans = ans - num;
            else
                ans += num;
            System.out.println(num + "<->" + ans + " | " + (num < ans / 3));

        }

        return ans;
    }

    public static int value(char ch) {
        if (ch == 'I')
            return 1;

        if (ch == 'V')
            return 5;

        if (ch == 'X')
            return 10;

        if (ch == 'L')
            return 50;

        if (ch == 'C')
            return 100;

        if (ch == 'D')
            return 500;

        if (ch == 'M')
            return 1000;

        return 0;
    }
}
