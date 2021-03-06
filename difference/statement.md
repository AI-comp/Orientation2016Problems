Problem Statement
==

3つの整数が与えられるので、それらのうち2つの整数を組み合わせて差の絶対値が最も小さくなるようにしたときの差の絶対値を求めよ。

> Choose two integers of the given three integers so that the absolute value of the difference between them is minimum, and then calculate the absolute value.

Input
==
入力は以下の形式で与えられる。

> The input is given with the following format.

<pre>
N
A<sub>11</sub> A<sub>12</sub> A<sub>13</sub>
A<sub>21</sub> A<sub>22</sub> A<sub>23</sub>
:
A<sub>N1</sub> A<sub>N2</sub> A<sub>N3</sub>
</pre>

ここで、Nはデータセットの数、A<sub>ij</sub> (1 <= i <= N, 1 <= j <= 3) はi番目のデータセットにおける3つの整数を表す。

> N indicates the number of data sets, A<sub>ij</sub> (1 <= i <= N, 1 <= j <= 3) indicates three integers of the ith data set.

Constraint
==
NとA<sub>ij</sub>は整数で与えられ、以下の制約を満たす。

> N and A<sub>ij</sub> are integers and satisfy the following constraints.

* 1 <= N <= 100
* -10000 <= A<sub>ij</sub> <= 10000 (1 <= i <= N, 1 <= j <= 3)

Output
==
i (1 <= i <= N) 行目に、i番目のデータセットにおける最も小さい差の絶対値を出力せよ。

> On the ith line (1 <= i <= N), write the minimum absolute value of the difference between two integers of the ith data set.

Sample Input
==

```
4
2 6 8
10 5 20
-2 -6 2
1000 -200 -1500
```

Sample Output
==
```
2
5
4
1200
```

