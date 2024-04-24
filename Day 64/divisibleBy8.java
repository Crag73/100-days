/**
 * divisibleBy8
 */
import java.util.*;
public class divisibleBy8 {

    public static void main(String[] args) {
        String s = "74";
        int arr[] = new int[10];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i)-'0']++;
        }
        for (int i = 104; i <= 999; i += 8) {
            int dup = i;
            int copy[] = new int[10];
            copy[dup % 10]++;
            dup = dup / 10;
            copy[dup % 10]++;
            dup = dup / 10;
            copy[dup % 10]++;
            dup = i;
            if (arr[dup % 10] < copy[dup % 10]) {
                continue;
            }
            copy[dup % 10]--;
            dup = dup / 10;
            if (arr[dup % 10] < copy[dup % 10]) {
                continue;
            }
            copy[dup % 10]--;
            dup = dup / 10;
            if (arr[dup % 10] < copy[dup % 10]) {
                continue;
            }
            System.out.println(i);
            return;
        }
        System.out.println("Not Possible");

    }
}