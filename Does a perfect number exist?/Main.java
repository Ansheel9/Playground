#include<iostream>
using namespace std;

bool perfect(long long int n);

int main()
{
  //Type your code here
  long long int n;
  cin >> n;
  if(perfect(n))
    cout << "Yes";
  else
    cout << "No";
}

bool perfect(long long int x) 
{ 
  long long int sum = 1; 
  
  for (long long int i=2; i*i<=x; i++) 
  { 
    if (x%i==0) 
    { 
      if(i*i!=x) 
        sum = sum + i + x/i; 
      else
        sum=sum+i; 
     } 
  }  
  if (sum == x && x != 1) 
     return true; 
  
  return false; 
} 