def staircase(end):
  memo = [None for _ in range(end+1)]
  memo[0] = 1
  memo[1] = 1
  for i in range(2, n+1):
    memo[i] = memo[i-1] + memo[i-2]
  return memo[end]

n = int(input())
print(staircase(n))