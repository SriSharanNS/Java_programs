package inheritance_programs;

public class p9 extends p8{

	public p9()
	{   
		super();   // same o/p without super
		System.out.println("from const of p9");
	}
	
	public static void main(String[] args) {
		
		System.out.println("from main of p9");
		
		 p9 ob1 = new p9();
		
		
	}
	
	
}
