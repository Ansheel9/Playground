def minCoins(coins, req):
  j=0
  coins.sort(reverse=True)
  
  while(req>0):
    for i in range(100):
      if(coins[j]<=req):
        print(coins[j], end ="  ")
        req -= coins[j]
      else:
        j += 1
        break

if __name__=="__main__":
  
  coins = [1, 2, 5, 10, 20, 50, 100, 500, 1000]
  req = int(input())
  
  minCoins(coins, req)
  
  