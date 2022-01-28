package testing;

public class Assertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int m,n,avg;
m=Integer.parseInt(args[0]);
n=Integer.parseInt(args[1]);
avg=(m+n)/2;
assert avg>70: "Under age; Not eligible";
if (avg<70)
{System.out.println("Pass");
}
else 
{System.out.println("Fail");
}


	}
}


