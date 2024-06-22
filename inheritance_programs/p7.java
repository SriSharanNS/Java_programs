package inheritance_programs;

public class p7 extends p6{

	
	static int b=20;
	int y=200;
	
	public static void test2() 
	{
	  System.out.println("from test2 of p7");	
	}
	
	public static void main(String[] args) {
		
		System.out.println("from main");
		
		 p7 ob1 = new p7();
		 System.out.println(ob1.a);
		 System.out.println(ob1.x);
		 ob1.test1();
		 System.out.println(ob1.b);
		 System.out.println(ob1.y);
		 ob1.test2();
		 
		 System.out.println("---------");
		 
		 p7 ob2 = new p7();
		 System.out.println(ob2.a);
		 System.out.println(ob2.x);
		 ob2.test1();
		 System.out.println(ob2.b);
		 System.out.println(ob2.y);
		 ob2.test2();
		 
		 System.out.println("-------------");
		 
		 System.out.println(p7.a);
		 System.out.println(p7.b);
		 
		 
		 p7.test1();
		 p7.test2();
	 
		 
		
	}
}
