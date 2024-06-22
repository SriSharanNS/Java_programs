package inheritance_programs;

public class p2 extends p1{
	
	int b=20;
	
	public void test2() 
	{
	   System.out.println("from test2 of p2");
	}
	
	public static void main(String[] args) {
		
		System.out.println("from main of p2");
		
		p2 ob1 = new p2();
		
		System.out.println(ob1.a);
		ob1.test1();
		System.out.println(ob1.b);
		ob1.test2();
		
		
	}

}
