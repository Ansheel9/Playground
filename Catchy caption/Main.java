#include <cstring>
#include <iostream>
using namespace std;

int main()
{
   //Your code goes here
  char str[100];
  int count = 0;
  cin.getline(str, sizeof(str));
  int length = strlen(str);
  for(int i=0; i<length; i++)
    if(str[i]==' ')
      count++;
  if (count<=10)
    cout << "Caption eligible for the contest";
  else
    cout << "Caption not eligible for the contest";
}