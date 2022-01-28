package testing;

import java.util.Scanner;

public class Testno14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int no,reverse=0,temp;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the number");
		no=obj.nextInt();
		temp=no;
		
		while(no>0)
				{
			
			int remainder=no%10;
			reverse=reverse*10+remainder;
			no=no/10;
		}
		System.out.println("The reverse of the no is:" +reverse);
		if (reverse==temp)
		{
			System.out.println("The given no is Palindrome");

	}
		else {System.out.println("The given no is not a palindrome");
		}
		}

}
