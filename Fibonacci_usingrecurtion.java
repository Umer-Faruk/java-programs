import java.util.Scanner;
class Fibonacci_usingrecurtion
{
    public static void main(String[] args)
    {
        Scanner sn=new Scanner(System.in);
        System.out.println("enter the range");
        int rangre=sn.nextInt();
        System.out.println("the febonacci series are");
        
        Fibonacci_usingrecurtion fib=new Fibonacci_usingrecurtion();
        for(int i=0;i <=rangre;i++)
        {
            System.out.println(fib.fibo(i)+"");
        }
    }
    
    int fibo(int range)
    {
        if(range==0||range==1)
        {
        return range;
        
        }
        else return fibo(range-1)+fibo(range-2);
    }
}
