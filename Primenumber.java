import java.util.Scanner;
class Primenumber{
public static void main(String[] args)
{
    int number;
    Scanner sn=new Scanner(System.in);
    System.out.println("enter the number to check its prime are not");
    number=sn.nextInt();
    Primenumber pr=new Primenumber();
    int flag=pr.prim(number);
    if(flag!=0)
    System.out.println("number"+number+"is prim number!!");
    else 
    System.out.println("number"+number+"is not prim number");
    
    
}

int prim(int number)
{int flag=0;
int m=number/2;

if(number==0||number==1)
{return 0;}//than its not prim
 
 
 else
    {
        for(int i=2;i<=m;i++)
        {
            if(number%i==0)
              flag=1;
              
        }
       // than its not prime
    }
    
   if(flag==1)
    return 0;
    else
    return 1;

}

}
