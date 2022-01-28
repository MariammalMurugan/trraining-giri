package testing;

import java.util.Scanner;

public class Testno15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no,sum=0,temp;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the number");
		no=obj.nextInt();
		temp=no;
		
		while(no>0)
				{
			
			int r=no%10;
			sum=sum+r*r*r;
			no=no/10;
			
			
		}
		System.out.println("sum of the no is: "+sum);
		
		
		if (sum==temp)
		{
			System.out.println("The given no is the Amstrong");
			
		}
		else
		{
			System.out.println("The no is not an amstrong");
		}

	}

}
