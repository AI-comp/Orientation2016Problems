import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a1 = sc.nextInt();
            int a2 = sc.nextInt();
            int a3 = sc.nextInt();
            int ans = Integer.MAX_VALUE;
            ans = Math.min(ans, Math.abs(a1 - a2));
            ans = Math.min(ans, Math.abs(a2 - a3));
            ans = Math.min(ans, Math.abs(a3 - a1));
            System.out.println(ans);
        }
    }
}
