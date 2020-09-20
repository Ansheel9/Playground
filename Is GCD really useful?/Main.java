#include<iostream>
#include<vector>
using namespace std;

int main()
{
  //Type your code here
  long long int temp, n1, n2;
  cin >> n1;
  cin >> n2;;
  if(n2 >= n1)
    temp = n1;
  else
    temp = n2;
  for(long long int i = temp; i>0; i--)
  {
    if(n1%i==0 && n2%i==0)
    {
      cout << i;
      break;
    }
  }
}
