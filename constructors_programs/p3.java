package constructors_programs;

public class p3 {
	
	
	public p3()
	{
		System.out.println("from no arg");
	}
	
	public p3(int a)
	{
		System.out.println(a);
	}
	
	public p3(int a,float b)
	{
		System.out.println(a);
		System.out.println(b);
	}

	
	
	
	public static void main(String[] args) {
		
		System.out.println("from main");
		
		p3 ob1 = new p3();
		p3 ob2 = new p3(10);
		p3 ob3 = new p3(20,3.45f);
		
	}


}
