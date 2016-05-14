Problem Statement
==
北からの反時計回りの偏角dが与えられる。
dの表す方角(N,NW,W,SW,S,SE,E,NE)を答えよ。
なお、Figure1のように、偏角dが45度のときNWとなることに注意せよ。

>Answer the direction (N,NW,W,SW,S,SE,E,NE) represented by the argument d of counterclockwise rotation from north.
Figure 1 shows that the direction represented by the argument d is 45-degree is NW.

<center>
![](/system/images/attachments/000/000/001/original/compass_with_d.png?1463192709)

<br>Figure1. 偏角45度の例<br> (an example where the argument d is 45-degree) </center>

Input
==
入力は複数のデータセットから成る。
各データセットは、以下の形式で与えられる。

> The input consists of multiple data sets.
Each data set is given with the following format.

<pre>
d
</pre>

dは北からの偏角を表す (d は 0, 45, 90, 135, 180, 225, 270, 315 のいずれか)。

入力の終了は、"-1"と書かれた1行によって示される。

>d indicates an argument of counterclockwise rotation from north (d is either 0, 45, 90, 135, 180, 225, 270 or 315).

>The end of the input is represented as the line "-1".

出力 in Japanese
==
各データセットに対して、dの表す方角を1行ずつ出力せよ。

なお、入力の終了を示す"-1"に対しては何も出力しないこと。

> Write the direction represented by d with respect to each data set.

> Note that write NOTHING to the line "0 0" indicating the end of the input.

Sample Input
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

Sample Output
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
