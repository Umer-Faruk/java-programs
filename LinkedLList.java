import java.util.*;

class LinkedLList
{
    public static void main(String []args)
    {
        Scanner sn=new Scanner(System.in);
        LinkedList<String> LL =new LinkedList<String>();
        Iterator<String> itr= LL.iterator();
      
        
        while(true)
        {
        System.out.println("enter the choice\n1:add string to list\n2:remove string from list\n3:list strings in list\n4:list string witch length is<5\n");
        int ch=sn.nextInt();
        switch(ch)
        {
            case 1:
                    System.out.println("enter the string\n");
                    String s=sn.next();
                    LL.add(s);
                    
                    break;
                    
             case 2:System.out.println(LL.remove(0)+"is deleted from LL\n");break;
             
             case 3:System.out.println("elements of list are:-\n");
                   
                   /* System.out.println("using for loop\n");
                    for(int i=0;i<LL.size();i++)
                    {System.out.println(""+LL.get(i));}*/
                    //replacing above code. and use iterator insted of for loop
                    
                    System.out.println("using iterator\n");
                    itr=LL.iterator();
                    while(itr.hasNext())
                    {
                        System.out.println(itr.next());
                    }
                    break;
                    
                    case 4:
                            itr=LL.iterator();//set iterator to LL
                            while(itr.hasNext())
                            {
                                String i= (String)  itr.next();//convert the object to string to find length
                                if(i.length()<5)
                                System.out.println(""+i);
                            }
                            break;
            }   
        }
    }
}
