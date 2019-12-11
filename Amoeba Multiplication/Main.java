import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int n,n1=0,n2=1,n3;
      Scanner s=new Scanner(System.in);
      n=s.nextInt();
      for(int i=3;i<=25;i++)
      {
        n3=n1+n2;
        if(i==n)
        {
        System.out.println(+n3);
        }
        n1=n2;
        n2=n3;
        
        
        }
      }
    }
