import java.util.*;

class stack
{Scanner sn=new Scanner(System.in);
    int S[],top,size;
    stack(int a)
    {   size=a;
        S = new int[size];
        top=-1;
        
    }
    
    void push()
    {
    System.out.println("entet the element\n");
    int element=sn.nextInt();
    top++;
    S[top]=element;
    }
    void pop()
    {
        System.out.println(S[top]+"is deleted from the stack\n");
        top--;
    }
    void display()
    {
        System.out.println("element in stack\n");
        for(int i=top;i>=0;i--)
        {
            System.out.println(" "+S[i]);
        }
    }
}

class Stack
{
    public static void main(String []args)
    {
        Scanner sn=new Scanner(System.in);
        System.out.println("enter the size of stack\n");
        int siz=sn.nextInt();
        
        stack s=new stack(siz);
        while(true)
        {
        System.out.println("enter the choise\n1:push\n2:pop\n3:display\n");
        int ch =sn.nextInt();
        switch(ch)
        {
            case 1:s.push();break;
            case 2:s.pop();break;
            case 3:s.display();break;
        }
        
        }
        
        
        
        
    }
}
