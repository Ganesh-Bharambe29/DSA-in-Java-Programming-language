import java.util.*;
public class Flights 
{
    public static void bubbleSort(int A[])
    {
        int temp=0;
        for(int k=0;k<A.length;k++)
        {
            for(int j=k+1;j<A.length;j++)
            {
                if(A[k]>A[j])
                {
                    temp=A[k];
                    A[k]=A[j];
                    A[j]=temp;
                }
            }
        }
    }

    public static int binarySearch(int A[],int left,int right,int x)
    {
        bubbleSort(A);
        int mid=0;
        while(left<=right)
        {
             mid=(left+right)/2;
             if(A[mid]==x)
             {
                return mid;
             }
             else if(A[mid]>x)
             {
                right=mid-1;
             }
             else
             {
                left=mid+1;
             }
        }
        return -1;
    }


    public static void main(String s[])
    {

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of Students:");
        int size=sc.nextInt();
        int A[]=new int[size];
        System.out.println("Enter Flight Numbers:");
        
         for(int i=0;i<A.length;i++)
        {   
            A[i]=sc.nextInt();
        }
           
        System.out.println("Entered Flight Numbers is:");
        {
            for(int i=0;i<A.length;i++)
            {
                System.out.print(A[i]+"\t");
            }
            System.out.println("\n");
        }

        int n=A.length;
        System.out.println("Enter the Element to found:");
        int x=sc.nextInt();

        int result=binarySearch(A,0,n-1,x);
        
        if(result==-1)
        {
            System.out.println("THe Flight Number is not found:"+x);
        }
        else
        {
            System.out.println(" The Flight Number is found:"+x);
        }

    }

}

