#include <bits/stdc++.h>

using namespace std;

int main() {
	ios::sync_with_stdio(false);
	cin.tie(0);
	int n;
	cin >> n;
	vector<int> p(n);
	for (int i = 0; i < n; i++) {
		cin >> p[i];
	}
	auto power = [](int a, int b) {
		int res = 1;
		while (b > 0) {
			if (b & 1) {
				res *= a;
			}
			a *= a;
			b >>= 1;
		}
		return res;
	};
	long long sum = 0;
	for (int i = 0; i < n; i++) {
		int exponent = p[i] % 10;
		p[i] /= 10;
		sum += (power(p[i], exponent));
	}
	cout << sum << '\n';
	return 0;
}
