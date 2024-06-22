package encapsulation;

public class p2 extends p1{

	public static void main(String[] args) {
		
		p1 ob1 = new p2();
		
		System.out.println(ob1.read());
		ob1.write(20);
		System.out.println("-------");
		System.out.println(ob1.read());
		
		
	}
	
}
