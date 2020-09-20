#include<iostream>
#include<vector>
using namespace std;

int findKey(int arr[3])
{
  vector<int> v;
  int z, temp, n;
  for(int i =0; i<3; i++)
  {
    n = arr[i];
  	while(n>0)
  	{
    	z = n%10;
		n = n/10;
    	v.push_back(z);
  	}
  }
  for(int i=3; i>=0; i--)
  {
    if(i%2!=0){
      temp = v[i];
	  if(v[i+4] <= temp)
        temp = v[i+4];
      if(v[i+8] <= temp)
        temp = v[i+8];
      cout << temp;
    }
    else{
      temp = v[i];
	  if(v[i+4] >= temp)
        temp = v[i+4];
      if(v[i+8] >= temp)
        temp = v[i+8];
      cout << temp;
    }
  }
}

int main()
{
  //Type your code here
  int input[3];
  for(int i = 0; i<3; i++){
    cin >> input[i];
  }
  findKey(input);
  return 0;
}