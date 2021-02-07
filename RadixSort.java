import java.util.*;
class RadixSort
{
    public static void main(String[] args)
    {
        int a[]=new int[20];
        int n;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter n value");
        n=s.nextInt();
        System.out.println("Enter array Elements");
        for(int i=0;i<n;i++)
            a[i]=s.nextInt();
        radixSort(a,n,3);
        System.out.println("after sorting");
        for(int i=0;i<n;i++)
            System.out.println(a[i]);
    }
    static void radixSort(int a[],int n, int dig)
    {
        int div=1,l,i,j,k,p;
        int bucket[][]=new int[10][n];
        int b[]=new int[10];
        for(p=0;p<dig;p++)
        {
            for(i=0;i<10;i++)
                b[i]=0;
            for(i=0;i<n;i++)
            {
                l=((a[i]/div)%10);
                bucket[l][b[l]++]=a[i];
            }
            i=0;
            for(j=0;j<10;j++)
            {
                for(k=0;k<b[j];k++)
                {
                    a[i++]=bucket[j][k];
                }
            }
            div=div*10;
        }
    }
}

