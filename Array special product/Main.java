#include<iostream>
using namespace std;

void multiply(int arr[], int size)
{
  int i, mul=1;
  for(i=0; i<size; i++)
    mul = arr[i]*mul;
  for(i=0; i<size; i++)
    cout << mul/arr[i] << "\n";
}

int main()
{
  //Type your code here
  int n;
  cin >> n;
  int arr[n];
  for(int i=0; i<n; i++)
    cin >> arr[i];
  multiply(arr, n);
  return 0;
}