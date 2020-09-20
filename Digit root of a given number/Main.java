#include <iostream>
using namespace std;

int digi(int n);

int main() 
{
   // Try out your code here
  int n;
  cin >> n;
  cout << digi(n);
}

int digi(int n)
{
  if(n <= 9)
  {
    return n;
  }
  int sum = 0;
  int res = 0;
  while(n>0)
  {
    sum += n%10;
    n = n/10;
  }
  res += digi(sum);
}