package library_programs;

public class p5 {

	int a=10;
	int b=20;
	
	public static void main(String[] args) {
		
		p5 ob1 = new p5();
		p5 ob2 = new p5();
		
		p5 ob3=ob1;
		
		System.out.println(ob1.equals(ob2));
		System.out.println(ob1.equals(ob3));
		
	}
	
	
	
}
