#include<iostream>
using namespace std;

unsigned long int add(unsigned long int a);

int main()
{
  //Type your code here
  unsigned long int n;
  cin >> n;
  cout << add(n);
}

unsigned long int add(unsigned long int a)
{
    return (a * (a + 1)) / 2;
}