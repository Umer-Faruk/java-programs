import java.util.Scanner;
import java.util.Arrays;

class Working_with_String
{
    public static void main(String [] args)
    {   int m,n;
        Scanner sn=new Scanner(System.in);
        String st,str1,str2;
        System.out.println("enter a String");
        st=sn.nextLine();
        
        
        //extracting  //main :-substring(n ,n+m)
        System.out.println("a: extracting some portion from given string");
        System.out.println("how many characters you wanto extract from the string\t"+st);
        m=sn.nextInt();
        System.out.println("from witch position you wanto extract \t"+m+"\tchasrecters");
        n=sn.nextInt();
        String st1 = st.substring(n, n+m);
        System.out.println("the\t"+st1+"\tis extracted from main string\t "+st);
        System.out.println("b: read the text and count all occurences of given char");
        
        //counting //main while condition
        System.out.println("enter the text");
        String text=sn.next();
        System.out.println("enter the char");
        String ch=sn.next();
        int count = 0;
        int idx = 0;
        while ((idx = text.indexOf(ch, idx)) != -1)
        {
        idx++;
        count++;
        }
        System.out.println("occurence of  char \t**"+ch+"**\tis= "+count+" times");
  
        //replace sub string in given string //main:- str1.replaceAll(str2,strp)
        
       System.out.println("\n enter the main string");
       str1=sn.next();
       System.out.println("enter the sub string you want to replace\n");
       str2=sn.next();
       System.out.println("you wanto replace**"+str2+"** with what ?");
       String strp=sn.next();
       System.out.println( str1.replaceAll(str2, strp) );

        
        
        
        // sorting the strings  // convert strint to array use main:-[Arrays.sort(array name);]
        
        System.out.println("enter the string\n");
        str2=sn.next();
        char temparray[]=str2.toCharArray();
        Arrays.sort(temparray);
        str2= new String(temparray);
        System.out.println("string after sorting\n"+str2);
        
        //compare ing 2 string //main:- str1.equalsIgnoreCase(str2);
        
        System.out.println("\nenter the 2 strings and compare");
        System.out.println("enter 1st string\n");
        str1=sn.next();
        System.out.println("enter  2nd string\n");
        str2=sn.next();
        System.out.println("**"+str1.equalsIgnoreCase(str2)+"**");//true  
        
        //concatenate 2 strings // main:- str1.concat(str2);
        System.out.println("\nenter the 2 strings and concatenate");
        System.out.println("enter 1st string\n");
        str1=sn.next();
        System.out.println("enter  2nd string\n");
        str2=sn.next();
        System.out.println(""+str1.concat(str2));
        
    }
}
