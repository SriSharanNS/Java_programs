package method_overriding;

public class p2 extends p1{

	public void test()
	{
		System.out.println("From test 2");
	}
	
	public static void main(String[] args) {
		
		p2 ob1 = new  p2();
		
		ob1.test();
		
		
		p1 ob2=ob1;
		
		ob2.test();
		
	}
	
}
