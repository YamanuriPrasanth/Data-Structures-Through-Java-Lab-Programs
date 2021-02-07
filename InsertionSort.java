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