import java.util.*;
public class StringBreaker {
    public static int stringBreaker(String s, int n, String[] dictionary) {
        // Write your code here.
         Set<String> dictSet = new HashSet<>(Arrays.asList(dictionary));
        
        int len = s.length();
        int[] dp = new int[len + 1];

        Arrays.fill(dp, len + 1);
        System.out.println("dp:  ->");
        Array.output_1D(dp);
        dp[0] = 0; // Base case
        
        for (int i = 1; i <= len; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (dictSet.contains(s.substring(j, i))) {
                    dp[i] = Math.min(dp[i], dp[j] + 1);
                }
            }
        }
        if(dp[len] <= len){
            return dp[len]-1;
        }
        
        return -1;

    }
}
