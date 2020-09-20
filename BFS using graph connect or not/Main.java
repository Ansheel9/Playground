class Graph():
  def __init__(self, x):
    self.adjlist = {}
    self.nodes = x
    for i in range(self.nodes):
      self.adjlist[i] = []
  
  def add_edge(self, src, dst):
    if src not in self.adjlist:
      self.adjlist[src] = []
    if dst not in self.adjlist:
      self.adjlist[dst] = []
    self.adjlist[src].append(dst)
    #self.adjlist[dst].append(src)
  
  def bfs(self, v=0):
    if self.nodes == 0:
      return False
    for j in range(self.nodes):
      visited = [False]*(self.nodes)
      queue = []
      queue.append(v)
      visited[v] = True
      while queue:
        v = queue.pop(0)
        for i in reversed(self.adjlist[v]):
          if visited[i] == False:
            queue.append(i)
            visited[i] = True
      for vis in visited:
        if not vis:
          return False
    return True

n = int(input())
n_edge = int(input())
g = Graph(n)
for j in range(n_edge):
  edge = [int(i) for i in input().split(" ")]
  g.add_edge(edge[0], edge[1])
if g.bfs():
  print("Yes")
else:
  print("No")