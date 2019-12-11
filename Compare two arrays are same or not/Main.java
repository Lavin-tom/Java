import java.util.*;
class Main
{
  public static void main(String args[])
  {
    int n,count=0;
    Scanner s=new Scanner(System.in);
    n=s.nextInt();
    int arr1[]=new int[n];
    int arr2[]=new int[n];
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
      if(arr1[i]==arr2[i])
        count++;
    }
    if(count==n)
      System.out.print("Yes");
    else
      System.out.print("No");
  }
}