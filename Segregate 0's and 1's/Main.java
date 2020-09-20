#include <iostream>
#include <cstring>
using namespace std;

void segregate(int arr[], int size)  
{  
  int left = 0, right = size-1;  
  
  while (left < right)  
  {  
    while (arr[left] == 1 && left < right)  
      left++;  
  
    while (arr[right] == 0 && left < right)  
      right--;  
  
    if (left < right)  
    {  
      arr[left] = 1;  
      arr[right] = 0;  
      left++;  
      right--;  
    }  
  }
}

int main() 
{
   // Try out your code here
  string s;
  cin>> s;
  int arr[s.length()];
  
  for(int i=0; i<s.length(); i++)
    arr[i] = s[i] - '0';
  
  segregate(arr, s.length());
  
  for(int i=0; i<s.length(); i++)
    cout << arr[i];
  
  return 0;
}