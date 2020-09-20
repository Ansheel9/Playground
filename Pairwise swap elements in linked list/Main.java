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
  
  def pair_swap(self):
    curr = self.head
    
    if not curr:
      print( "List is empty")
      return
    if not curr.next:
      return
    
    while curr and curr.next:
      curr.data, curr.next.data = curr.next.data, curr.data
      curr = curr.next.next
  
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
  
llist.pair_swap()
llist.print_list()