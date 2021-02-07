Write a Java program to implement the Insertion sort technique using arrays

Aim : To Write a Java program to implement the Insertion sort technique using arrays

Description:

Insertion sort iterates, consuming one input element each repetition, and growing a sorted
output list. Each iteration, insertion sort removes one element from the input data, finds the
location it belongs within the sorted list, and inserts it there. It repeats until no input elements
remain.



Program:

class InsertionSort
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n,t,i,j;
        int a[]=new int[20];
        System.out.println("Enter array size");
        n=s.nextInt();
        System.out.println("Enter the array Elements");
        for(i=0;i<n;i++)
            a[i]=s.nextInt();
        for(i=1;i<n;i++)
        {
            t=a[i];
            for(j=i-1;j>=0 && t<a[j];j--)
            {
                a[j+1]=a[j];
            }
            a[j+1]=t;
        }
        System.out.println("Elements after sorting are");
        for(i=0;i<n;i++)
            System.out.println(a[i]);
    }
}

Input and Output:

Enter array size
5
Enter the array Elements
5 4 1 2 23
Elements after sorting are
1
2
4
5
23
