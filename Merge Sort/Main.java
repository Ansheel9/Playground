#include <iostream>
using namespace std;

int merging(int arr[], int low, int mid, int high)
{
  int i, j, k;
  int n_1 = mid - low + 1;
  int n_2 = high - mid;
  int left[n_1], right[n_2];
  
  for (i = 0; i < n_1; i++) 
	left[i] = arr[low + i]; 
  for (j = 0; j < n_2; j++) 
	right[j] = arr[mid + 1 + j]; 
  
  i=0;
  j=0;
  k=low;
  while(i<n_1 && j<n_2)
  {
    if(left[i]<=right[j]){
      arr[k] = left[i];
      i++;
    }
    else{
      arr[k] = right[j];
      j++;
    }
    k++;
  }
  while(i<n_1)
  {
    arr[k] = left[i];
    i++;
    k++;
  }
  while(j<n_2)
  {
    arr[k] = right[j];
    j++;
    k++;
  }
}

void merge(int arr[], int low, int high)
{
  if(low<high)
  {
    int mid = (low+high)/2;
    merge(arr, low, mid);
    merge(arr, mid+1, high);
    merging(arr, low, mid, high);
  }
}

int print(int arr[], int n)
{
  cout << "\nAfter Sort:\n";
  for(int i = 0; i < n; i++)
  	cout << arr[i] << " "; 
}

int main() 
{
   // Try out your code here
  int n;
  cin >> n;
  int arr[n];
  for(int i=0; i<n; i++)
    cin >> arr[i];
  
  cout << "Before Sort:\n";
  for(int i=0; i<n; i++)
    cout << arr[i] << " ";
  
  merge(arr, 0, n-1);
  print(arr, n);
  
  return 0;
}