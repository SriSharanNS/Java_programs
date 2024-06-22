package constructors_programs;

public class p4 {
	
	String sname;
	int regno;
	double fee;
	
	public p4(String sname,int regno,double fee)
	{
	
		this.sname=sname;
		this.regno=regno;
		this.fee=fee;
	}
	
	
	public void displayinfo()
	{
		System.out.println("sname = "+this.sname+" regno = "+this.regno+" fee = "+this.fee);
	}
	
	public static void main(String[] args) {
		
		System.out.println("from main");
		
		p4 ob1 = new p4("joey", 111, 5000);
		p4 ob2 = new p4("jam", 222, 60000);
		p4 ob3 = new p4("jimmy", 333, 70000);
		
		ob1.displayinfo();
		ob2.displayinfo();
		ob3.displayinfo();
		
	}
}
