import java.util.*;
class PROGRAM7
{   public  String name,education;
   public  int age,salary,basic,da,hra,y_o_ex,no_loans;
    PROGRAM7(String name,String edu,int age,int basic,int loan,int exp)
    {
       this.name=name;
        this.education=edu;
        this.age=age;
        this.basic=basic;
        this.no_loans=loan;
        this.da=5000;
        this.hra=2000;
        this.y_o_ex=exp;
        this.salary=da+hra+basic;
        
    }
    
   void isEligible()
    {
        if (salary>=25000&& no_loans<=3)
        {
            System.out.println("is eligigble for loans\n");
            
        }
        else System.out.println("is not eleigible for loans\n");
    }
    
    void taxpay()
    {
        if(salary<=250000)
        {
            System.out.println("you need not to pay tax\n");
            
        }
        else if(salary>250000 || salary<5000000)
        {
             double tax=(salary/100)*0.5;
             System.out.println("you have to pay "+tax +"Rs as tax\n");
        }
        else {
        double tax=(salary/100)*0.2;
        System.out.println("you hava to pay "+tax+"rs as tax\n");}
    }
    
   void isEligibleProm()
    {
        if(y_o_ex >4)
        {
        System.out.println("he is eligible for promotion\n");
        }else System.out.println("he is not eligible for promotion\n");
    }
    
    void display()
    {
    System.out.println("displaying the details\n");
    System.out.println("name=\n"+name);
    
    }
    
    public static void main(String args[])
    {
        String name, edu;
        int age, basic,loan, exp;
        Scanner sn=new Scanner(System.in);
        System.out.println("enter the number of employees witch you wanto get the details\n");
         int n=sn.nextInt();
         PROGRAM7  p[]=new PROGRAM7[n];
          int count=0;
         while(true)
       {
       
       System.out.println("enter the choice\n2:iseligible for loan\n3:taxpay\n4:promotion\n5:display\n1:enter the details of next employee\n");
       int ch=sn.nextInt();
       switch(ch)
       {
        case 1:if(count==n)
       {
       System.out.println("no more employees can be added\n");
       break;
       }
       else{
        System.out.println("enter the detils of person\n");
        System.out.println("name=");
        name=sn.next();
        System.out.println("age=");
        age=sn.nextInt();
        System.out.println("education=");
        edu=sn.next();
        System.out.println("basic salary");
        basic=sn.nextInt();
        System.out.println("number of loans");
        loan=sn.nextInt();
        System.out.println("year of experiunse");
        exp=sn.nextInt();
        
        p[count]= new PROGRAM7(name, edu,age, basic,loan,exp); 
      count++;
      }break;
        case 2:p[0].isEligible();break;//change the index to get defferant employee details p[0] is first employee details
        case 3:p[0].taxpay();break;
        case 4:p[0].isEligibleProm();break;
        case 5:p[0].display();break;
       }
       }
       
       
    }

}

