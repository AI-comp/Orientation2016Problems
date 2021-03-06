Problem Statement
==

3つの整数が与えられるので、それらのうち2つの整数を組み合わせて差の絶対値が最も小さくなるようにしたときの差の絶対値を求めよ。

Input
==
入力は以下の形式で与えられる。

```
$N$
$A_{11}$ $A_{12}$ $A_{13}$
$A_{21}$ $A_{22}$ $A_{23}$
$\vdots$
$A_{N1}$ $A_{N2}$ $A_{N3}$
```

ここで、$N$はデータセットの数、$A_{ij} (1 \leq i \leq N, 1 \leq j \leq 3)$ は$i$番目のデータセットにおける3つの整数を表す。

Constraint
==
$N$と$A_{ij}$は整数で与えられ、以下の制約を満たす。

* $1 \leq N \leq 100$
* $-10000 \leq A_{ij} \leq 10000 (1 \leq i \leq N, 1 \leq j \leq 3)$

Output
==
$i (1 \leq i \leq N)$ 行目に、$i$番目のデータセットにおける最も小さい差の絶対値を出力せよ。

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
