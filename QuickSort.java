Write a Java program to implement the Quick sort technique using arrays

Aim:To Write a Java program to implement the Quick sort technique using arrays

Description:

Quicksort is a divide and conquer algorithm. Quicksort first divides a large array into two
smaller sub-arrays: the low elements and the high elements. Quicksort can then recursively sort
the sub-arrays.
    
Program:    

import java.util.*;
class QuickSort
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n;
        int a[]=new int[20];
        System.out.println("Enter array size");
        n=s.nextInt();
        System.out.println("Enter the array elements");
        for(int i=0;i<n;i++)
            a[i]=s.nextInt();
        quickSort(a,0,n-1);
        System.out.println("Elements after sorting are");
        for(int i=0;i<n;i++)
            System.out.println(a[i]);

    }
    static void quickSort(int a[],int first,int last)
    {
        if(first<last)
        {
            int i=first,t;
            int j=last;
            int p=first;
            while(i<j)
            {
                while(a[i]<=a[p] && i<j)
                    i++;
                while(a[j]>a[p])
                    j--;
                if(i<j)
                {
                    t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }

            }
            t=a[j];
            a[j]=a[p];
            a[p]=t;
            quickSort(a,0,j-1);
            quickSort(a,j+1,last);
        }
    }
}

Input and Output:

Enter array size
5
Enter the array elements
5 4 3 2 1
Elements after sorting are
1
2
3
4
5
