import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int y = sc.nextInt();
            int passed = y - 1896;
            if (passed >= 0 && passed % 4 == 0) {
                System.out.println(passed / 4 + 1);
            } else {
                System.out.println(-1);
            }
        }
    }
}
