Write a java program to implement the Binary search technique using arrays

Aim:To Write a java program to implement the Binary search technique using arrays

Description:Binary search looks for searching element by comparing the middle element of the Array. If a
match occurs, then the index of item is returned. Else If the middle element is greater than the
searching element, then the item is searched in the sub-array to the left of the middle item.
Otherwise, the item is searched in the sub-array to the right of the middle item. This process
continues on the sub-array as well until the size of the sub-array reduces to zero.

Program:

import java.util.*;
class BinarySearch
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int a[] = new int[20];
        int n,se,flag=0;
        System.out.println("Enter the size of sorted array");
        n = s.nextInt();
        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++)
            a[i]=s.nextInt();
        System.out.println("Enter the search element");
        se=s.nextInt();
        int low=0;
        int high=a.length-1;
        while(low<=high)
        {
            int mid;
            mid=(low+high)/2;
            if(a[mid]<se)
                low=mid+1;
            else if(a[mid]>se)
                high=mid-1;
            else if(a[mid]==se)
            {
                flag=1;
                System.out.println("The search element is found at " + mid);
                break;
            }

        }
        if(flag==0)
            System.out.println("The search element is not found");
    }
}

Input and Output:

Enter the size of sorted array
10
Enter the elements of array
1 2 3 4 5 6 7 8 9 10
Enter the search element
5
The search element is found at 4

