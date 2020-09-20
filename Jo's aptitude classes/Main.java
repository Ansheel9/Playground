#include<iostream>
int main()
{
	int a,b,c,gcd1,res,ans, small;
	std::cin>>a>>b>>c>>ans;
	//Your code goes here
	if(a<b && a<c)
		small = a;
	else if(b<c && b<a)
      	small = b;
  	else if(c<a && c<b)
      	small = c;
  	else
      	small = a;
  
 	while(small>-1)
    {
      if(a%small==0 && b%small==0 && c%small==0)
        gcd1 = small;
      	break;
      small -= 1;
    }
  	
  	if(gcd1 == ans)
      std::cout<<"Answer is correct.";
  	else
      std::cout<<"Answer is wrong.";
}