def minSumProduct(a, b, n, k):
  diff=0
  res=0
  
  for i in range(n):
    pro = a[i]*b[i]
    res += pro
    if (pro<0 and a[i]<0):
      temp = (a[i] - 2*k)*b[i]
    elif (pro<0 and b[i]<0):
      temp = (a[i] + 2*k)*b[i]
    elif (pro>0 and a[i]<0):
      temp = (a[i] + 2*k)*b[i]
    elif (pro>0 and a[i]>0):
      temp = (a[i] - 2*k)*b[i]
    d = abs(pro - temp)
    
    if(d>diff):
      diff = d
  
  return (res-diff)
  
if __name__=="__main__":
  
  n = int(input())
  a = input()
  b = input()
  k = int(input())
  
  arr = [int(element) for element in a.split()]
  brr = [int(element) for element in b.split()]
  
  print(minSumProduct(arr, brr, n, k))