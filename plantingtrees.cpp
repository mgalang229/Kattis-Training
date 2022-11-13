#include <bits/stdc++.h>

using namespace std;

/*

Problem link: https://open.kattis.com/problems/plantingtrees

1 2 3 4 5 6 7
P G G G G
  P G G G
  	P G G G
  	  P G G
  	  
4 3 3 2

1 + 4 = 5
2 + 3 = 5
3 + 3 = 6


39 39 38 35 20 9

= 39 + (9 - 6) 
= 42
      
*/

void solve() {
	int n;
	cin >> n;
	vector<int> a(n);
	for (int i = 0; i < n; i++) {
		cin >> a[i];
	}
	sort(a.rbegin(), a.rend());
	int mx = 0;
	for (int i = 0; i < n; i++) {
		mx = max(mx, (i + 1) + a[i]);
	}
	cout << mx + 1 << "\n";
}

int main() {
	ios::sync_with_stdio(false);
	cin.tie(0);
	
	int t;
	// cin >> t;
	t = 1;
	while (t--) {
		solve();
	}
}
