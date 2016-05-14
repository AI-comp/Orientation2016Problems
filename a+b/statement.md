Problem Statement
==
与えられた二つの整数の和を求めよ。

なお、この問題は入出力の練習のために用意されている。
問題の末尾にサンプルプログラムなどが示されているので、参考にせよ。

> Calculate the sum of the given two integers.

> Note that this problem is designed for you to practice handling standard input/output.
Check sample programs at the end of the page.

Input
==
入力は複数のデータセットから成る。
各データセットは、以下の形式で与えられる。

> The input consists of multiple sets of data.
Each data set is given with the following format.

<pre>
A B
</pre>

A, Bは整数であり、-10000 <= A <= 10000, -10000 <= B <= 10000を満たす。

入力の終了は、"0 0"と書かれた1行によって示される ("入出力の例"を参照せよ)。


> A and B are integers. A and B satisfy -10000 <= A <= 10000 and -10000 <= B <= 10000, respectively.

> The end of the input is represented as the line "0 0". Check "Sample Input / Output".

Output
==
各データセットに対して、A+Bを1行ずつ出力せよ。

なお、入力の終了を示す"0 0"に対しては何も出力しないこと。

> Write A+B on every other line with respect to each data set.
> 
> Note that write NOTHING to the line "0 0" indicating the end of the input.

Sample Input
==
<pre>
1 2
-4 2
-100 100
0 0
</pre>

Sample Output
==
<pre>
3
-2
0
</pre>

Sample Programs
==
* C

```
#include <stdio.h>

int main() {
    while (1) {
        int a, b;
        scanf("%d %d", &a, &b);
        if (a == 0 && b == 0) {
            break;
        }
        int answer = 0; /* EDIT HERE */
        printf("%d\n", answer);
    }
    return 0;
}
```

* Java

```
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a == 0 && b == 0) {
                break;
            }
            int answer = 0; // EDIT HERE
            System.out.println(answer);
        }
    }
}
```

* C++

```
#include <iostream>
using namespace std;

int main() {
    int a, b;
    while(cin >> a >> b, a | b) {
        int answer = 0; // EDIT HERE
        cout << answer << endl;
    }
}
```

* Python 3.3

```
while 1:
  a, b = map(int, input().split())
  if a == 0 and b == 0:
    break
  answer = 0 # EDIT HERE
  print(answer)
```

* Ruby 2.0

```
while true
  a, b = gets.split.map(&:to_i)
  break if a == 0 and b == 0
  answer = 0 # EDIT HERE
  puts answer
end
```

Answer Book
==
C
--

* コンパイル・実行 (Compile / Run)

```
gcc main.c
./a.out
```

* ファイルから入力する (Read input data from a file)

```
./a.out < in.txt
```

* ファイルへ出力する (Write output data to a file)

```
./a.out > out.txt
```

* ファイル入出力を同時に行う (Read input data from a file and write output data to a file)

```
./a.out < in.txt > out.txt
```

Java
--

* コンパイル・実行 (Compile / Run)

```
javac Main.java
java Main
```

* ファイルから入力する (Read input data from a file)

```
java Main < in.txt
```

* ファイルへ出力する (Write output data to a file)

```
java Main > out.txt
```

* ファイル入出力を同時に行う (Read input data from a file and write output data to a file)

```
java Main < in.txt > out.txt
```

