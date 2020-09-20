#include<iostream>
using namespace std;

int missing(int arr[], int low, int high, int ap)
{
  while(low<high)
  {
  	int mid = low + (high-low)/2;
  	int res = arr[0] + mid*ap;
  	if(high-low==1){
    	return (arr[high]+arr[low])/2;
    	break;
    }
  	if(arr[mid]==res)
    	low = mid;
  	else
    	high = mid;
  }
}

int main()
{
  //Type your code here
  int n;
  cin >> n;
  int arr[n];
  for(int i=0; i<n; i++)
    cin >> arr[i];
  int ap = (arr[n-1]-arr[0])/n;
  cout << missing(arr, 0, n-1, ap);
  return 0;
}