import java.util.*;

abstract class Vhicle 
{
 int year_od_manufactur;
 int no;
 
    Vhicle()
    {
        year_od_manufactur=1985;
        no=1234; 
    }
 
 abstract void getdata(int x);
 abstract void putdata();
 	
}

final class FourWheeler extends Vhicle 
{
       
    void getdata(int x)
    {
        System.out.println("x="+x);
    
    }
    
    void putdata()
    {
        System.out.println("the is from class Four wheeler");
        System.out.println("year="+year_od_manufactur+"no="+no);
    }
}


 class TwoWeeler extends Vhicle 
 {   int year_od_manufactur;
        int no;
     
     
     TwoWeeler(int a,int b)
     {  
        year_od_manufactur=a;
        no=b;
     }
 
    void getdata(int x)
    {
        System.out.println("using super.getthis is from 2_wheeler value="+x);
    }
    
    void putdata()
    {
        System.out.println("this is from class Towvheeler");
        System.out.println("VHicle no="+no+"year="+ year_od_manufactur);
    }
    
  }
 
 
 
 class MYTwoWheeler extends TwoWeeler
 {  int value;
     MYTwoWheeler(int a,int b)
    {
    super(a,b);
    super.getdata(a);//showing this is importent
    value=b;
    }
    
    void show()
    {
        System.out.println("this is from My 2 wheeler value="+value);
    }
} 
   
   
class VHICLE
{
     public static void main(String []args)
    {
        MYTwoWheeler obj=new MYTwoWheeler(1999,542);
                    obj.putdata();
                    obj.show();
        FourWheeler obj1= new FourWheeler();
                    obj1.putdata(); 
                    
     }
   
 }
  
  
  
