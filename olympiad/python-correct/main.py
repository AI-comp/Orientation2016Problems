#!/usr/bin/python3

for i in range(int(input())):
	y=int(input())

	ans=-1
	if y>=1896 and y%4==0:
		ans=1+(y-1896)//4
	print(ans)
