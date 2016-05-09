#include <iostream>
#include <climits>
#include <cstdlib>
using namespace std;

int main() {
    int n;
    cin >> n;
    for (int i = 0; i < n; i++) {
        int a1, a2, a3;
        cin >> a1 >> a2 >> a3;
        int ans = INT_MAX;
        ans = min(ans, abs(a1 - a2));
        ans = min(ans, abs(a2 - a3));
        ans = min(ans, abs(a3 - a1));
        cout << ans << endl;
    }
}

