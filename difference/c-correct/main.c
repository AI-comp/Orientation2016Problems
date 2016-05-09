#include <stdio.h>

int abs(int a) {
    if (a < 0) return -a;
    else return a;
}

int min(int a, int b) {
    if (a < b) return a;
    else return b;
}

int main(void)
{
	int n, i;
	scanf("%d", &n);
	for (i = 0; i < n; i++) {
        int a1, a2, a3;
		scanf("%d %d %d", &a1, &a2, &a3);
		int ans = 99999;
        ans = min(ans, abs(a1 - a2));
        ans = min(ans, abs(a2 - a3));
        ans = min(ans, abs(a3 - a1));
		printf("%d\n", ans);
	}
	return 0;
}
