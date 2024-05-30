    import java.util.*;
        public class Robot {

            public static int solve(int[][] arr, int i, int j, int[][] dp) {

                if ((i == 2 && j == 3)) {
                    return arr[i][j]    ;
                }
                if (i > 2 || j > 3) {
                    return 0;
                }
                if (dp[i][j] != -1) {
                    return dp[i][j];
                }
                int right = solve(arr, i + 1, j ,dp);
                int down = solve(arr, i , j + 1,dp);
                return dp[i][j]=arr[i][j]+Math.max(right, down);
            }
            public static void main(String[] args) {
                int r = 3;
                int c = 4;
                int[][] dp = new int[r][c];
                for (int i = 0; i < r; i++) {
                    Arrays.fill(dp[i], -1);
                }
                int[][] arr = { { 2, 5, 1, 3 }, { 3, 7, 2, 8 }, { 4, 8, 3, 4 } };
                System.out.print(solve(arr,0,0,dp));
            }
        }
