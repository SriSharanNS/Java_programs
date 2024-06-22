package static_programs;

public class p6 {
	
	static
	{
		System.out.println("from static 1");
		main(null);
	}
	
	static
	{
		System.out.println("from static 2");
	}
	
	
	
	public static void main(String[] args) {
		
		System.out.println("from main");
		
	}
	
	static
	{
		System.out.println("from static 3");
	}

}
