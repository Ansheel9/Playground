#include<iostream>
int main()
{
  // Type your code here
  int len, roll;
  std::cin >> len;
  int arr[len];
  int z = len;
  for(int i=0; i<len; i++)
  {
    std::cin >> arr[i];
  }
  std::cin >> roll;
  while(z>0)
  {
    for(int i=0; i<len; i++)
  	{
    	if(roll == arr[i])
    	{
      	std::cout << "She passed her exam";
        z = -1;
      	break;
    	}
    	z--;
  	}
    if(z==0)
    {
      std::cout << "She failed";
      break;
    }
  }
}