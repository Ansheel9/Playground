def maxSelection(start, end, n):
  i = 0
  print(i, end=" ")
  
  for j in range(n):
    if start[j] >= end[i]: 
      print(j, end=" ") 
      i = j 


n = int(input())
a = input()
b = input()
  
start = [int(element) for element in a.split()]
end = [int(element) for element in b.split()]
  
maxSelection(start, end, n)