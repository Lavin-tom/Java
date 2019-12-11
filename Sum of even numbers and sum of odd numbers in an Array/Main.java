import java.util.*;
class Main
{
  public static void main(String args[])
  {
    int n,sum1=0,sum2=0;
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
        sum1=sum1+arr[i];
      else
        sum2=sum2+arr[i];
    }
    System.out.println("The sum of the even numbers in the array is "+sum1);
    System.out.println("The sum of the odd numbers in the array is "+sum2);
  }
}