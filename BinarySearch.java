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
        System.out.println("Enter the elemnts of array");
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
