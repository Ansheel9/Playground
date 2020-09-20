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
  
def is_match(top, paren):
  if top == "(" and paren == ")":
    return True
  elif top == "{" and paren == "}":
    return True
  elif top == "[" and paren == "]":
    return True
  else:
    return False
  
def is_balanced(string):
  s = Stack()
  is_balanced = True
  index = 0
  
  while index<len(string) and is_balanced:
    paren = string[index]
    if paren in "({[":
      s.push(paren)
    else:
      if s.is_empty():
        is_balanced = False
      else:
        top = s.pop()
        if not is_match(top, paren):
          is_balanced = False
    index += 1
    
  if s.is_empty() and is_balanced:
    return True
  else:
    return False

string = input()
if is_balanced(string):
  print("Balanced")
else:
  print("Not Balanced")