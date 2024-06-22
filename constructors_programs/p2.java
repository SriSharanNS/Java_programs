package constructors_programs;

public class p2 {
	
	public p2(int a)
	{
		System.out.println(a);
	}

	
	public static void main(String[] args) {
		
		System.out.println("from main");
		
		p2 ob1 = new p2(10);
		p2 ob2 = new p2(20);
		p2 ob3 = new p2(30);
		
	}
	
}
