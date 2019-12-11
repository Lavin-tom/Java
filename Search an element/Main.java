import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
         int n,n2,flag=0;
      Scanner s=new Scanner(System.in);
      n=s.nextInt();
      int arr1[]= new int[n];
      for(int i=0;i<n;i++)
      {
        arr1[i]=s.nextInt();
      }
      n2=s.nextInt();
      for(int i=0;i<n;i++)
      {
        if(arr1[i] ==n2)
         flag =1;
      } 
      if(flag==1)
          System.out.print(""+n2+" is present in the array");
      else
        System.out.print(""+n2+" is not present in the array");
    }
    }
