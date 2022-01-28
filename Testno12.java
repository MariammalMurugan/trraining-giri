package testing;

import java.util.Scanner;

public class Testno12 {

	public static void main(String[] args) {
		System.out.println("hello world");
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter Your Choices:\n 1. English \n 2. Tamil\n 3. Hindi \n 4. Malayalam");
		int choice = 1;
		switch (choice) {
		
//		case 1 start 
		case 1:
			System.out.println("Enter your choices:\n 1. check Balance\n 2. Recharge Packages\n 3. Special Offers");
			int A1 = 1;
			switch (A1) {
			case 1:
				System.out.println(" Your current Balance is Rs.144");
				break;
			case 2:
				System.out.println(" Your available packages are for Rs.144, 249, 559");
				break;
			case 3:
				System.out.println(" Your offers:\n 1. Recharge for Rs.500 get extra Rs.100");
				break;
			}
			break;
		case 2:
			System.out.println("hello");

		}
	}
}


