package testing;

public class samemethodname {
	float volume(float r)
	{
		return (float)(1.33*r*r*r);
	}
double volume(int r, double h)
{
	return (double)(3.14*r*r*h);

}
int volume(int a)
{
	return (int)(a*a*a);
}


public static void main(String[] args)
{
	samemethodname smn=new samemethodname();

	System.out.println("Volume of the Sphere is" + smn.volume(5.0f));
	System.out.println("Volume of the Cylinder is" + smn.volume(3,4.55));
	System.out.println("Volume of the Cube is" + smn.volume(4));

}
}