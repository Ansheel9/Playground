def edges(n):
  if n==1:
    return 1
  return (n + edges(n-1))

n = int(input())
print(edges(n-1))