def lis(arr, n):
  lis_list = [1 for i in range(n)]
  for i in range(1, n):
    for j in range(n):
      if arr[i]>arr[j] and lis_list[i]<lis_list[j]+1:
        lis_list[i] = lis_list[j]+1
  return max(lis_list)
  

n = int(input())
arr = [int(x) for x in input().split()]
print(lis(arr, n))