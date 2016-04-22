#include <stdio.h>

int main(void)
{
	int i,n;
	scanf(" %d", &n);
	for(i=0; i<n; i++)
	{
		int y;
		scanf(" %d", &y);

		int ans=-1;
		if(y>=1896 && y%4==0) ans=1+(y-1896)/4;
		printf("%d\n", ans);
	}
	return 0;
}
