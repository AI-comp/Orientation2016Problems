import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Validator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();
		checkRange(d, 1, 100);
		for (int j = 0; j < d; j++) {
			int n = sc.nextInt();
			checkRange(n, 2, 50);
			
			Set<Integer> set = new HashSet<Integer>();
			for (int i = 0; i < n; i++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				checkRange(x, -100, 100);
				checkRange(y, -100, 100);
				int setIns = x*1000 + y;
				if( set.contains(setIns) ) System.exit(1);
				set.add(setIns);
			}
		}
		sc.close();
	}

	private static void checkRange(int n, int min, int max) {
		if (n >= min && n <= max)
			return;
		System.exit(1);
	}

}
