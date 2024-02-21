import java.util.* ;
import java.io.*; 
public class Solution {

    public static int frogJump(int n, int height[]) {
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
     
        dp[0]=0;
        dp[1]=Math.abs(height[1]-height[0]);
        for(int i=2;i<n;i++){
            dp[i]=Math.min((dp[i-1]+Math.abs(height[i]-height[i-1])),
            (dp[i-2]+Math.abs(height[i]-height[i-2])));
        }
        return dp[n-1];
    }

}