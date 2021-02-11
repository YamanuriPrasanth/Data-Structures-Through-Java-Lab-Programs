Write a Java program to implement Circular Linked List.

Aim: To Write a Java program to implement Circular Linked List.
    
Description:

Circular linked list is a linked list in which the last node of the list
contains a pointer to the first node of the list. We can have circular singly
linked list as well as circular doubly linked list.

Program:

import java.util.Scanner;
class MyNode
{
    int data;
    MyNode next;
}
class CircularLinkedList
{
    Scanner s=new Scanner(System.in);
    MyNode head;
    CircularLinkedList()
    {
        head=null;
    }
    void create(int n)
    {
        MyNode temp,last=null;
        for(int i=0;i<n;i++)
        {
            temp=new MyNode();
            temp.data=s.nextInt();
            if(head==null)
            {
                head=last=temp;
                head.next=head;
            }
            else
            {
                last.next=temp;
                temp.next=head;
                last=temp;
            }
        }
    }
    void display()
    {
        MyNode temp;
        for(temp=head;temp.next!=head;temp=temp.next)
            System.out.print(temp.data+"->");
        System.out.println(temp.data);
    }
}
class CircularLinkedListDemo
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        CircularLinkedList c=new CircularLinkedList();
        c.create(s.nextInt());
        c.display();
    }
}

Input and Output:

5
1
2
3
4
5
1->2->3->4->5

