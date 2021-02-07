Write a Java program to Implement stack using arrays.

Aim:To Write a Java program to Implement stack using arrays.

Description:

The stack is a data structure that is very frequently used in
computing as a kind of temporary storage.  It is a list of
elements to which additions and deletions can only be made at one end-the top. 

Program:    

import java.util.*;
class stackN
{
    int top=-1,max;
    Scanner s=new Scanner(System.in);
    int stk[];
    stackN()
    {
        System.out.println("Enter max");
        max=s.nextInt();
        stk=new int[max];
    }
    void push(int e)
    {
        if(!isFull())
            stk[++top]=e;
        else
            System.out.println("stackoverflow");

    }
    void pop()
    {
        if(!isEmpty())
            System.out.println("The which is deleted from the stack is"+stk[top--]);
        else
            System.out.println("stackunderflow");

    }
    int peek()
    {
        if(!isEmpty())
            return stk[top];
        else
            return -1;

    }
    boolean isEmpty()
    {
        if(top==-1)
            return true;
        else
            return false;
    }
    boolean isFull()
    {
        if(top==max-1)
            return true;
        else
            return false;

    }
    void display()
    {
        for(int i=top;i>=0;i--)
        {
            System.out.println(stk[i]);
        }
    }
}
class StackDemo
{
    public static void main(String[] args)
    {
        stackN x=new stackN();
        Scanner s=new Scanner(System.in);
        int ch;
        while(true)
        {
            System.out.println("Enter your choice");
            ch=s.nextInt();

            switch(ch)
            {
                case 1:x.push(s.nextInt());
                break;
                case 2:x.pop();
                break;
                case 3:System.out.println(x.peek());
                break;
                case 4:x.display();
                break;
                default:return;

            }

        }
    }

}

Input and Output:

enter max
5
enter your choice
1
1
enter your choice
1
2
enter your choice
1
3
enter your choice
4
3
2
1
enter your choice
2
the element which is deleted from the stack is 3
enter your choice
3
2
enter your choice
10
