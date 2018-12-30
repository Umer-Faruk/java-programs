import java.util.Scanner;
public class Personal 
{
	public int age,exp;
	public static int loans;
	public String name,education;
	static float salary;
	public float basic,dra,Tax,hra,loanAmount;	
	Personal(){
		age=25;
		exp=0;
		loans=0;
		name="Abc";
		education="B.E";
		basic=100000;
		loanAmount=1000;
		
	}
	void isEligible(float salary, int loans)
	{
		if(loans<3 && salary>30000)
			System.out.println("You're eligible for loan");
		else
			System.out.println("You're not eligible for loan, sorry");
	}
	
	void taxPay(float basic)
	{
		dra=(basic/100)*25;
		hra=(basic/100)*2;
		Tax=basic-dra-hra;
		System.out.println("tax to be paid is"+Tax);
	}
	
	void isEligiblePromotion(int exp)
	{
		if(exp>4)
		{
			System.out.println("Elgible for promotion");
			
		}
		else 
		{
			System.out.println("You're not eligible for promotion");
		}
	}
	

	void Display()
	{
		System.out.println("Salary is:"+salary);
		System.out.println("Experience is:"+exp);
		System.out.println("age is:"+age);
		
	}
	
	public static void main(String args[])
	{
		
		Personal f1= new Personal();
		
		Scanner s=new Scanner(System.in);
		while(true)
		{final int choice;
		System.out.println("Enter the choice \n1.to check eligiblity for loan\n 2.to check the tax \n3. to check whether the person is eligible for promotion or not \n4. to display the details required  ");
		choice=s.nextInt();
		
		
		
		switch(choice)	
		{
		case 1:System.out.println("entwr the salary\n");
			f1.isEligible(salary,loans);
			break;
		case 2:System.out.println("entwr the salary\n");
			f1.taxPay(salary);
			break;
		case 3: int n ;
		            System.out.println("enter the exp");
		            n=s.nextInt();
		        f1.isEligiblePromotion(n);
		        break;
		   case 4:
			f1.Display();break;
			
			
		}}
		

	}
}
