#include<iostream>
#include<cmath>
using namespace std;

int no_of_digits(long n){
  int count=0;
  while(n!=0){
    count++;
    n=n/10;
  }
  return count;
}
int main()
{
  long n;
  cin>>n;
  int m=no_of_digits(n);
  int diff=0;
  for(int i=m;i>=1;i--){
    int a=n%10;
    diff=diff+((pow(-1,i))*a);
    n=n/10;
  }
  cout<<abs((-1)*diff);
  return 0;
}