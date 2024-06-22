package inheritance_programs;

public class p13 extends p12{

	String tech;
	
	public p13(String ename,int eid,double sal,String tech)
	{
		super(ename, eid, sal);
		this.tech=tech;
	}
	
	public static void main(String[] args) {
		
		System.out.println("from main of p13");
		
		p13 ob1 = new p13("joe", 111, 500000, "java");
		p13 ob2 = new p13("jim", 222, 600000, "python");
		p13 ob3 = new p13("john", 333, 700000, "web");
		
		System.out.println(ob1.ename+","+ob1.eid+","+ob1.sal+","+ob1.tech);
		System.out.println(ob2.ename+","+ob2.eid+","+ob2.sal+","+ob2.tech);
		System.out.println(ob3.ename+","+ob3.eid+","+ob3.sal+","+ob3.tech);
		
	}
	
}
