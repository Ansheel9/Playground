#include<iostream>
using namespace std;

void sum(long long int x);

int main()
{
  //Type your code here
  long long int n;
  cin >> n;
  sum(n);
}

void sum(long long int x)
{
  if(x%9==0)
    cout << "9";
  else
    cout << x%9;
}