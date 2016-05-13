import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Random;
import java.util.Set;
import java.util.HashSet;

public class Generator {
	private static Random rnd = new Random(System.currentTimeMillis());

	public static void main(String[] args) {
		generateSmallInputFile();
		generateLargeInputFile();
		for (int i = 0; i < 10; i++)
			generateRandomInputFile(i);
	}

	private static void generateSmallInputFile() {
		File file = new File("20-small.in");
		try {
			PrintStream stream = new PrintStream(file);
			int n = 10;
			stream.println(n);
			for (int i = 0; i < n; i++) {
				generateSmallTestCase(stream);
			}
		} catch (FileNotFoundException e) {
			return;
		}
	}

	private static void generateLargeInputFile() {
		File file = new File("21-large.in");
		try {
			PrintStream stream = new PrintStream(file);
			int n = 100;
			stream.println(n);
			for (int i = 0; i < n; i++) {
				generateLargeTestCase(stream);
			}
		} catch (FileNotFoundException e) {
			return;
		}
	}

	private static void generateRandomInputFile(int index) {
		File file = new File((50 + index) + "-random" + index + ".in");
		try {
			PrintStream stream = new PrintStream(file);
			int n = generateRandomNum(50, 100);
			stream.println(n);
			for (int i = 0; i < n; i++) {
				generateLargeTestCase(stream);
			}
		} catch (FileNotFoundException e) {
			return;
		}
	}

	private static void generateSmallTestCase(PrintStream stream) {
		int n = generateRandomNum(2, 10);
		stream.println(n);

		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < n; i++) {
			int x, y, ins;
			do {
				x = generateRandomNum(0, 20);
				y = generateRandomNum(0, 20);
				ins = 1000*x + y;
			} while( set.contains(ins) );
			set.add(ins);
			stream.println(x + " " + y);
		}
	}

	private static void generateLargeTestCase(PrintStream stream) {
		int n = generateRandomNum(2, 50);
		stream.println(n);

		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < n; i++) {
			int x, y, ins;
			do {
				x = generateRandomNum(-100, 100);
				y = generateRandomNum(-100, 100);
				ins = 1000*x + y;
			} while( set.contains(ins) );
			set.add(ins);
			stream.println(x + " " + y);
		}
	}

	private static int generateRandomNum(int min, int max) {
		int len = max - min + 1;
		return rnd.nextInt(len) + min;
	}

}
