#include<iostream>
#include<cmath>
using namespace std;

int HouseRobber(int x, int arr[])
{
  int money[x];
  if(x==0)
    return 0;
  if(x==1)
    return arr[0];
  money[0] = arr[0];
  money[1] = max(arr[0], arr[1]);
  for(int i=2; i<x; i++)
    money[i] = max(arr[i]+money[i-2], money[i-1]);
  return money[x-1];
}

int main()
{
  //Type your code here
  int n;
  cin >> n;
  int array[n];
  for(int i=0; i<n; i++)
    cin >> array[i];
  cout << HouseRobber(n, array);
}