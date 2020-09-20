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
      
    
class Tree:
  def __init__(self):
    self.root = None
    
  def insert(self, data):
    if self.root:
      return self.root.insert(data)
    else:
      self.root = Node(data)
      return True
  
def findsmall(root, k):
  stack = []
  while True:
    while root:
      stack.append(root)
      root = root.leftchild
    root = stack.pop()
    k -= 1
    if not k:
      return root.value
    root = root.rightchild
    
bst = Tree()
while True:
  ans = int(input())
  if ans<0:
    break
  bst.insert(ans)
k = int(input("Enter the kth value:"))
print("\nSmallest kth value", findsmall(bst.root, k))