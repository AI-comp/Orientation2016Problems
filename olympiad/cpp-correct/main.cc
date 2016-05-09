#include <iostream>
using namespace std;

int main() {
    int n;
    cin >> n;
    for (int i = 0; i < n; i++) {
        int y;
        cin >> y;
        int passed = y - 1896;
        if (passed >= 0 && passed % 4 == 0) {
            cout << passed / 4 + 1 << endl;
        } else {
            cout << -1 << endl;
        }
    }
}

