import java.util.Scanner;

class matrixxx
{
       
        
    
    public static void main(String [] args)
    {   Scanner sn=new Scanner(System.in);
        int r,c;
        int sr,sc;
        
        System.out.println("matrix");
        System.out.println("matrix 1=>");
        System.out.println("enter the row of mateix");
        r=sn.nextInt();
        System.out.println("enter the colum of matrix");
        c=sn.nextInt();
        System.out.println("enter the  elements of "+r+"*"+c+ " matrix");
        
        //scanning the 1st matrix
        int firmtx[][]= new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                    firmtx[i][j]= sn.nextInt();       
            }
        }
        
        //displaying the first matrix
        
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                    System.out.print(""+firmtx[i][j]+"\t");      
            }
            System.out.println();
        }
        
        // 2nd matrix
        System.out.println("matrix 2=>");
        System.out.println("enter the row of mateix");
        sr=sn.nextInt();
        System.out.println("enter the colum of matrix");
        sc=sn.nextInt();
        if(c!=sr)
         System.out.println("The matrices can't be multiplied with each other.");
         else{
              System.out.println("enter the  elements of "+sr+"*"+sc+ " matrix");
                
              //scanning the 2nd matrix
              int secmtx[][]= new int[sr][sc];
                for(int i=0;i<sr;i++)
                {
                    for(int j=0;j<sc;j++)
                    {
                            secmtx[i][j]= sn.nextInt();       
                    }
                }
                
                //displaying the second matrix
                
                 for(int i=0;i<sr;i++)
                {
                    for(int j=0;j<sc;j++)
                    {
                            System.out.print(""+secmtx[i][j]+"\t");      
                    }
                    System.out.println();
                }
        
          // multiplication
            int multiply[][] = new int[r][c];
            int sum=0;
            for(int i=0;i<r;i++)
            {
                for(int j=0;j<sc;j++)
                {
                    for(int k=0;k<sr;k++)
                    {
                        sum=sum + firmtx[i][k]*secmtx[k][j];
                    }
                    multiply[i][j] = sum;
                         sum = 0;
                }
            }
            
             System.out.println("Product of the matrices:");

                 for (int i=0;i<r;i++)
                 {
                     for (int j=0;j<sc;j++)
                     {
                     System.out.print(""+multiply[i][j]+"\t");
                     
                     }

                     System.out.println();
                     
                 
                }
                
        }
        
}
}


