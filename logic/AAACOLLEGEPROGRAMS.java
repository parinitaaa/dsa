package logic;
public class AAACOLLEGEPROGRAMS {
    public static void main(String[] args) {
        System.out.println("hi");
    }
 /*  PROGRAM 1   #include<stdio.h>
#include<stdlib.h>
struct employee
{
    int id;
    char name[20];
    float salary;
};
void main()
{
    struct employee emp[5];
    int n,i,choice;
    printf("enter number of employees\n");
    scanf("%d",&n);
    for(int i=0;i<n;i++)
    {
        printf("enter id\n");
       scanf("%d",&emp[i].id);
       printf("enter name\n");
       scanf("%s",&emp[i].name);
       printf("enter salary\n");
       scanf("%f",&emp[i].salary);
    }
    while(1)
    {
        printf("1.Display, 2.Search, 3.Exit \n");
        scanf("%d",&choice);
        switch(choice)
        {
            case 1: for(i=0;i<n;i++)
            {
                printf("employee id: %d\temployee name:%s\temployee salary is %f\n",emp[i].id,emp[i].name,emp[i].salary);
            }
            break;
            case 2: printf("enter search id\n");
            int search;
            scanf("%d",&search);
            for(i=0;i<n;i++)
            {
                if(search==emp[i].id)
                {
                      printf("employee id: %d\temployee name:%s\temployee salary is %f\n",emp[i].id,emp[i].name,emp[i].salary);
                      break;
                }
            }
            if(i==n)
            {
                printf("nope, not found\n");
            }
            break;
            case 3: exit(0);
        }
    }
}
    */
    // ********************************************************************************************************************************
    /* PROGRAM 2
    #include<stdio.h>
#include<stdlib.h>
#define MAX 3
int top=-1, stack[MAX];
void push()
{
    if(top==MAX-1)
    {
        printf("overflow\n");
        return;
    }
    printf("enter\n");
    int x;
    scanf("%d",&x);
    stack[++top]=x;
}
void pop()
{
     if(top==-1)
    {
        printf("underflow\n");
        return;
    }
    printf("popped element is %d\n", stack[top--]);
    
}
void display()
{
    if(top==-1)
    {
        printf("underflow\n");
        return;
    }
    for(int i=0;i<=top;i++)
    {
        printf("%d\n",stack[i]);
    }
}
void main()
{
    int choice;
    while(1)
    {
    printf("1.PUSH 2.POP 3.DISPLAY 4.EXIT\n");
    scanf("%d",&choice);
    switch(choice)
    {
        case 1: push();
        break;
        case 2: pop();
        break;
        case 3: display();
        break;
        case 4: exit(0);
    }
    
}
}

 */
 // ********************************************************************************************************************************
 /*PROGRAM 5
 #include<stdio.h>
#include<stdlib.h>
#define MAX 5
int f=-1,r=-1,queue[MAX];
void insert()
{
    if(r==MAX-1)
     {
         printf("overflow\n");
         return;
     }
       if(f==-1) 
         f = 0; 
     int x;
     printf("enter: \n");
     scanf("%d",&x);
     queue[++r]=x;
}
void delete()
{
    if(f==-1)
    {
        printf("underflow\n");
        return;
        
    }
         printf("deleted element is %d\n",queue[f++]);
     if(f>r)
    {
        f=r=-1;
        return;
    }

   
}
void display()
{
    int i;
     if(f==-1)
    {
        printf("underflow\n");
    }
    else
    {
    for(i=f;i<=r;i++)
    {
        printf("%d\n",queue[i]);
    }
    }
    
}
void main()
{
    int choice;
    while(1)
    {
        printf("1.insert 2.delete 3.display 4.exit\n");
        scanf("%d",&choice);
        switch(choice)
        {
            case 1: insert();
              break;
            case 2: delete();
              break;
            case 3: display();
              break;
            case 4: exit(0);
        }
    }
} */
// ********************************************************************************************************************************
/* PROGRAM 7
#include<stdio.h>
#include<stdlib.h>
#define SROW 50
#define MROW 20
#define MCOL 20
int main()
{
int mat[MROW][MCOL], sparse[MROW][3];
int mr,mc,sr,s,nzero=0,elem,i,j;
printf("enter number of rows\n");
scanf("%d",&mr);
printf("enter number of columns\n");
scanf("%d",&mc);
printf("enter elements\n");
for(i=0;i<mr;i++)
{
    for(j=0;j<mc;j++)
    {
        scanf("%d",&mat[i][j]);
        if(mat[i][j]!=0)
         nzero++;
    }
}
sr=nzero+1;
sparse[0][0]= mr;
sparse[0][1]= mc;
sparse[0][2]= nzero;
s=1;
for(i=0;i<mr;i++)
{
    for(j=0;j<mc;j++)
    {
        if(mat[i][j]!=0)
        {
            sparse[s][0]=i+1;
            sparse[s][1]=j+1;
            sparse[s][2]=mat[i][j];
            s++;
            
        }
         
    }
}
printf("the sparse matrix:\n");
for(i=0;i<sr;i++)
{
    for(j=0;j<3;j++)
    {
        printf("%d",sparse[i][j]);
         
    }
    printf("\n");
}
printf("enter element\n");
scanf("%d",&elem);
for(i=0;i<sr;i++)
{
    if(elem==sparse[i][2])
    {
     printf("[row],[coloum]=[%d],[%d]\n",sparse[i][0],sparse[i][1]);
     return 0;
    }
}
printf("not found\n");
    return -1;
} */
// ********************************************************************************************************************************
/* PROGRAM 8
#include<stdio.h>
#include<stdlib.h>

#define MAX 5
int insertion(int a[],int item, int n)
{
    int p,c;
    if(n==MAX)
    {
        printf("full\n");
        return n;
    }
    c=n;
    p=(c-1)/2;
    while(c!=0 && item>a[p])
    {
        a[c]=a[p];
        c=p;
        p=(c-1)/2;
    }
    a[c]=item;
    return n+1;
}
void display(int a[], int n)
{
    int i;
    if(n==0)
        printf("empty\n");
        
    else
    {
    for(i=0;i<n;i++)
    {
        printf("%d\t",a[i]);
    }
    printf("\n");
    }
}
void main()
{
    int a[MAX],n=0,item,choice;
    while(1)
    {
        printf("1.insert 2.display 3.exit\n");
        scanf("%d",&choice);
        switch(choice)
        {
            case 1: printf("enter\n");
            scanf("%d",&item);
            n=insertion(a,item,n);
            break;
            case 2: display(a,n);
            break;
            case 3: exit(0);
        }
    }
} */
//******************************************************************************************************************************* 
/* PROGRAM 10
// Online C compiler to run C program online
#include <stdio.h>
#include<stdlib.h>
struct node
{
    int data;
    struct node *left;
    struct node *right;
};
typedef struct node nod;
nod *root=NULL;
void create(int x)
{
    nod *temp,*cur,*prev;
    temp=(nod*)malloc(sizeof(nod));
    temp->data=x;
    temp->right=temp->right=NULL;
    if(root==NULL)
    {
        root=temp;
        return;
    }
    prev=NULL;
    cur=root;
    while(cur!=NULL)
    {
        prev=cur;
        if(x<cur->data)
         cur=cur->left;
         else if(x>cur->data)
         cur=cur->right;
         else
         {
             printf("duplicate");
             return;
         }
    }
    if(x<prev->data)
     prev->left=temp;
     else
     prev->right=temp;
}
void preorder(nod *root)
{
    if(root!=NULL)
    {
        printf("%d\n",root->data);
        preorder(root->left);
        preorder(root->right);
    }
}
void inorder(nod *root)
{
    if(root!=NULL)
    {
        inorder(root->left);
        printf("%d\n",root->data);
        inorder(root->right);
    }
}
void postorder(nod *root)
{
    if(root!=NULL)
    {
        postorder(root->left);
         postorder(root->right);
        printf("%d\n",root->data);
       
    }
}
void main()
{
    int choice,item;
    while(1)
    {
    printf("1.create\n2.Preorder\n3.Inorder\n4.Postorder\n5.exit\n");
    scanf("%d",&choice);
    switch(choice)
    {
        case 1: printf("enter:\n");
         scanf("%d",&item);
         create(item);
         break;
         case 2: preorder(root);
          break;
          case 3: inorder(root);
          break;
          case 4: postorder(root);
          break;
          case 5: exit(0);
          
          
         
    }
    }
}
 */
//******************************************************************************************************************************** */
/*PROGRAM 3
// Online C compiler to run C program online
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include<ctype.h>
int top=-1;
char stack[50];
void push(char x)
{
    stack[++top]=x;
}
char pop()
{
    return stack[top--];
}
int prior(char x)
{
    int p;
    if(x=='#'||x=='(')
     p=1;
     if(x=='+'||x=='-')
     p=2;
     if(x=='*'||x=='/')
     p=3;
     if(x=='^'||x=='$')
     p=4;
     return p;
}
void main()
{
 int i,j=0;
 char infix[50],postfix[50];
printf("enter infix:\n");
scanf("%s",infix);
push('#');
for(i=0;i<strlen(infix);i++)
{
    if(isalnum(infix[i]))
     postfix[j++]=infix[i];
     else if(infix[i]=='(')
      push(infix[i]);
      else if(infix[i]==')')
      {
          while(stack[top]!='(')
           postfix[j++]=pop();
          pop();
          
      }
      else 
      {
          while (prior(infix[i])<=prior(stack[top]))
           postfix[j++]=pop();
           push(infix[i]);
      }
}
while(stack[top]!='#')
postfix[j++]=pop();
postfix[j]='\0';
printf("postfix is %s \t",postfix);
} */
//********************************************************************************************************************************* */
/*PROGRAM 4
#include<stdio.h>
#include<stdlib.h>
#include<ctype.h>
#include<string.h>
#define MAX 20
int top=-1,stack[MAX];
void push(int x)
{
    if(top==MAX-1)
    {
     printf("overflow\n");
     return;
}
    stack[++top]=x;
}
int pop()
{
    if(top==-1)
    {
    printf("underflow\n");
    return -1;
    }
    return (stack[top--]);
}
int op(int op1,int op2, char sym)
{
    switch(sym)
    {
        case '+': return op1+op2;
        case '-': return op1-op2;
        case '*': return op1*op2;
        case '/': return op1/op2;
    }
}
int isdig(char sym)
{
    return(sym>='0'&& sym<='9');
}
void main()
{
    char postfix[30],symbol;
    int i,a,b,res;
    printf("enter postfix\n");
    scanf("%s",postfix);
    for(i=0;i<strlen(postfix);i++)
    { 
         symbol=postfix[i];
        if(isdig(symbol))
         push(symbol-'0');
         else
         {
             a=pop();
             b=pop();
             res=op(b,a,symbol);
             push(res);
         }
    }
    printf("evaluation is %d\n",pop());
    
    
} */
//****************************************************************************************************************************** */
/*PROGRAM 6
// Online C compiler to run C program online
#include <stdio.h>
#include<stdlib.h>
struct node
{
    int data;
    struct node *next;
};
typedef struct node *NODE;
NODE insertfront(NODE first,int item)
{
    NODE temp;
    temp=(NODE)malloc(sizeof(struct node));
    temp->data=item;
    temp->next=first;
    if(first==NULL)
     return temp;
     return temp;
}
NODE insertrear(NODE first,int item)
{
    NODE temp,cur;
     temp=(NODE)malloc(sizeof(struct node));
     temp->data=item;
     temp->next=NULL;
     if(first==NULL)
      return temp;
     cur=first;
     while(cur->next!=0)
      cur=cur->next;
      cur->next=temp;
      return first;
     
}
NODE deletefront(NODE first)
{
    NODE temp;
    if(first==NULL)
    {
        printf("empty!\n");
        return first;
    }
    temp=first;
    temp=temp->next;
    printf("deleted item is %d\n",first->data);
    return temp;
}
NODE deleterear(NODE first)
{
    NODE cur=first,prev=NULL;
    if(first==NULL)
     {
        printf("empty!\n");
        return first;
    }
    while(cur->next!=NULL)
    {
        prev=cur;
        cur=cur->next;
    }
         if (first->next == NULL) {
    printf("Deleted element is %d\n", first->data);
    free(first);
        return NULL;  // Return NULL as the list becomes empty
}
    printf("deleted element is %d\n",cur->data);
    prev->next=NULL;
    return first;
}
void display(NODE first)
{
     NODE temp;
     if(first==NULL)
     {
        printf("empty!\n");
        return;
    }
    temp=first;
    while(temp!=NULL)
    {
    printf("%d\t",temp->data);
    temp=temp->next;
}
    
}
void main()
{
    NODE first=NULL;
    int choice,item;
      printf("MENU\n1)Insert Front\n2)Insert Rear\n3)Delete Front\n4)Delete Rear\n5)Display\n"); 
 while(1) 
 { 
     printf("Enter your choice:\n"); 
     scanf("%d",&choice); 
     switch(choice) 
  { 
      case 1:printf("Enter the item:\n"); 
             scanf ("%d",&item); 
             first=insertfront(first,item);
             break;
     case 2:printf("Enter the item:\n"); 
             scanf ("%d",&item); 
             first=insertrear(first,item);
             break;
     case 3:first=deletefront(first); 
             break; 
      case 4:first=deleterear(first); 
             break; 
      case 5:display(first); 
             break; 
      default:exit(0); 
}
}
} */
//***************************************************************************************************************************** */
/*#include <stdio.h> 
#include <stdlib.h> 
struct node  
{ 
    int data; 
    struct node *left; 
    struct node *right; 
}; 
struct node *first, *cur, *prev, *next,*temp;
void insert(int item)
{
    
    temp=(struct node*)malloc(sizeof(struct node));
    temp->data=item;
    temp->left=NULL;
    temp->right=first;
    if(first!=NULL)
    {
        first->left=temp;
       
    }
    first=temp;
   
}
void delete()
{
  
    int key; 
    printf("Enter the node to be deleted:\n"); 
    scanf("%d",&key); 
    if(first==NULL) //NO ELEMENTS
 { 
     printf("List is empty \n"); 
     return; 
 }
 cur=first; 
 while(cur!=NULL) 
 {
     if(cur->data==key)
     {
         if(cur==first) //FIRST ELEMENT
         {
             first=first->right;
              if (first != NULL) {
                    first->left = NULL;
                }
             printf ("%d node is deleted\n", key);
             free(cur);
             return;
         }
        if(cur->right==NULL) //LAST ELEMENT
      { 
       prev=cur->left; 
       prev->right=NULL; 
       printf("%d node is deleted\n",key); 
    free(cur);
       return;
      }
      prev=cur->left; 
   next=cur->right; 
   prev->right=next; 
   next->left=prev; 
   printf("%d node is deleted\n",key);
   free(cur);
   return;
     }
     cur=cur->right;
         
 }
     printf("Key not found\n"); 
 }
 void display()
 {
     
       if(first==NULL) 
     { 
     printf ("List is empty \n"); 
     return; 
    }
   cur=first;
    while(cur!=NULL)
    {
     printf("%d \n",cur->data); 
     cur = cur->right; 
    }
 }
 void main() 
{  
  
   int ch,item;
    printf("MENU\n1)Insert front\n2)Delete at node\n3)Display\n"); 
    while(1) 
     { 
        printf ("Enter your choice: \n"); 
        scanf ("%d",&ch); 
        switch(ch) 
  { 
      case 1:printf("enter\n");
      scanf("%d",&item);
      insert(item); 
             break; 
    
      case 2:delete(); 
             break; 
      case 3:display(); 
             break; 
      default:exit(0); 
  } 
    }

 
}
     */
//****************************************************************************************************************************** */
}
