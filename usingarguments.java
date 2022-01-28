package testing;

public class usingarguments {
	void main()
	{System.out.println("Inside main");
	}
	void main(int i)
	{
		for(int j=0;j<i;j++)
	{
		System.out.println("Inside main function");
	}
	}
	int main(int i,int j)
	{
		return i+j;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		usingarguments ua= new usingarguments();
		ua.main();
		ua.main(10);
		System.out.println(ua.main(10, 90));
	}

}
