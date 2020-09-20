#include<iostream>
using namespace std;

long long int res(int a, int b);

int main()
{
  //Type your code here
  int n1, n2;
  cin >> n1;
  cin >> n2;
  cout << res(n1, n2);
}

long long int res(int a, int b)
{
  long long int ans = 1;
  while(b>0)
  {
    b--;
    ans = ans*a;
  }
  return ans;
}
