import java.util.*;
import java.util.ArrayList;
class ArrayList
{
public static void main(String []args)
{
    ArrayList<String> Q=new ArrayList<>();
    Scanner sn=new Scanner(System.in);
    
    while(true)
    {
    System.out.println("enter the choise\n");
    int ch=sn.nextInt();
    System.out.println("1:enque\n2:dequeue\n3:display\n");
    switch(ch)
    {
        case 1:System.out.println("enter the value\n");
                int value=sn.nextInt();
                Q.add(value);
                break;
         case 2:System.out.println(Q.remove(0)+"is deleted from queua\n");
                break;
         case 3:System.out.println("elements in queu\n");
                int size=Q.size();
                for(int i=0;i<size;i++)
                {
                    System.out.println(""+Q.get(i));
                }
                break;
     }
    }
    
}
}
