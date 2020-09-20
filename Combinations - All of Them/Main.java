#include<iostream> 
using namespace std;

void Combination(int a[], int n, int selected[], int visited_count) 
{
  if(visited_count==n){
    for(int i=0; i<n; i++)
      if(selected[i]==1)
        cout<<a[i]<<",";
    cout<<"\n";
    return;
  }
  selected[visited_count]=1;
  Combination(a, n, selected, visited_count+1);
  selected[visited_count]=0;
  Combination(a, n, selected, visited_count+1);
}
 
void CombinationWrapper(int a[], int len)
{
  int selected[len];
  int visited_count = 0;
  Combination(a, len, selected, visited_count);
}

int main()
{
  int i, n;
  cin>>n;
  int arr[n];
  for(i = 0; i < n; i++)
    cin>>arr[i];
  CombinationWrapper(arr, n);
  return 0;
}