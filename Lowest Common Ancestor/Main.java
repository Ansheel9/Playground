class Node:
  def __init__(self, val):
    self.value = val
    self.leftchild = None
    self.rightchild = None
    
  def insert(self, data):
    if self.value == data:
      return False
    elif self.value > data:
      if self.leftchild:
        return self.leftchild.insert(data)
      else:
        self.leftchild = Node(data)
        return True
    else:
      if self.rightchild:
        return self.rightchild.insert(data)
      else:
        self.rightchild = Node(data)
        return True
      
  def find(self, data):
    if self.value == data:
      return True
    elif self.value > data:
      if self.leftchild:
        return self.leftchild.find(data)
      else:
        return -1
    else:
      if self.rightchild:
        return self.rightchild.find(data)
      else:
        return -1
    
class Tree:
  def __init__(self):
    self.root = None
    
  def insert(self, data):
    if self.root:
      return self.root.insert(data)
    else:
      self.root = Node(data)
      return True
    
  def find(self, data):
    if self.root:
      return self.root.find(data)
    else:
      return -1
  
def lca(root, n1, n2):
  if bst.find(n1) == -1:
    return -1
  if bst.find(n2) == -1:
    return -1
  while root:
    if root.value > n1 and root.value > n2:
      root = root.leftchild
    elif root.value < n1 and root.value < n2:
      root = root.rightchild
    else:
      break
  return root.value
    
bst = Tree()
n = int(input())
arr = [int(i) for i in input().split(" ")]
for item in arr:
  bst.insert(item)
inp1, inp2 = input().split(" ")
inp1 = int(inp1)
inp2 = int(inp2)
print(lca(bst.root, inp1, inp2))