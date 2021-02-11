Implement Java code for polynomial representation, addition, subtraction & multiplication. 
    
Aim: To Implement Java code for polynomial representation, addition, subtraction & multiplication.

Description : A node of the linked list will represent each term. A node will have 3 fields, which
represent the coefficient and exponent of a term and a pointer to the next term 

Program:

import java.util.*;
class  MyNode
{
    int c,e;
    MyNode next;
}
class MyLinkedList
{
    Scanner s=new Scanner(System.in);
    MyNode head,last;
    MyLinkedList()
    {
        head=last=null;
    }
    void create(int n)
    {
        MyNode temp;
        for(int i=0;i<n;i++)
        {
            temp=new MyNode();
            System.out.println("enter coefficient and exponent");
            temp.c=s.nextInt();
            temp.e=s.nextInt();
            temp.next=null;
            if(head==null)
                head=last=temp;
            else
            {
                last.next=temp;
                last=temp;
            }
        }
    }
    void add(MyLinkedList p1, MyLinkedList p2)
    {
        MyNode temp1=p1.head;
        MyNode temp2=p2.head;
        MyNode temp3;
        while(temp1!=null && temp2!=null)
        {
            temp3=new MyNode();
            if(temp1.e==temp2.e)
            {
                temp3.c=temp1.c+temp2.c;
                temp3.e=temp1.e;
                temp3.next=null;
                temp1=temp1.next;
                temp2=temp2.next;
            }
            else if(temp1.e>temp2.e)
            {
                temp3.c=temp1.c;
                temp3.e=temp1.e;
                temp3.next=null;
                temp1=temp1.next;
            }
            else
            {
                temp3.c=temp2.c;
                temp3.e=temp2.e;
                temp3.next=null;
                temp2=temp2.next;
            }
            if(head==null)
                head=last=temp3;
            else
            {
                last.next=temp3;
                last=temp3;
            }
        }
        while(temp1!=null)
        {
            temp3=new MyNode();
            temp3.c=temp1.c;
            temp3.e=temp1.e;
            temp3.next=null;
            last.next=temp3;
            last=temp3;
            temp1=temp1.next;
        }
        while(temp2!=null)
        {
            temp3=new MyNode();
            temp3.c=temp2.c;
            temp3.e=temp2.e;
            temp3.next=null;
            last.next=temp3;
            last=temp3;
            temp2=temp2.next;
        }
    }
    void sub(MyLinkedList p1, MyLinkedList p2)
    {
        MyNode temp1=p1.head;
        MyNode temp2=p2.head;
        MyNode temp3;
        while(temp1!=null && temp2!=null)
        {
            temp3=new MyNode();
            if(temp1.e==temp2.e)
            {
                temp3.c=temp1.c-temp2.c;
                temp3.e=temp1.e;
                temp3.next=null;
                temp1=temp1.next;
                temp2=temp2.next;
            }
            else if(temp1.e>temp2.e)
            {
                temp3.c=temp1.c;
                temp3.e=temp1.e;
                temp3.next=null;
                temp1=temp1.next;
            }
            else
            {
                temp3.c=temp2.c;
                temp3.e=temp2.e;
                temp3.next=null;
                temp2=temp2.next;
            }
            if(head==null)
                head=last=temp3;
            else
            {
                last.next=temp3;
                last=temp3;
            }
        }
        while(temp1!=null)
        {
            temp3=new MyNode();
            temp3.c=temp1.c;
            temp3.e=temp1.e;
            temp3.next=null;
            last.next=temp3;
            last=temp3;
            temp1=temp1.next;
        }
        while(temp2!=null)
        {
            temp3=new MyNode();
            temp3.c=temp2.c;
            temp3.e=temp2.e;
            temp3.next=null;
            last.next=temp3;
            last=temp3;
            temp2=temp2.next;
        }
    }
    void mul(MyLinkedList p1, MyLinkedList p2)
    {
        MyNode temp1=p1.head;
        MyNode temp2;
        MyNode temp3;
        while(temp1!=null)
        {
            temp2=p2.head;
            while(temp2!=null)
            {
                temp3=new MyNode();
                temp3.c=temp1.c*temp2.c;
                temp3.e=temp1.e+temp2.e;
                temp3.next=null;
                if(head==null)
                    head=last=temp3;
                else
                {
                    last.next=temp3;
                    last=temp3;
                }
                temp2=temp2.next;
            }
            temp1=temp1.next;
        }
        temp1=head;
        while(temp1!=null)
        {
            temp2=temp1;
            temp3=temp1.next;
            while(temp3!=null)
            {
                if(temp1.e==temp3.e)
                {
                    temp1.c=temp1.c+temp3.c;
                    temp2.next=temp3.next;
                    temp3=temp2.next;
                }
                else
                {
                    temp2=temp3;
                    temp3=temp3.next;
                }
            }
            temp1=temp1.next;
        }
    }
    void display()
    {
        MyNode temp;
        for(temp=head;temp!=null;temp=temp.next)
        {
            if(temp.next!=null)
                System.out.print(temp.c+"x^"+temp.e+"+");
            else
                System.out.println(temp.c+"x^"+temp.e);
        }
    }
}
class Poly
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        MyLinkedList p1=new MyLinkedList();
        MyLinkedList p2=new MyLinkedList();
        MyLinkedList p3=new MyLinkedList();
        MyLinkedList p4=new MyLinkedList();
        MyLinkedList p5=new MyLinkedList();
        System.out.println("enter no.of terms in the polynomial equation1");
        p1.create(s.nextInt());
        System.out.println("enter no.of terms in the polynomial equation2");
        p2.create(s.nextInt());
        p1.display();
        p2.display();
        p3.add(p1,p2);
        p3.display();
        p4.sub(p1,p2);
        p4.display();
        p5.mul(p1,p2);
        p5.display();
    }
}

Input and Output:

enter no.of terms in the polynomial equation1
2
enter coefficient and exponent
10 2
enter coefficient and exponent
5 1
enter no.of terms in the polynomial equation2
2
enter coefficient and exponent
5 2
enter coefficient and exponent
2 1
10x^2+5x^1
5x^2+2x^1
15x^2+7x^1
5x^2+3x^1
50x^4+45x^3+10x^2

