package static_programs;

public class p3 {

	static int a=10;
	
	public static void test()
	{
		int a=30;
		System.out.println("from static");
		System.out.println(a);
		System.out.println(p3.a);
	}
	
	public static void main(String[] args)
	{
	    	System.out.println("from main");
	    	System.out.println(a);
			System.out.println(p3.a);
			
			System.out.println("--------");
	    	
			test();
			
	    	a=20;
	    	
	    	System.out.println("--------");
	    	System.out.println(a);
			System.out.println(p3.a);
			System.out.println("--------");
			
	    	test();
	    	 
	}
}
