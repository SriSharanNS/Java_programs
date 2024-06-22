package abstraction;

public class p2 extends p1{

	public void test1()
	{
		System.out.println("from test 1 of p1");
	}
	
	public void test2()
	{
		System.out.println("from test 2 of p1");
	}
	
	
	public p2()
	{
		System.out.println("from cont p2");
	}
	
	
	public static void main(String[] args) {
		
		p2 ob1 = new p2();
		
		ob1.test1();
		ob1.test2();
		
		System.out.println("--------");
		
		p1 ob2 = ob1;
		
		ob2.test1();
		ob2.test2();
		
	}
	
	
}
