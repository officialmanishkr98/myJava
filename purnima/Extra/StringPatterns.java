// https://practice.geeksforgeeks.org/problems/7b9d245852bd8caf8a27d6d3961429f0a2b245f1/1

import java.util.*;

class StringPatterns {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int K = scn.nextInt();

        System.out.println(calculateWays(N, K));
    }

    public static int calculateWays(int wordLen, int maxVowels) {
        double[][] dp = new double[wordLen + 1][maxVowels + 1];
        double MOD = 1e9;
        MOD = MOD + 7;
        for (int i = 0; i <=wordLen; i++) {

            for (int j = 0; j <= maxVowels; j++) {
                if (i == 0) {
                    dp[i][j] = 1;
                } else {
                    dp[i][j] = dp[i - 1][maxVowels] * 21 % MOD;

                    if (j > 0) {
                        dp[i][j] = (dp[i][j] + dp[i - 1][j - 1] * 5 % MOD) % MOD;
                    }
                }

            }

        }
        return (int) dp[wordLen][maxVowels];

    }
}
