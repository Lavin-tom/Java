import java.util.*;
class Main
{
  public static void main(String args[])
  {
    int n,sum=0;
    Scanner s=new Scanner(System.in);
    n=s.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
      arr[i]=s.nextInt();
    }
    for(int i=0;i<n;i++)
    {
      if(arr[i]%2==0)
        sum=sum+arr[i];
    }
    System.out.print("The sum of the even numbers in the array is "+sum);
  }
}