package inheritance_programs;

public class p3 extends p2{
	
	int c=20;
	
	public void test3() 
	{
	   System.out.println("from test3 of p3");
	}
	
	public static void main(String[] args) {
		
		System.out.println("from main of p3");
		
		p3 ob1 = new p3();
		
		System.out.println(ob1.a);
		ob1.test1();
		System.out.println(ob1.b);
		ob1.test2();
		System.out.println(ob1.c);
		ob1.test3();
		
		System.out.println("-----------");
		
        p3 ob2 = new p3();
		
		System.out.println(ob2.a);
		ob2.test1();
		System.out.println(ob2.b);
		ob2.test2();
		System.out.println(ob2.c);
		ob2.test3();
		
	}

}
