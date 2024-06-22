package inheritance_programs;

public class p11 extends p10{

	public p11()
	{
		super(10);
		System.out.println("from cont of p11");
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("from main of p11");
		
		p11 ob1  = new p11();
		
		
		
	}
	
}
