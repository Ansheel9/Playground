#include<iostream>
int main()
{
  // Type your code here
  int len, high;
  std::cin >> len;
  int arr[len];
  for(int i=0; i<len; i++)
  {
    std::cin >> arr[i];
  }
  
  high = arr[0];
  for(int i=1; i<len; i++)
  {
    if(high < arr[i])
    {
      high = arr[i];
    }
  }
  std::cout << high;
}