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
    self.adjlist[dst].append(src)
    
  def display(self):
    for src in self.adjlist:
      print(src, "--->", sep="", end="")
      for dst in self.adjlist[src]:
        print(dst, end=" ")
      print()

n = int(input("Enter the number of vertices:"))
n_edge = int(input("\nEnter the number of edges:\n"))
g = Graph(n)
for i in range(n_edge):
  print("Enter the Start node and End node of edge", i+1)
  edges = [int(i) for i in input().split(" ")]
  g.add_edge(edges[0], edges[1])
print("Adjacency List:")
g.display()