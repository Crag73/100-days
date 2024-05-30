import java.util.*;
class Solution {
    public static void main(String[] args) {
      Solution s = new Solution();
      int[][] A = {{0,0,1,1}, {1,0,1,0}, {1,1,0,0}};
      int rst = s.matrixScore(A);
      System.out.println(rst);
    }
    public int matrixScore(int[][] A) {
      int r = A.length;
      int c = A[0].length;
      for (int i = 0; i < r; ++i) {
        if (A[i][0] == 0) {
          for (int j = 0; j < c; ++j) {
            A[i][j] = 1 - A[i][j];
          }
        }
      }
      for (int i = 0; i < c; ++i) {
        int zc = 0;
        for (int j = 0; j < r; ++j) {
          if (A[j][i] == 0) {
            zc++;
          }
        }
        if (2 * zc > r) {
          for (int j = 0; j < r; ++j) {
            A[j][i] = 1 - A[j][i];
          }
        }
      }
      int rst = 0;
      for (int i = 0; i < r; ++i) {
        int b = 0;
        for (int j = 0; j < c; ++j) {
          b = 2 * b + A[i][j];
        }
        rst += b;
      }
      return rst;
    }
}