import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       int n,p,t,se;
      Scanner s=new Scanner(System.in);
      n=s.nextInt();
      p=n*n;
      if(p>99)
      {
        t=p%10;
        se=p/10;
        if( (t+se)==n)
          System.out.println("Kaprekar Number");
        else
          System.out.println("Not A Kaprekar Number");
      }
      if(p<100)
      {
        t=p%10;
        se=p/10;
        if( (t+se)==n)
          System.out.println("Kaprekar Number");
        else
          System.out.println("Not A Kaprekar Number");
      }
      
    }
}