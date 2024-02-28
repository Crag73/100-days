import java.util.ArrayList;
import java.util.List;

class Solution {
    public static boolean isPal(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void solve(int index, String s, List<String> cur, List<List<String>> ans) {
        if (index == s.length()) {
            ans.add(new ArrayList<>(cur));
            return;
        }
        for (int i = index; i < s.length(); i++) {
            String substring = s.substring(index, i + 1);
            if (isPal(substring)) {
                cur.add(substring);
                solve(i + 1, s, cur, ans);
                cur.remove(cur.size() - 1);
            }
        }
    }

    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> cur = new ArrayList<>();
        solve(0, s, cur, ans);
        return ans;
    }
}
