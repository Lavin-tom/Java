import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int n,sum=1,flag=0;
      Scanner s=new Scanner(System.in);
      n=s.nextInt();
      for(int i=1;i<n;i++)
      {
        sum=sum*i;
        if(n==sum)
          flag=1;
      }
      if(flag==1)
      System.out.println("Yes");
      else
        System.out.println("No");
    }
}