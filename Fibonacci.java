import java.util.Scanner;
class Fibonacci
{
    public static void main(String[] args)
    {
        System.out.println("program for fibonacci series");
        int a=0,b=0,c=1,n;
        Scanner sn= new Scanner(System.in);
        System.out.println("enter the number");
        n=sn.nextInt();
        System.out.println("the fibonacci series is=");
        for(int i=1;i<=n;i++)
        {   
            a=b;
            b=c;
            c=a+b;
            System.out.println(a+"");
        }
        
        
    }
}
