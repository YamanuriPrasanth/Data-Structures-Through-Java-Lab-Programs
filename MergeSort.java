import java.util.*;
class MergeSort
{
    public static void main(String[] args)
    {
        int a[] = new int[20];
        Scanner s = new Scanner(System.in);
        int n;
        System.out.println("enter n value");
        n = s.nextInt();
        System.out.println("enter the array elements");
        for (int i = 0; i < n; i++)
            a[i] = s.nextInt();
        mergeSort(a, 0, n - 1);
        System.out.println("elements ater sorting are");
        for (int i = 0; i < n; i++)
            System.out.println(a[i]);
    }

    static void mergeSort(int a[], int first, int last)
    {
        int mid;
        if (first < last)
        {
            mid = (first + last) / 2;
            mergeSort(a, first, mid);
            mergeSort(a, mid + 1, last);
            merge(a, first, mid, last);
        }
    }

    static void merge(int a[], int first, int mid, int last) 
    {
        int b[] = new int[20];
        int i, j, k;
        i = first;
        j = mid + 1;
        k = first;
        while (i <= mid && j <= last) 
        {
            if (a[i] <= a[j])
            {
                b[k] = a[i];
                i++;
            }
            else 
            {    
                b[k] = a[j];
                j++;
            }
            k++;
        }
        while (i <= mid)
            b[k++] = a[i++];
        while (j <= last)
            b[k++] = a[j++];
        for (i = first; i <= last; i++)
            a[i] = b[i];
    }
}
