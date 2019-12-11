import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int n,a=0,b=0,c=1,sum,count=3;
      Scanner s=new Scanner(System.in);
      n=s.nextInt();
      System.out.print("0 0 1");
      for(int i=0;i<n;i++)
      {
        sum=a+b+c;
        if(count<n)
        
     System.out.print(" "+sum);
        count++;
        a=b;
        b=c;
        c=sum;
      }
    }
}