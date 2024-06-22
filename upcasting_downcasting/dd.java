package upcasting_downcasting;

public class dd extends cc{
	
	int w=40;
	
	public void testdd()
	{
	  System.out.println("from testdd of dd");	
	}

	public static void main(String[] args) {
		
		bb ob5 = new dd();
		
        dd ob6 =(dd) ob5;
        
        System.out.println(ob6.x);
        ob6.testa();
        
        System.out.println(ob6.w);
        ob6.testdd();
		
		
		
		
	}
	
}
