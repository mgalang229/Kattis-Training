#include <bits/stdc++.h>
using namespace std;

#define ll long long
#define ar array

int main() {
	ios::sync_with_stdio(0);
	cin.tie(0);
	
	int n, k;
	cin >> n >> k;
	int sum=0;
	for(int i=0; i<k; ++i) {
		int r;
		cin >> r;
		sum+=r;
	}
	double mn=(double)(sum+(-3*(n-k)))/n;
	double mx=(double)(sum+(3*(n-k)))/n;
	cout << mn << " " << mx << "\n";
}
