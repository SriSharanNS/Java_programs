package library_programs;

public class p4 {

	
	
	String sname;
	int regno;
	String branch;
	
	

	
	public p4(String sname,int regno,String branch)
	{
		this.sname=sname;
		this.regno=regno;
		this.branch=branch;
		
	}
	
	
	public static void main(String[] args) {
		
		
		p4 ob1 = new p4("joe", 111, "cse");
		p4 ob2 = new p4("jim", 222, "ise");
		p4 ob3 = new p4("john", 333, "ece");
		
		System.out.println(ob1.hashCode());
		System.out.println(ob2.hashCode());
		System.out.println(ob3.hashCode());
	}
	
}
