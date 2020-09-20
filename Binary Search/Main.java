#include <iostream>
using namespace std;

int binarySearch(int arr[], int l, int r, int x) 
{
   if (r >= l)
   {
        int mid = l + (r - l)/2;

        // If the element is present at the middle itself
        if (arr[mid] == x)  
            return mid;

        if (arr[mid] > x) 
            return binarySearch(arr, l, mid-1, x);
        return binarySearch(arr, mid+1, r, x);
   }

   // We reach here when element is not present in array
   return -1;
}
  
// Driver program 
int main() 
{ 
  	int n, key;
  	cin >> n;
  	int arr[n];
  	for(int i=0; i<n; i++)
      cin >> arr[i];
  	cin >> key; 
    int ans = binarySearch(arr, 0, n-1, key); 
    if (ans==-1) 
        cout << "Not found"; 
    else
        cout << ans; 
    return 0; 
} 