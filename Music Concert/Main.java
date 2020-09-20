#include<iostream>
#include<cstdlib>
using namespace std;

int count_m(int *a, int len);
int count_f(int *a, int len);

int main(){
  // Type your code here
  int n, m, f;
  int *arr;
  
  cin >> n;
  
  arr = (int *)calloc(n, sizeof(int));
  for(int i=0; i<n; i++)
  {
    cin >> *(arr+i);
  }
  
  m = count_m(arr, n);
  f = count_f(arr, n);
  
  cout << m << "\n" << f;
}

int count_f(int *a, int len)
{
  int fem=0;
  
  for(int i=0; i<len; i++)
  {
    if( *(a+i) % 2 == 0 )
    {
      fem++;
    }
  }
  return fem;
}

int count_m(int *a, int len)
{
  int mal=0;
  
  for(int i=0; i<len; i++)
  {
    if( *(a+i) % 2 != 0 )
    {
      mal++;
    }
  }
  return mal;
}
