package static_programs;

public class p7 {

	
	
	static int a=10;
	
	static
	{
		System.out.println("static 1");
		a=20;
		System.out.println(a);
		System.out.println(p7.a);
		
		System.out.println("first");
		
		
	}
	
	
	static int b=50;
	
	static 
	{
		System.out.println("static 2");
		a=30;
		System.out.println(a);
		System.out.println(p7.a);
		
		System.out.println(b);
	}
	
	public static void main(String[] args)
	{
		System.out.println("from main");
		System.out.println(a);
		System.out.println(p7.a);
		
		a=40;
		System.out.println(a);
		System.out.println(p7.a);
		
		
		
	}
	
}
