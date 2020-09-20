#include<iostream>
using namespace std;

bool prime(long int n);

int main()
{
  //Type your code here
  long int n;
  cin >> n;
  if(prime(n))
    cout << "Prime";
  else
    cout << "Not Prime";
}

bool prime(long int n)
{
  for(long int i=2; i*i<=n; i++)
    if(n%i==0)
      return false;
  return true;
}