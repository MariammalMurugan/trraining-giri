package testing;

import java.util.Scanner;

public class Testno9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		int num, rem1, rem2, rem3, result;
				System.out.println("Enter the number");
				
				
				num=obj.nextInt();
				rem1=num%3;
				System.out.println(rem1);
				
				rem2=num%7;
				
				System.out.println(rem2);
				rem3=num%17;
				
				System.out.println(rem3);
				result=rem1+rem2+rem3;
				
				System.out.println("Summation of the remainders");
				
				System.out.println(result);
				if(result/2<=0)
				{
					System.out.println("Yours no is Even");
				}
				else {
					System.out.println("Yours no is Odd");
		

	}
	}

}
