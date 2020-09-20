#include<iostream>
#include<cmath>
using namespace std;

bool arm(long int n);

int main()
{
  //Type your code here
  long int n;
  cin >> n;
  if(arm(n))
    cout << "Yes";
  else 
    cout << "No";
}

bool arm(long int n)
{
  int count = 0;
  long int sum = 0;
  long int x = n;
  while(x>0)
  {
    x = x/10;
    count++;
  }
  x = n;
  while(x>0)
  {
    sum += pow((x%10), count);
    x = x/10;
  }
  if(sum==n)
    return true;
  return false;
}