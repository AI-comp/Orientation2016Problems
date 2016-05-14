title: E: 素数にわけろ(primes)

問題文 in Japanese
==
正の整数 N が与えられる。
N が 2 つの素数の積で表せる場合は "YES" そうでないならば "NO" を出力せよ。
なお、同じ 2 つの素数の積でも良いことに注意せよ。

入力 in Japanese
==
入力は複数のデータセットから成る。
各データセットは、以下の形式で与えられる。

<pre>
N
</pre>

N は素数の積で表されるか判定する整数を表す (1 <= N <= 10000)。

入力の終了は、"0"と書かれた1行によって示される。

出力 in Japanese
==
それぞれのデータセットに対して、"YES" または "NO" を 1 行ずつ出力せよ。

なお、入力の終了を示す"0"に対しては何も出力しないこと。

Problem in English
==
Given a positive integer N, write "YES" if N is a product of two prime numbers and "NO" otherwise.
Note that we may choose the same prime number as two primes.

Input in English
==
The input consists of multiple sets of data.
Each data set is given with the following format.

<pre>
N
</pre>

N is a number to be judged whether it can be expressed as a product of two prime numbers (1 <= N <= 10000).

The end of the input is represented as the line "0".

Output in English
==
Write "YES" or "NO" with respect to each data set on every other line.

Note that write NOTHING to the line "0" indicating the end of the input.

入力例 (Sample Input)
==
<pre>
6
100
3
25
0
</pre>

出力例 (Sample Output)
==
<pre>
YES
NO
NO
YES
</pre>
