#include <bits/stdc++.h>
using namespace std;

#define MAXN   100001  
bool prime[MAXN]; 

long long int gcpd(long long int a, long long int b);
void SieveOfEratosthenes();

int main()
{
  //Type your code here
  SieveOfEratosthenes(); 
  long long int n1, n2;
  cin >> n1;
  cin >> n2;
  cout << gcpd(n1, n2);
}

long long int gcpd(long long int a, long long int b)
{
  long long int temp, z;
  if(b >= a)
    temp = a;
  else
    temp = b;
  for(long long int i = temp; i>1; i--)
  {
    if(a%i==0 && b%i==0)
    {
      if(prime[i])
      {
        return i;
      }
    }
  }
  return -1;
}

void SieveOfEratosthenes() 
{ 
    memset(prime, true, sizeof(prime)); 
    prime[0] = false; 
    prime[1] = false; 
  
    for (int p = 2; p * p <= MAXN; p++) { 
  
        if (prime[p] == true) { 
  
            for (int i = p * p; i <= MAXN; i += p) 
                prime[i] = false; 
        } 
    } 
} 