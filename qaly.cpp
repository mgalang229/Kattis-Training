#include <bits/stdc++.h>
using namespace std;

#define ll long long
#define ar array

int main() {
	ios::sync_with_stdio(0);
	cin.tie(0);
	
	int n;
	cin >> n;
	vector<ar<double, 2>> v(n);
	for(int i=0; i<n; ++i)
		cin >> v[i][0] >> v[i][1];
	double sum=0;
	for(int i=0; i<n; ++i)
		sum+=(v[i][0]*v[i][1]);
	cout << sum << "\n";
}
