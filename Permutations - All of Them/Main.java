#include<iostream>
#include<string.h>
using namespace std;

void sort(char arr[], int n)
{
  int i, j;
  for(i=1; i<n; i++){
    int temp = arr[i];
    for(j=i-1; j>=0; j--)
    {
      if(arr[j+1]<arr[j])
        arr[j+1]=arr[j];
      else
        break;
    }
    arr[j+1]=temp;
  }
}

void permute(char a[], int n, int selected[], int used[], int index)
{
  int i;
  if(index==n){
    for(i=0; i<n; i++)
      cout<<char(selected[i]);
    cout<<"\n";
    return;
  }
  for(i=0;i<n;i++){
    if(used[i]==1)
      continue;
    used[i]=1;
    selected[index]=a[i];
    permute(a, n, selected, used, index+1);
    used[i]=0;
  } 
}

void permutationWrapper(char a[], int n)
{
  sort(a, n);
  int selected[20]={}, used[20]={};
  permute(a, n, selected, used, 0);
}

int main()
{
  //Type your code here
  char str[20];
  cin >> str;
  int n = strlen(str);
  permutationWrapper(str, n);
  return 0;
}