package upcasting_downcasting;

public class cc extends bb{
	
	int z=30;
	
	public void testcc() 
	{
	  System.out.println("from testcc of cc");	
	}
	
	public static void main(String[] args) {
		
		cc ob3 = new cc();
		
		bb ob4 = ob3;
		
		System.out.println(ob4.x);
		ob4.testa();
		System.out.println(ob4.y);
		ob4.testb();
		
		
		
		
	}
	

}
