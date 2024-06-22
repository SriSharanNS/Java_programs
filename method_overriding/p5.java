package method_overriding;

public class p5 extends p4{

	public static void test()
	{
		System.out.println("from test p5");
	}
	
	public static void main(String[] args) {
		
		
		p5 ob1 = new p5();
		
		ob1.test();
		
		
	}
	
}
