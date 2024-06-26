class Solution {
    public int findRotateSteps(String ring, String key) {
        if (key.length() == 0) return 0;

        int ans = Integer.MAX_VALUE;
        int[][] f = new int[key.length() + 1][ring.length()];
        Arrays.fill(f[0], Integer.MAX_VALUE / 2);
        f[0][0] = 0;
        for (int i = 1; i < f.length; i++) {
            for (int j = 0; j < ring.length(); j++) {
                f[i][j] = Integer.MAX_VALUE / 2;
                if (ring.charAt(j) == key.charAt(i - 1)) {
                    for (int k = 0; k < ring.length(); k++) {
                        f[i][j] = Math.min(f[i][j], f[i - 1][k] + Math.min(Math.abs(j - k), ring.length() - Math.abs(j - k)));
                    }
                }
                if (i == key.length()) ans = Math.min(ans, f[i][j]);
            }
        }
        return ans + key.length();
    }
}