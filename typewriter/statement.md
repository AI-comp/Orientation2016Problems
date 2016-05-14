Problem Statement
==
クマのシゲノブくんは、おもちゃのタイプライターを持っている。
このタイプライターは、aからzまでの小文字のアルファベットで構成されるリールと、それを操作するための3つのボタンからなる。
ボタンは、リールを1つ前にまわすボタン、後ろにまわすボタン、現在のリールの文字を出力するボタンである。
ある日、友達であるウサギのアズサくんに手紙を書こうとしたシゲノブくんは、タイプライターが壊れてしまっていることに気がついた。
急ぎの用事でタイプライターを修理に出す暇のないシゲノブくんは、
プログラマーであるあなたに「タイプライターと同じ操作で動かすことができるプログラム」を作って欲しいと頼んできた。

+, -, . の３種類の記号からなる命令列が与えられるので、出力される文字列を求めよ。記号が表す意味は以下の通りである。
* +: リールを1つ前にまわす。(a->b, b->c, ..., y->z, z->a)
* -: リールを1つ後ろにまわす。(z->y, y->x, ..., b->a, a->z)
* .: 現在のリールの文字を1つ出力する。

なお、リールは初めaを表示している。

>A bear named Shigenobu has a toy typewriter.
The typewriter consists a reel for entering lowercase alphabets (a-z) and three buttons for handling them.
The buttons are a button for moving the reel forth, a button for moving the reel back and a button for writing an alphabet in corresponding to the current position of the reel.
One day, he notice that the typewriter is broken when he send a letter to a friend rabbit named Azusa.
He ask you to write a program which simulate the typewriter because he has no time to fix the typewriter.

>Given a command string which consists of three signs (+, -, .), write an output text.
The sign means as follow:
* +: moving the reel forth (a->b, b->c, ..., y->z, z->a)
* -: moving the reel back (z->y, y->x, ..., b->a, a->z)
* .: writing a an alphabet in corresponding to the current position of the reel

>Note that the first position of the reel indicates "a".

Input
==
入力は複数のデータセットから成る。
各データセットは、以下の形式で与えられる。

>The input consists of multiple sets of data.
Each data set is given with the following format.

<pre>
L
S
</pre>

1行目に、命令列の長さLが与えられる (1 <= L <= 500)。

2行目に、命令列Sが与えられる。
Sは'+', '-', '.'のみから構成される。

入力の終了は、"0"と書かれた1行によって示される。

>L is a length of a command string (1 <= L <= 500).

>S is a command string which consists of '+', '-' and '.'.

>The end of the input is represented as the line "0".


Output
==
各データセットに対して、タイプライターが出力する文字列を1行ずつ出力せよ。

**ただし、リールは各データセットの初めごとにaを示すように戻る。**

なお、入力の終了を示す"0"に対しては何も出力しないこと。

>Write the output text of the typewriter on every other line with respect to each data set.

>**Note that the position of the reel is back to "a" in every data set.**

>Note that write NOTHING to the line "0" indicating the end of the input.

