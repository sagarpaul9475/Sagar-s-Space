#include<stdio.h>
#include<stdlib.h>
#define max 3
void push();
void pop();
void pri();
int st[max];
int top=-1;
int main(){
    int ch;
    system("cls");

    while (1)
    {
        printf("\n 1. push");
        printf("\n 2.pull");
        printf("\n 3. print");
        printf("\n 4. exit");
    printf("\nenter the choice");
    scanf("%d",&ch);
    switch (ch)
    {
    case 1:
          push();
        break;
    case 2:
        pop();
    case 3:
        pri();
    case 4:
        exit(0);
    default:
        break;
    }
    }
    return 0;
}
void push(){
    int item;
    system("cls");

    if(top==max-1){
        printf("Stack overflow");
    }
    else{
        top=top+1;
        printf("\n enter the item to insert");
    
    scanf("%d",&item);
    st[top]=item;
    }
}
void pop(){
    int item;
        system("cls");

    if(top==-1){
        printf("Stack underflow");
    }
    else{
        item=st[top];
        printf("\n deleted item is %d",item);
        top--;  
    }
}
    void pri(){
        int i;
        if(top==-1)
        printf("\n Stack is empty\n");
        else
        for(i=top;i>0;i--){
            printf(":%d:\n",st[i]);
        }
    }
