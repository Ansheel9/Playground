#include<iostream>

int fact(int x);

int main()
{
  //Type your code here.
  int n, z;
  std::cin >> n;
  z = fact(n);
  std::cout << "The factorial of " << n << " is " << z;
}

int fact(int x)
{
  int res = 1;
  if(x==0)
  {
    return res;
  }
  res = x*fact(x-1);
}