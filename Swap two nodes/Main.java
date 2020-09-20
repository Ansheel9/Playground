#include<iostream>
using namespace std;

struct LLNode
{
  int data;
  struct LLNode* next;
};

void append(struct LLNode **headadd, int data)
{
  struct LLNode *temp, *newnode;
  temp = *headadd;
  newnode = new LLNode();
  newnode->data = data;
  newnode->next = NULL;
  
  if(*headadd == NULL)
    *headadd = newnode;
  else
  {
    while(temp->next != NULL)
      temp = temp->next;
    temp->next = newnode;
  }
}
 
void display(struct LLNode**node)
{
  struct LLNode *temp= *node;
  while(temp!=NULL)
  {
    if(temp->next!=NULL)
      cout<<temp->data<<" ";
    else
      cout<<temp->data;
            
    temp=temp->next; 
  }
  cout<<endl;
}

void swapNodes(struct LLNode **head_ref, int x, int y)
{
  if (x == y)
    return;
   
  struct LLNode *x_prev = NULL, *x_curr = *head_ref;
  while (x_curr && x_curr->data != x)
  {
    x_prev = x_curr;
    x_curr = x_curr->next;
  }
 
  struct LLNode *y_prev = NULL, *y_curr = *head_ref;
  while (y_curr && y_curr->data != y)
  {
    y_prev = y_curr;
    y_curr = y_curr->next;
  }
  
  if (x_curr == NULL || y_curr == NULL)
    return;
  
  if (x_prev != NULL)
    x_prev->next = y_curr;
  else
    *head_ref = y_curr; 
   
  if (y_prev != NULL)
    y_prev->next = x_curr;
  else
    *head_ref = x_curr;
  
  struct LLNode *temp = y_curr->next;
  y_curr->next = x_curr->next;
  x_curr->next  = temp;
}
  
int main() 
{ 
  int data, n, x, y;
  struct LLNode* head = NULL;
  
  cin >> n;
  for(int i=0; i< n; i++)
  {
    cin >> data;
    append(&head, data);
  }
  cin >> x;
  cin >> y;
  
  swapNodes(&head,x,y);
  
  display(&head);
}