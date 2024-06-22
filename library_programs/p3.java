package library_programs;



public class p3 {
	
	String sname;
	int regno;
	String branch;
	
	
    
    public String toString() {
    	
    	return "sname = "+this.sname+" regno = "+this.regno+" branch = "+this.branch;
    }
	
	
	public p3(String sname,int regno,String branch)
	{
		this.sname=sname;
		this.regno=regno;
		this.branch=branch;
		
	}
	
	
	public static void main(String[] args) {
		
		
		p3 ob1 = new p3("joe", 111, "cse");
		p3 ob2 = new p3("jim", 222, "ise");
		p3 ob3 = new p3("john", 333, "ece");
		
		System.out.println(ob1);
		System.out.println(ob2);
		System.out.println(ob3);
		
		
	}

}
