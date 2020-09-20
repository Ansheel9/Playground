class Stack():
  def __init__(self, n):
    self.capacity = n
    self.items = [None]*n
    self.top1 = -1
    self.top2 = n
  
  def push1(self, key):
    if self.top1 + 1 == self.top2:
      print("Stack overflow")
      exit(-1)
    self.top1 = self.top1 + 1
    self.items[self.top1] = key
    
  def push2(self, key):
    if self.top1 + 1 == self.top2:
      print("Stack overflow")
      exit(-1)
    self.top2 = self.top2 - 1
    self.items[self.top2] = key
  
  def pop1(self):
    if self.top1 < 0:
      return -1
    top = self.items[self.top1]
    self.top1 = self.top1 - 1
    return top
  
  def pop2(self):
    if self.top2 >= self.capacity:
      return -1
    top = self.items[self.top2]
    self.top2 = self.top2 + 1
    return top
  
  def print1(self):
    #if self.top1 < 0:
    #  print("\t")
    while self.top1 >= 0:
      print(self.items[self.top1], end=" ")
      self.top1 = self.top1 - 1
    print(" ")
      
  def print2(self):
    #if self.top2 >= self.capacity:
    #  print("\t")
    while self.top2 < self.capacity:
      print(self.items[self.top2], end=" ")
      self.top2 = self.top2 + 1
    print(" ")
  
s = Stack(1000)
n1 = int(input())
arr1 = [int(z) for z in input().split()]
for i in arr1:
  s.push1(i)
n2 = int(input())
arr2 = [int(z) for z in input().split()]
for i in arr2:
  s.push2(i)
k1 = int(input())
k2 = int(input())

print("Stack 1 Elements:")
for i in reversed(arr1):
  print(i, end=" ")
print(" ")
print("Stack 2 Elements:")
for i in reversed(arr2):
  print(i, end=" ")
print(" ")
for j in range(k1):
  top1 = s.pop1()
  if top1 < 0:
    print("Stack underflow. pop from stack 1 failed")
    break
for j in range(k2):
  top2 = s.pop2()
  if top2 < 0:
    print("Stack underflow. pop from stack 2 failed")
    break
print("Stack 1 Elements:")
s.print1()
print("Stack 2 Elements:")
s.print2()