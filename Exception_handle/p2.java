package Exception_handle;

public class p2 {
	
	public static void main(String[] args)
	{
		String s = "abc123";
		System.out.println(s);
		
		try
		{
			System.out.println("try begin");
			int num=Integer.parseInt(s);
			System.out.println(num);
			System.out.println("try end");
		}
		catch(NumberFormatException ss)
		{
			System.out.println("From catch");
			
		}
		
		System.out.println(s);
		
		
	}

}
