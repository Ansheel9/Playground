#include<iostream>
using namespace std;

int sumofdigits(int n)
{
  if(n%9==0)
    return 9;
  else 
    return n%9;
}

int diff(int n, int d)
{
  int s, count=0;
  while(n>9)
  {
    s = sumofdigits(n);
    if((n-s)>=d)
      count++;
    n--;
  }
  return count;
}

int main()
{
  //Type your code here
  int n, d;
  cin >> n >> d;
  cout << diff(n, d) << endl;
  return 0;
}