def is_safe(maze, x, y, size):
  if x>=0 and x<size and y>=0 and y<size and maze[x][y]==0:
    return True
  return False

def rat_maze(maze, x, y, sol, count, size):
  if x==size-1 and y==size-1:
    return count+1
  
  sol[x][y] = True
  if is_safe(maze, x, y, size):
    sol[x][y] = 1
    if x+1 < size and not sol[x+1][y]:
      count = rat_maze(maze, x+1, y, sol, count, size)
    if x-1 >= 0 and not sol[x-1][y]:
      count = rat_maze(maze, x-1, y, sol, count, size)
    if y+1 < size and not sol[x][y+1]:
      count = rat_maze(maze, x, y+1, sol, count, size)
    if y-1 >= 0 and not sol[x][y-1]:
      count = rat_maze(maze, x, y-1, sol, count, size)
  sol[x][y] = False
  return count
  
n = int(input())
maze = [[0 for j in range(n)] for i in range(n)]
for i in range(n):
  column = [int(x) for x in input().split()]
  for j in range(n):
    maze[i][j] = column[j]
solution = [[False for j in range(n)] for i in range(n)]
count = 0
print(rat_maze(maze, 0, 0, solution, count, n))