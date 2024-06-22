package Exception_handle;

public class p4 {
	
	
	
	public static void test2()
	{
		System.out.println("test-2 begin");
        int a=10/0;
		System.out.println("test-2 end");
	}

	
	public static void test1()
	{
		System.out.println("test-1 begin");
		test2();
		System.out.println("test-1 end");
	}
	
	public static void main(String[] args) 
	{
		
		System.out.println("From main");
		
		try {
			test1();
			
		} catch (Exception e) 
		{
			System.out.println("From catch");
		}
		
	}

}
