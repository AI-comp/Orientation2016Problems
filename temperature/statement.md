title: F: 温度差に注意(temperature)

問題文 in Japanese
==
あなたは、N 個の都市をそれぞれ 1回 ずつ旅行しようとしている。
都市を訪れる順番は様々考えられるが、訪れる都市の温度の変化が大きすぎると体調に響いて大変である。
したがって、隣り合う都市の温度差の絶対値の合計が、最も小さくなるような旅行をしたい。
それぞれの都市の気温データが与えられるので、温度差の合計の最小値を求めよ。

<center>
![](画像URL: temperature.png)
<br>
図: 旅行の例。<br>
左の旅行では温度差の絶対値の合計が20となるが、右の旅行では30となる。
</center>

Problem in English
==
You plan to visit to N cities once.
Although there are many possible routes for visiting cities, a temperature difference between two cities has an affect on your physical condition.
Thus, you want to choose the best route where the sum of the absolute temperature difference values between neighboring cities is minimum.
Given temperature values of each city, calculate the minimum sum of the absolute temperature difference values.

入力 in Japanese
==
入力は複数のデータセットから成る。
各データセットは、以下の形式で与えられる。

<pre>
N
T<sub>1</sub> T<sub>2</sub> ... T<sub>N</sub>
</pre>

1行目に、都市の数Nが与えられる (2 <= N <= 100)。

2行目に、各都市の気温データが与えられる。
T<sub>i</sub>は i 番目の都市の気温を表す (-50 <= T<sub>i</sub> <= 50)。

入力の終了は、"0"と書かれた1行によって示される。

Input in English
==
The input consists of multiple sets of data.
Each data set is given with the following format.

<pre>
N
T<sub>1</sub> T<sub>2</sub> ... T<sub>N</sub>
</pre>

N is the number of cities (2 <= N <= 100).
T<sub>i</sub> is a temperature in the ith city (-50 <= T<sub>i</sub> <= 50).

The end of the input is represented as the line "0".

出力 in Japanese
==
各データセットに対して、温度差の合計の最小値を1行ずつ出力せよ。

なお、入力の終了を示す"0"に対しては何も出力しないこと。

<center>
![](画像URL: temperature.png)
<br>
図: 旅行の例。<br>
左の旅行では温度差の絶対値の合計が20となるが、右の旅行では30となる。
</center>

Output in English
==
Write the minimum sum of the absolute temperature difference on every other line with respect to each data set.

Note that write NOTHING to the line "0" indicating the end of the input.

<center>
![](画像URL: temperature.png)
<br>
Figure: Route example.<br>
The sums in the left and right routes are 20 and 30, respectively.
</center>

入力例 (Sample Input)
==
<pre>
3
10 20 30
5
-10 30 0 20 -30
0
</pre>

出力例 (Sample Output)
<pre>
20
60
</pre>
