package testing;

public class exceptionhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{int a=10;
		int b= 5;
		int c=5;
		int r=a/(b-c);
		}
		catch(ArithmeticException e)
		{System.out.println(" This is an undesirble one");

	}
		finally
		{System.out.println("Exception occurs");
	}
	}

}
