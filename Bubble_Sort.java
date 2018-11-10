
import java.util.Scanner;

class Bubble_Sort
{
    public static void main(String[] args)
    {
        System.out.println("enter number of elements");
        Scanner sn=new Scanner(System.in);
        int num=sn.nextInt();
        
        int arr[]=new int[num];
        System.out.println("enterr the "+num+ " elements in unsorted ordar");
        for(int i=0;i<num;i++)
        {
            arr[i]=sn.nextInt();
        }
       //sorting
       
        for(int i=0;i<num-1;i++)
        {
            for(int j=0;j<num-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        
        //displaying
        
        System.out.println("the sorted list is");
        for(int i=0;i<num;i++)
        System.out.print("  "+arr[i]);
     
    }
    
    
    
               
        
   
}

