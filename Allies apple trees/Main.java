#include<iostream>
#include<cmath>
using namespace std;

int plotBuy(int minApples) 
{
  double totalApples = 0;
  int unit = 0;
  while(minApples>totalApples)
  {
    unit++;
    totalApples += 12*pow(unit,2);
  }
  return unit*8;
}

int main(){
  	int n;
	cin>>n;
  	cout<<plotBuy(n)<<endl;
	return 0;
}