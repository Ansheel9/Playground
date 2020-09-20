#include <iostream>
using namespace std;

int main() 
{
   // Try out your code here
  int m, n, a, b, sumr=0, sumc=0;
  cin >> m;
  cin >> n;
  int arr[m][n];
  for(int i=0; i<m; i++)
  {
    for(int j=0; j<n; j++)
      cin >> arr[i][j];
  }
  cin >> a;
  cin >> b;
  for(int j=0; j<n; j++)
    sumr += arr[a][j];
  for(int i=0; i<m; i++)
  {
    if(arr[i][b] != arr[a][b])
      sumc += arr[i][b];
  }
  cout << (sumr + sumc);
}