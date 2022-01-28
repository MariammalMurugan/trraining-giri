package testing;

import java.util.Scanner;

public class phase2calculator{

	 

	
	
		
		

		
		int add (int a1, int a2)
		{
			return a1+a2;
		
		}
		int sub (int a1, int a2)
		{
			return a1-a2;
		
}
		int mul(int a1, int a2)
		{
			return a1*a2;
			}
		int div (int a1, int a2)
		{
			return a1/a2;
			}
		
			




		
		
	 
	 





	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a1,a2,r1,r2,r3,r4,add,sub,mul,div;
		phase2calculator calc=new phase2calculator();
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter a1");
		 a1=sc.nextInt();
		 System.out.println("Enter a2");
		 a2=sc.nextInt();
		 
		 
		 
		
		
		
		
		 

		 r1=calc.add(a1,a2);
		 
		 r2=calc.sub(a1,a2);
		 r3=calc.mul(a1,a2);
		 r4=calc.div(a1,a2);
		
				 
		 System.out.println(r1);
				 System.out.println(r2);
				 System.out.println(r3);
				 System.out.println(r4);
	}

}









