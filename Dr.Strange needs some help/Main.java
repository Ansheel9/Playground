#include <iostream>
#include <math.h>
using namespace std;

int lab(int, int);

int main() 
{
   // Try out your code here
  	int m, n, req, z;
    cin >> m;
  	cin >> n;
  	cin >> req;
  	z = lab(m, n);
    if(z >= req)
      cout<<("Doctor, you can proceed with your experiment.");
  	else
      cout<<("Sorry Doctor! You need more bacteria.");
}

int lab(int m, int n)
{
  int expo = m;
  for(int i=1; i<n; i++)
  {
    expo = expo*m;
  }
  return expo;
}