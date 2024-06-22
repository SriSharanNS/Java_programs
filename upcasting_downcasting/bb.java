package upcasting_downcasting;

public class bb extends aa{

	int y = 20;
	
	public void testb() 
	{
		System.out.println("from testb of b");
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("from main b");
		
		bb ob1 = new bb();
		
	   System.out.println(ob1.x);
	   ob1.testa();
	   
	   System.out.println(ob1.y);
	   ob1.testb();
	   
	   
	   System.out.println("-----------");
	   
	   
	   aa ob2 =  ob1;
	   
	   System.out.println(ob1.x);
	   ob2.testa();
		
		
		
		
	
		
	}
	
}
