Problem Statement
==

平面上に幾つか点(座標は全て整数である)が与えられる。平面上に、最も多くの点を通過するような直線を1本だけ引くとき、通過する点の数を求めよ。

> Given some point on a plane surface (coordinate x and y is represented by two integers),
calculate the maximum number of points passed by the line which is drawn to pass points as many as possible.

Input
==

入力は以下の形式で表される。
>The input is given with the following format.

<pre>
D
N<sub>1</sub>
x<sub>11</sub> y<sub>11</sub>
x<sub>12</sub> y<sub>12</sub>
 :
x<sub>1N<sub>1</sub></sub> y<sub>1N<sub>1</sub></sub>
N<sub>2</sub>
x<sub>21</sub> y<sub>21</sub>
x<sub>22</sub> y<sub>22</sub>
:
x<sub>2N<sub>2</sub></sub> y<sub>2N<sub>2</sub></sub>
:
N<sub>D</sub>
x<sub>D1</sub> y<sub>D1</sub>
x<sub>D2</sub> y<sub>D2</sub>
:
x<sub>DN<sub>D</sub></sub> y<sub>DN<sub>D</sub></sub>
</pre>

ここでDはデータセットの個数である。さらに、i番目のデータセットにおいて、N<sub>i</sub>は点の個数、x<sub>ij</sub>およびy<sub>ij</sub>はj番目の点の座標である。

>D is a number of data sets. For the ith dataset, N<sub>i</sub> is the number of points, x<sub>ij</sub> and y<sub>ij</sub> are a coordinate of jth point.

Constraint
==

入力は以下の条件をすべて満たす。

* 1 <= D <= 100
* 1 <= i <= D を満たすすべての整数iについて、
    * 2 <= N<sub>i</sub> <= 50
    * さらに、1 <= j, k <= N<sub>i</sub> を満たすすべての整数j, kについて、
        * -100 <= x<sub>ij</sub> <= 100
        * -100 <= y<sub>ij</sub> <= 100
	* j ≠ k ならば (x<sub>ij</sub>, y<sub>ij</sub>) ≠ (x<sub>ik</sub>, y<sub>ik</sub>)

>The input satisfies the following constraints.
> * 1 <= D <= 100
* For i satisfying 1 <= i <= D
    * 2 <= N<sub>i</sub> <= 50
    * For j satisfying 1 <= j, k <= N<sub>i</sub>
        * -100 <= x<sub>ij</sub> <= 100
        * -100 <= y<sub>ij</sub> <= 100
	* if j ≠ k then (x<sub>ij</sub>, y<sub>ij</sub>) ≠ (x<sub>ik</sub>, y<sub>ik</sub>)

Output
==

出力は、各データセットごとに直線が通過する点の個数を1行で出力せよ。

>Write the maximum number of points passed by a line with respect to each data set.

Sample Input
==
<pre>
2
5
0 0
-1 -1
1 1
2 2
3 -3
6
5 0
0 -2
0 1
0 7
1 3
2 4
</pre>

Sample Output
==
<pre>
4
3
</pre>

