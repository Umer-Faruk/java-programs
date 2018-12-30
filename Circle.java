import java.util.*;
import java.lang.*;

class circle
{
    //final double PI= 3.142;
    double radius;

    circle()
    {
        radius=0;
    }
    
    void getradius(double r)
    {
        radius=r;
    }
    
    double Area()
    {
        return Math.PI *Math.pow(radius,2);
    }
    
        
}

class Sector extends circle
{   double ang,r=0;
    Sector(double a ,double r)
    {
        ang=a;
      //  System.out.println("angle="+ang);
       this.r=r;
      //  System.out.println("radius="+r);
        
    }
    
    double Area_of_sector()
    {  
        //System.out.println("radius="+r);
         double a=Math.pow(r,2);
        return (a*r*0.5);
    }
    
}

class Segment extends circle
{   double len,r;
    Segment(double l,double r)
    {
        len=l;
       this.r=r;
    
    }
    
    double Area_of_segment()
    {
        double a= r*r;
        System.out.println("a="+a);
        double b=(r-len)/r;
        System.out.println("b="+b);
        double c=r-len;
        System.out.println("c="+c);
        double d=2*r*len-Math.pow(len,2);
        System.out.println("d="+d);
        
        return a*Math.pow((b-c*d),0.5);
        
    }
}

class Circle
{
    public static void main(String []args)
    {   Scanner sn=new Scanner(System.in);
        System.out.println("enter the radius\n");
            double r=sn.nextInt();
         circle c = new circle ();
                c.getradius(r);
            System.out.println("area of circle="+c.Area());
            System.out.println("enter the angle\n");
            
            double a=sn.nextDouble();
           System.out.println("enter the radius\n");
             r=sn.nextDouble();
                
        Sector s=new Sector(a,r);
        System.out.println("area if sector="+s.Area_of_sector());
        
        System.out.println("enter the length\n");
            
            double l=sn.nextDouble();
           System.out.println("enter the radius\n");
             r=sn.nextDouble();
        Segment sg=new Segment(l,r);
        System.out.println("area if sector="+sg.Area_of_segment());
        
    }
}
