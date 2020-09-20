#include<iostream>
#include<string>
using namespace std;

int main() 
{ 
	string fnum, res;
	//Type your code here
  	getline(cin, fnum);
  	size_t length = fnum.find(".") + 1;
  	if(length !=0)
    {
      res.assign(fnum, length, fnum.size()-length);
      cout << "Floating part is : " << res;
    }
  	else
      cout << "Floating part is : ";
}