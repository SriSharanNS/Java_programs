package constructors_programs;

public class p5 {
	
	int a;
	
	public p5()
	{
		System.out.println("from no args");
	}
	
	public p5(int x)
	{
		this();

		System.out.println("from 1 args");
		System.out.println(x);
		System.out.println("-----");
		this.a=x;
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		
		System.out.println("from main");
		
		p5 ob1 = new p5(10);
		
		
		
		
	}

}
