package method_overriding;

public class p3 extends p2{
	
	public void test()
	{
		System.out.println("from test 3");
	}
	
	public static void main(String[] args) 
	{
		
		p3 ob4 = new p3();
		
		ob4.test();
		
		
		
}

}
