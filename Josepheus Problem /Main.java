#include<iostream>
using namespace std;

int circleKill(int n, int k)
{
  if(n==1)
    return 1;
  return (circleKill(n - 1, k) + k-1) % n + 1;
}

int main()
{
  //Type your code here
  int n, k;
  cin >> n;
  cin >> k;
  cout << circleKill(n, k);
  return 0;
}