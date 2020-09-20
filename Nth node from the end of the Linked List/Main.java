#include <iostream>
using namespace std;

class Node{
  public:
  int data;
  Node *next, *prev;
};

void append(Node **headadd, int data)
{
  Node *temp, *newnode;
  temp = *headadd;
  newnode = new Node();
  newnode->prev = NULL;
  newnode->data = data;
  newnode->next = NULL;
  if(*headadd==NULL)
    *headadd = newnode;
  else
  {
    while(temp->next!=NULL)
      temp = temp->next;
    temp->next=newnode;
    newnode->prev=temp;
  }
}

Node *findElement(Node *head, int n)
{
  int count=1, in=0;
  
  while(head->next!=NULL)
  {
    head = head->next;
    count++;
  }
  
  if(n==0 || n>count)
    return NULL;
  else
  {
    if(n==1)
      return head;
    else
    {
      while(head->prev!=NULL)
      {
        if(in==n-1)
          return head;
        else
        {
          head = head->prev;
          in++;
        }
      }
    }
  }
}

int main() 
{
   // Try out your code here
  Node *head = NULL;
  int data, n;
  do{
    cin >> data;
    if(data>0)
      append(&head, data);
  }while(data>0);
  cout << "Enter the nth node:\n";
  cin >> n;
  
  Node *temp = findElement(head, n);
  
  if(temp==NULL)
    cout << "There is no nth node in the list";
  else
    cout << temp->data << " is the nth node element in the list";
  
  return 0;
}