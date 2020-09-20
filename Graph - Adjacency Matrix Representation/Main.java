class Graph():
  def __init__(self, x):
    self.n = x
    self.g = [[0 for x in range(self.n)] for y in range(self.n)] 
  
  def add_edge(self, string, u, v, w):
    if u>=self.n or v>=self.n:
      return False
    #if u==v:
    #  return False
    if string == "yes":
      self.g[u][v] = w
    else:
      self.g[u][v] = w
      self.g[v][u] = w
  
  def display(self):
    for i in range(self.n):
      for j in range(self.n):
        print(self.g[i][j], end=" ")
      print()
      
n = int(input("Please enter the number of nodes in the graph"))
nedge = int(input("\nPlease enter the number of edges in the graph"))
string = input("\nIs the graph directed")
g = Graph(n)
print("\nAdjacency Matrix Representation:")
g.display()
for i in range(nedge):
  print("Enter the start node, end node and weight of edge no", i+1)
  edge = [int(j) for j in input().split(" ")]
  g.add_edge(string, edge[0]-1, edge[1]-1, edge[2])
print("Adjacency Matrix Representation:")
g.display()