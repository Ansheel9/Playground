#include<iostream>
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{
    //Your code goes here
  	int sum = 0;
  	int len = 0;
  	int count = n;
  	int red = n;
  	int z, digit;
  	
  	while (count!=0)
    {
      count = count/10;
      ++len;
    }
  	
  	for (int i=0; i<len; i++)
    {
      digit = red%10;
      z = power(digit, len);
      red = red/10;
      sum += z;
    }
  
  	if(sum==n)
      return 1;
  	else
      return 0;
}

int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}