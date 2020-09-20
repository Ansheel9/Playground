class Stack():
  def __init__(self):
    self.items = []
  
  def push(self, key):
    self.items.append(key)
  
  def pop(self):
    return self.items.pop()
  
  def is_empty(self):
    return self.items == []
    
  def peek(self):
    if not self.is_empty:
      return self.items[-1]
  
def redundant(express):
  a, b = 0, 0
  for i in range(len(express)):
    if express[i] == '(' and express[i+2] == ')':
      return True
    if express[i] == '+' or express[i] == '-' or express[i] == '*' or express[i] == '/':
      a += 1
    if express[i] == '(':
      b += 1
  if b > a:
    return True
  
  return False

string = input()
 
if redundant(string):
  print("Yes")
else:
  print("No")