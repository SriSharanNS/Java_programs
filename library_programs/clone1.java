package library_programs;

public class clone1 implements Cloneable {
	
	int a =10;
	int b = 20;
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		clone1 x  = new clone1();
		
		clone1 ob1 = (clone1)x.clone();	
		clone1 ob2 = (clone1)x.clone();		
		clone1 ob3 = (clone1)x.clone();		
		
		System.out.println(x.a+","+x.b);
		System.out.println(ob1.a+","+ob1.b);
		System.out.println(ob2.a+","+ob2.b);
		System.out.println(ob3.a+","+ob3.b);
		
		
	}

}
