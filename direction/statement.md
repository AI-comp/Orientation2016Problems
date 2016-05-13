title: C: 方角 (Direction)

問題文
==
北からの反時計回りの偏角dが与えられる。
dの表す方角(N,NW,W,SW,S,SE,E,NE)を答えよ。
なお、図1のように、偏角dが45度のときNWとなることに注意せよ。

<center>
![](画像URL:compass_with_d.png)

<br>図1. 偏角45度の例 </center>

Problem
==
Answer the direction (N,NW,W,SW,S,SE,E,NE) represented by the argument d of counterclockwise rotation from north.
Figure 1 shows that the direction represented by the argument d is 45-degree is NW.

<center>
![](画像URL:compass_with_d.png)

<br>Figure 1. an example where the argument d is 45-degree </center>

入力
==
入力は複数のデータセットから成る。
各データセットは、以下の形式で与えられる。

<pre>
d
</pre>

dは北からの偏角を表す (d は 0, 45, 90, 135, 180, 225, 270, 315 のいずれか)。

入力の終了は、"-1"と書かれた1行によって示される。

Input
==
The input consists of multiple data sets.
Each data set is given with the following format.

<pre>
d
</pre>

d indicates an argument of counterclockwise rotation from north (d is either 0, 45, 90, 135, 180, 225, 270 or 315).

The end of the input is represented as the line "-1".

出力
==
各データセットに対して、dの表す方角を1行ずつ出力せよ。

なお、入力の終了を示す"-1"に対しては何も出力しないこと。

Output
==
Write the direction represented by d with respect to each data set.

Note that write NOTHING to the line "0 0" indicating the end of the input.

入力例 (Sample Input)
==
<pre>
0
45
90
135
180
225
270
315
-1
</pre>

出力例 (Sample Output)
==
<pre>
N
NW
W
SW
S
SE
E
NE
</pre>
