/******************************************************************************

                           STACK IMPLEMENTATION

*******************************************************************************/

#include <stdio.h>
int top=-1;
int stack[8];
int MAXSIZE=8;

//let's check if stack is empty
int isempty(){
    if(top==-1)
        return 1;
    else
        return 0;
}
//let's check if stack is full
int isfull(){
    if(top==MAXSIZE)
        return 1;
    else
        return 0;
}

//fun to push an eleemnt using push()
int push(int data){
    if(!isfull()){
        top=top+1;
        stack[top]=data;
    }
    else{
        printf("Stack is full, can't push anything");
    }
}

//fun to pop an element using pop()
int pop(){
    int data;
    if(!isempty()){
        data=stack[top];
        top=top-1;
        return data;
    }
    else{
        printf("Stack is empty, can't delete anything");
    }
}


//function to retrieve the top element using peek()
int peek(){
    return stack[top];
}



int main()
{
    push(350);
    push(135);
    push(305);
    push(1235);
    push(35);
    printf("Element at the top : %d \n",peek());
    
    printf("The elements are \n");
    while(!isempty()){
        int data=pop();
        printf("%d ", data);
    }

    return 0;
}
