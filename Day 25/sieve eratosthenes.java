import java.util.Arrays;

public class SieveOfEratosthenes {
    public static void main(String args[]) {
        int num = 10;
        int cnt = 0;
        boolean[] bool = new boolean[num + 1];
        Arrays.fill(bool, true);

        for (int i = 2; i * i <= num; i++) {
            if (bool[i] == true) {
                for (int j = i * i; j <= num; j += i) {
                    bool[j] = false;
                }
            }
        }

        System.out.println("List of prime numbers: ");
        for (int i = 2; i < bool.length; i++) {
            if (bool[i] == true) {
                System.out.println(i);
                cnt++;
            }
        }
        System.out.println("Count is: " + cnt);
    }
}
