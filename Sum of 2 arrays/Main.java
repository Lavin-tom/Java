import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int n;
      Scanner s=new Scanner(System.in);
      n=s.nextInt();
      int arr1[]= new int[n];
      int arr2[]=new int[n];
      int sum[]=new int[n];
      for(int i=0;i<n;i++)
      {
        arr1[i]=s.nextInt();
      }
      for(int i=0;i<n;i++)
      {
        arr2[i]=s.nextInt();
      }
      for(int i=0;i<n;i++)
      {
        sum[i]=arr1[i]+arr2[i];
        System.out.println(sum[i]);
      }
    }
}