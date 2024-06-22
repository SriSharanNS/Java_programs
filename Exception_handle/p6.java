package Exception_handle;

public class p6 {

	
	static
	{
		System.out.println("From p6");
	}
	
	public static void main(String[] args) 
	{
		
		System.out.println("From main");
		
		try {
			
			Class.forName("Exception_handle.p5");
			
		} catch (Exception e) {
			
			System.out.println("From catch");
		}
	}
}
