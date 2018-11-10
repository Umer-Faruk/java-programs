import java.util.Scanner;


class Account
{   public static  Scanner sn=new Scanner(System.in);
    long accon;
    String name;
    long Pho;
    float balance_amt=100;
    
    void getinput()
    {
   
        System.out.println("******enter the user details*****");
        System.out.println("enter the account number");
        
        accon=sn.nextLong();
        
        System.out.println("enter the name of account holder");
        name=sn.next();
        
        System.out.println("enter the phone number");
        Pho=sn.nextLong();
        
        
      
        System.out.println("Thank you\n");
        
    
    }
    
    void Deposit()
    {
        float amt=0;
        float holo=0;
        holo= balance_amt;
    
    System.out.println("enter the deposet amont\n");
    amt=sn.nextInt();
    balance_amt=amt+holo;
    System.out.println("total amont in account ="+balance_amt);
    }
    
    
    void withdrow()
    {
        if( balance_amt>1000)
        {
            float amt=0;
            System.out.println("entert withdrowl amont\n");
            amt=sn.nextInt();
            if(balance_amt>amt)
           { System.out.println(" your account does not have enough balance\n");}
           else
           {
            
            balance_amt=balance_amt-amt;}
            
        }
        else
        {System.out.println("**no sufficent balance sorry**\n");}
    }
    
    void print()
    {
    System.out.println("\n**your detals***");
    System.out.println("name:-\n"+name+"\n account number:-"+accon+"\n phone number:-"+Pho+"\n total balance in your account:-"+balance_amt);
    }
    
    public static void main(String [] args)
    {
        
        Account acc=new Account();
        acc. getinput();
        while(true)
        {
        System.out.println("enter 1:deposit \n 2:withdrow\n3:print\n 4:exit");
        int ch=sn.nextInt();
        
        switch(ch){
        case 1:acc. Deposit();break;
        case 2:acc.withdrow();break;
        case 3:acc.print();break;
        case 4:System.exit(0);}
        }
        
    }
}
