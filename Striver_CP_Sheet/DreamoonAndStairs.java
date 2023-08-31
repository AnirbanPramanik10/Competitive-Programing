import java.util.Scanner;

public class DreamoonAndStairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        if (n < m) {
            System.out.println(-1);
        } else {
            int steps = (n + 1) / 2 + m - ((n + 1) / 2) % m;
            System.out.println(steps <= n ? steps : -1);
        }
    }
}
