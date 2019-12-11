import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int n,count=0;
      Scanner s=new Scanner(System.in);
      n=s.nextInt();
      System.out.println(+n);
       while(n!=1)
       {
        if(n%2==0)
        {
        n=n/2;
        System.out.println(+n);
        }
      //if(n%2==1)
         else
      {
        n=(3*n+1);
       System.out.println(+n); 
      }
         count++;
       }
          System.out.println(+count);  
       }
     
}