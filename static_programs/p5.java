package static_programs;

public class p5 {

	
	static int res=p5.test1();
			
	
	public static int test1()
	{
	   System.out.println("from test 1");
	   System.out.println(10);
	   return test2(10);
	
	 
	}
	
	public static int test2(int a)
	{
	   System.out.println("from test 2");
	   System.out.println(a+20);
	   return a+20;
	}
	public static void main(String[] args) {
		
		System.out.println("from main");
	}
	
}
