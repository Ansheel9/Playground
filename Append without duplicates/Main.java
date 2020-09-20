#include<iostream>
using namespace std;

struct node{
  int data;
  node *next, *prev;
};

void append(node **headadd, int data)
{
  node *temp, *newnode;
  temp = *headadd;
  newnode = new node();
  newnode->prev = NULL;
  newnode->data = data;
  newnode->next = NULL;
  
  if(*headadd == NULL)
    *headadd = newnode;
  else
  {
    while(temp->next != NULL)
      temp = temp->next;
    temp->next = newnode;
    newnode->prev = temp;
  }
}

int isduplicate(node **head, int data)
{
  int count=0;
  node *temp;
  temp = *head;
  if(*head == NULL)
    return 1;
  else
  {
    while(temp != NULL)
    {
      if(temp->data == data)
        count++;
      temp = temp->next;
    }
  }
  if(count==0)
    return 1;
  else
    return 0;
}

void printlist(node *head)
{
  while(head != NULL)
  {
    cout << head->data << "\n";
    head = head->next;
  }
}

int main() 
{
   // Try out your code here
  int data, ans;
  node *head = NULL;
 
  do{
    cin >> data;
    if(data>0)
      if(isduplicate(&head, data))
        append(&head, data);
  }while(data>0);
  
  if(head != NULL)
    printlist(head);
  else
    cout << "List is empty";
  
  return 0;
}