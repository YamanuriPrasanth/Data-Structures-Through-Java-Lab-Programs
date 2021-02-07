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
                while(a[i]<=a[p] && i<last)
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