package exceptions_progarms;

public class nullpointer {
	
	public static void main(String[] args)
	{
		String name1 = "joey";
		
		System.out.println(name1.length());
		
        String name2 = null;
		
		System.out.println(name2.length());
	}

}
