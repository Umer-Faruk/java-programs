import java.util.Scanner;

class Stack
{
    int top,item,size,arry[];
    Stack(int n) //constructor
    {
        size=n;
         arry=new int[size];
        top=-1;
    }
    
    void push(int item,int size)
    {
        if(top== size-1)
        {System.out.println("stack is full");
        }
        else
        {
            top++;
            arry[top]=item;
        }
    }
    
    void pop()
    {
        if(top==-1)
        {System.out.println("stack is empty");}
        else
        {
            int ditem=arry[top];
            top--;
            System.out.println(ditem+"is deleted from stack");
        }
    }
    
    void display()
    {
        if(top==-1)
        {System.out.println("stack is emptey");}
        else
        {
            System.out.println("the element in the stcak are=");
            
           for(int i=top;i>=0;i--)
        {
        System.out.println(""+arry[i]);
        }
        }
    }
   
 }
 class StackImpl
 {
    public static  void main(String [] args)
    {
       
        Scanner sn=new Scanner(System.in);
        System.out.println("enter the size of stack");
        int n=sn.nextInt();
        Stack st=new Stack(n);
        int ch ;
         while(true)
        {
        System.out.println("enter the choice ");
        System.out.println("enter 1:for push entr 2:for pop entr 3:for display enter 4: for exit");
        ch=sn.nextInt();
        switch(ch)
        {
            case 1:System.out.println("enter the item in to the stack");
                           int item=sn.nextInt();
                            st.push(item,n);
                            break;
            case 2:st.pop();break;
            case 3:st.display();break;
            case 4:System.exit(0);
            default : System.out.println("enter the right option");
        }
    }
    }
}

