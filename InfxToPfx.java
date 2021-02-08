Write a Java program to Convert infix expression to postfix expression 

Aim:To Write a Java program to Convert infix expression to postfix expression 

Description:

In normal algebra we use the infix notation like a+b*c. The corresponding postfix notation is abc*+. The algorithm for the conversion is as follows : 
•	Scan the Infix string from left to right. 
•	Initialize an empty stack. 
•	If the scanned character is an operand, add it to the Postfix string. 
•	If the scanned character is an operator and if the stack is empty Push the character to stack. 
•	If the scanned character is an Operator and the stack is not empty, compare the precedence of the character with the element on top of the stack (topStack).
–	 If topStack has lower precedence over the scanned character Push the scanned character to stack. 
–	Else(higher or equal precedence) Pop the stack and add it to the postix string. Repeat this step as long as stack is not empty and topStack has less precedence
over the character. 
•	If a left parenthesis is encountered, push it onto Stack. 
•	If a right parenthesis is encountered ,then: 
•	Repeatedly pop from Stack and add to postfix string until  left parenthesis is encountered. 
•	Remove the left Parenthesis. 
•	Repeat this step till all the characters are scanned. 
•	If stack is not empty Pop the stack and add it to postfix string 
•	Repeat this step as long as stack is not empty. 
•	Return the Postfix string. 


Program:

import java.util.*;
class  Stack1
{
    char stk[]=new char[20];
    int top=-1;
    void push(char c)
    {
        stk[++top]=c;
    }
    char pop()
    {
        return stk[top--];
    }
    char peek()
    {
        return stk[top];
    }
    boolean isEmpty()
    {
        if(top==-1)
            return true;
        else
            return false;
    }
}
class InfxToPfx
{
    public static void main(String[] args)
    {
        Stack1 x=new Stack1();
        Scanner s=new Scanner(System.in);
        String infx;
        String pfx="";
        System.out.println("enter the infix string!");
        infx=s.nextLine();
        for(int i=0;i<infx.length();i++)
        {
            if (Character.isLetter(infx.charAt(i)))
            {
                pfx=pfx+infx.charAt(i);
            }
            else if (infx.charAt(i)=='(')
            {
                x.push('(');
            }
            else if(infx.charAt(i)==')')
            {
                char y;
                while((y=x.pop())!='(')
                    pfx=pfx+y;
            }
            else
            {
                if(x.isEmpty() || precedence(x.peek())<precedence(infx.charAt(i)))
                    x.push(infx.charAt(i));
                else
                {
                    while( !x.isEmpty()&&precedence(x.peek())>=precedence(infx.charAt(i)))
                        pfx=pfx+x.pop();
                    x.push(infx.charAt(i));
                }
            }
        }
        while(!x.isEmpty())
        {
            pfx=pfx+x.pop();
        }
        System.out.println(pfx);
    }
    static int precedence(char ch)
    {
        switch(ch)
        {
            case '(': return 1;
            case '+':
            case '-': return 2;
            case '*':
            case '/':
            case '%': return 3;
            case '^': return 4;
        }
        return -1;
    }
}

Input and Output:

enter the infix string!
a-(b+c*d)/e
abcd*+e/-

