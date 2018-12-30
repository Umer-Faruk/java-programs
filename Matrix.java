import java.util.*;
class Matrix
{   int m1[][];
    int m2[][];
    int m3[][];
    Matrix()
    {
         m1= new int[2][2];
        m2=new int[2][2]; 
        m3=new int[2][2];
    }
    Scanner sn=new Scanner(System.in);
    void getm1()//reading matrix1
    {
        System.out.println("enter the mareix 1\n");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
            m1[i][j]=sn.nextInt();
            System.out.print("\t");
            }
            System.out.println("");
        }
     }
  
  
   void getm2()//reading matrix2
    {
        System.out.println("enter the mareix 2\n");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
            m2[i][j]=sn.nextInt();
            System.out.print("\t");
            }
            System.out.println("");
        }
     }
  
  //multipecastion
  
  void multiplay()
  { 
    int sum=0;
    System.out.println("prodoct of m1*m2=\n");
    for(int i=0;i<2;i++)
    {for(int j=0;j<2;j++)
    {
        for(int k=0;k<2;k++)
        {
            sum += m1[i][k] * m2[k][j];
        }
        m3[i][j]=sum;
        sum=0;
    }
    }
    
    
    //display
    for(int i=0;i<2;i++)
    {
    for(int j=0;j<2;j++)
    {
        System.out.print(m3[i][j]+"\t");
    }
    System.out.println();
    }
  }
    
    public static void main(String []args)
    {
        Matrix m=new Matrix();
        m.getm1();
        m.getm2();
        m. multiplay();
    }
}
