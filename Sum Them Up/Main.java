#include<iostream>

int main()
{
    // Type your code here
	int r, c;
    std::cin>>r>>c;
    int a[r][c], b[r][c], res[r][c], i, j;

    // Type your code here
  	for(i = 0; i < r; i++){
        for(j = 0; j < c; j++){
            std::cin>>a[i][j];
        }
    }
  
  	for(i = 0; i < r; i++){
        for(j = 0; j < c; j++){
            std::cin>>b[i][j];
        }
    }
	
  	for(int i = 0; i < r; i++){
        for(int j = 0; j < c; j++){
            res[i][j] = a[i][j] + b[i][j];
        }
    }
  
    for(i = 0; i < r; i++){
        for(j = 0; j < c; j++){
            std::cout<<res[i][j]<<" ";
        }
        std::cout<<"\n";
    }
}