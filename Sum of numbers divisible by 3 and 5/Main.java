#include<iostream>
using namespace std;

int SumNumbersDivisible(int m, int n)
{ 
  n=n-1;
  if(n<15){
    return 0;
  }
  while(m%15!=0)
    m++;
  while(n%15!=0)
    n--;
  int num=((n-m)/15)+1;
  return ((n+m)*num)/2;
}

int main()
{
  //Type your code here
  int m, n;
  cin >> m;
  cin >> n;
  cout << SumNumbersDivisible(m, n) << endl;
  return 0;
}