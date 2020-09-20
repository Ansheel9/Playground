class Node():
  def __init__(self, data=None):
    self.data = data
    self.next = None

class LinkedList():
  def __init__(self):
    self.head = None
  
  def append(self, data):
    new_node = Node(data)
    
    if self.head is None:
      self.head = new_node
      return
    
    curr = self.head
    while curr.next:
      curr = curr.next
    curr.next = new_node
  
  def reverse(self, head, k):
    curr = head
    prev = None
    next = None
    count = 0
    
    while count<k and curr:
      next = curr.next
      curr.next = prev
      prev = curr
      curr = next
      count += 1
      
    if next:
      head.next = self.reverse(next, k)
    return prev
  
  def print_list(self):
    curr = self.head
    while curr:
      print(curr.data)
      curr = curr.next
    
llist = LinkedList()

while True:
  item = int(input())
  if item < 0:
    break
  llist.append(item)
n = int(input())
  
llist.head = llist.reverse(llist.head, n)
llist.print_list()