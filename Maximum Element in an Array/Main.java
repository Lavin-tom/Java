import java.util.*;
public class Main {
    public static void main(String args[]) {
      int n,temp;
      Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]<a[j])
                {
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                }
            }
            
        }
            System.out.print(a[0]+ " is the maximum element in the array");
    }
}