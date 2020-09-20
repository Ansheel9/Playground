#include <iostream>
using namespace std;

int swap(int &a, int &b);

int main() 
{
  // Try out your code here
  int n1, n2;
  cin >> n1 >> n2;
  cout << "Before swapping a= " << n1 << " and b=" << n2 << "\n";
  swap(n1, n2);
  cout << "After swapping a= " << n1 << " and b=" << n2;
}

int swap(int &a, int &b)
{
  int temp = 0;
  temp = a;
  a = b;
  b = temp;
}