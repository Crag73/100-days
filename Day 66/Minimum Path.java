public class Solution {
    public int minFallingPathSum(int[][] grid) {
        int n = grid[0].length;
        int[] prev = new int[n];
        int[] curr = new int[n];
        int prevMinOne = 0;
        int prevMinTwo = 0;
        for (int[] ints : grid) {
            int currMinOne = Integer.MAX_VALUE;
            int currMinTwo = Integer.MAX_VALUE;
            for (int j = 0; j < n; j++) {
                int prevMin = prev[j] == prevMinOne ? prevMinTwo : prevMinOne;
                curr[j] = ints[j] + prevMin;
                if (curr[j] < currMinOne) {
                    currMinTwo = currMinOne;
                    currMinOne = curr[j];
                } else if (curr[j] < currMinTwo) {
                    currMinTwo = curr[j];
                }
            }
            prevMinOne = currMinOne;
            prevMinTwo = currMinTwo;
            int[] temp = prev;
            prev = curr;
            curr = temp;
        }
        return prevMinOne;
    }
}