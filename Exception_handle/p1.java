package Exception_handle;


public class p1 {
	
	public static void main(String[] args)
	{
		int a=10,b=0;
		System.out.println(a+","+b);
		
		try
		{
			System.out.println("try begin");
			int c=a/b;
			System.out.println(c);
			System.out.println("try end");
		}
		catch(Exception e)
		{
			System.out.println("From catch");
			
		}
		
		System.out.println(a+","+b);
			
		
	}

}
