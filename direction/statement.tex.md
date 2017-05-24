Problem Statement
==
北からの反時計回りの偏角dが与えられる。
dの表す方角(N,NW,W,SW,S,SE,E,NE)を答えよ。
なお、Figure1のように、偏角dが45度のときNWとなることに注意せよ。

<center>
![](https://www.dropbox.com/s/fx33543rcffazjm/compass_with_d.png?dl=1)

<br>
Figure: 偏角45度の例
</center>


Input
==
入力は複数のデータセットから成る。
各データセットは、以下の形式で与えられる。


```
d
```

dは北からの偏角を表す (d は 0, 45, 90, 135, 180, 225, 270, 315 のいずれか)。

入力の終了は、`-1`と書かれた1行によって示される。


Output
==
各データセットに対して、dの表す方角を1行ずつ出力せよ。

なお、入力の終了を示す`-1`に対しては何も出力しないこと。


Sample Input
==
```
0
45
90
135
180
225
270
315
-1
```


Sample Output
==
```
N
NW
W
SW
S
SE
E
NE
```
