Problem Statement
==

今年、2016年はブラジルのリオデジャネイロで夏季オリンピックが開催される。また、この次の夏季オリンピックは2020年に日本の東京で第32回の夏季オリンピックが開催される予定である。

夏季オリンピックは1896年にギリシャのアテネで第1回が開催されてから、4年に一度ずつ、4の倍数の年に開催されている。この回数の数え方は、中止になってしまった大会にも番号が振られている。例えば、1916年のベルリン大会は中止になったが、第6回オリンピック競技大会と数字が付いている。

年が西暦で与えられるので、その年に行われる夏季オリンピックが第何回であるかを判定せよ。

>The Olympic Summer Games will be held in Rio de Janeiro, Brazil in this year.
Also, The next Olympic Summer Games will be held in Tokyo, Japan in 2020.

>The Olympic Summer Games started in Athena, Ellas and was continuously held once every four years.
The Olympic Summer Games is counted including cancelled events, for example, the Olympic Summer Games in 1916 is considered as the 6th event.

>Calculate what number the Olympic Summer Games is held in corresponding to the given year.

Input
==
入力は以下の形式で与えられる。
>
The input is given with the following format.

<pre>
N
Y<sub>1</sub>
Y<sub>2</sub>
:
Y<sub>N</sub>
</pre>

ここで、Nはデータセットの数、Y<sub>i</sub> (1 <= i <= N)は西暦の年を表す。

>N is the number of data sets and Y<sub>i</sub> (1 <= i <= N) is a year.

Constraint
==
NとY<sub>i</sub> (1 <= i <= N) は整数で与えられ、以下の制約を満たす。
>N and Y<sub>i</sub> (1 <= i <= N) are integers and staisfy the following constraints.

* 1 <= N <= 100
* 1 <= Y<sub>i</sub> <= 100000 (1 <= i <= N)

Output
==
i (1 <= i <= N) 行目に、西暦Y<sub>i</sub>年に行われる夏季オリンピックが第何回であるかを出力せよ。ただし、その年に夏季オリンピックが開催されない時には-1を出力せよ。

>Write what number the Olympic Summer Games in the year Y<sub>i</sub> is held on the ith line (1 <= i <= N).
Write -1 instead if the Olympic Summer Games isn't held in the year.


Sample Input
==

```
5
1896
2020
1000
1916
99999
```

Sample Output
==
```
1
32
-1
6
-1
```

