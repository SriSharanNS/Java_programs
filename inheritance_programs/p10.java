package inheritance_programs;

public class p10 {

	public p10(int a)
	{
		this(a, 20);
		System.out.println("from cont-1 of p10");
		System.out.println(a);
	}
	
	public p10(int a,int b)
	{
		System.out.println("from cont-2 of p10");
		System.out.println(a);
		System.out.println(b);
	}
	
}
