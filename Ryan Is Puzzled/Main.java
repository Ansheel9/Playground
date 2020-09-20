#include<iostream>
using namespace std;

int main()
{
    // Type your code here
  int r, c, temp;
  cin >> r >> c;
  int arr[r][c], res[c][r];
  for(int i=0; i<r; i++)
  {
    for(int j=0; j<c; j++)
    {
      cin >> arr[i][j];
    }
  }
  
  for(int i=0; i<r; i++)
  {
    for(int j=0; j<c; j++)
    {
      res[j][i] = arr[i][j]; 
    }
  }
  
  for(int i=0; i<c; i++)
  {
    for(int j=0; j<r; j++)
    {
      cout << res[i][j] << " ";
    }
    cout << "\n";
  }
  
}