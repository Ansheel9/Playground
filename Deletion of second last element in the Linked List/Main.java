#include <iostream>
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

int deletesec(node **headadd)
{
  int count=0;
  node *temp, *temp1, *temp2;
  temp = *headadd;
  
  if(temp->next == NULL)
    return 0;
  else
  {
  	while(temp->next != NULL)
  	{
      temp = temp->next;
      count++;
  	}
    if(count==1)
    {
      temp1 = temp->prev;
      temp->prev = NULL;
      temp1->next = NULL;
      free(temp1);
      *headadd = temp;
    }
    else
    {
      temp1 = temp->prev;
      temp2 = temp1->prev;
      temp2->next = temp;
      temp->prev = temp2;
      temp1->next = NULL;
      temp1->prev = NULL;
      free(temp1);
    }
  }
  return 1;
}

void printlist(node *head)
{
  while(head != NULL)
  {
    cout << head->data << " ";
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
      append(&head, data);
  }while(data>0);
  
  if(head != NULL)
  {
    if(deletesec(&head))
      printlist(head);
    else
      cout << "Deletion of second last element is not possible";
  }
  else
    cout << "Deletion of second last element is not possible";
  
  return 0;
}