package inheritance_programs;

public class emp_driver {

	public static void main(String[] args) {
		
		developer d1 = new developer("sam", 111, 3000000);
		developer d2 = new developer("jam", 222, 4000000);
		developer d3 = new developer("cam", 333, 5000000);
		
		System.out.println(d1.ename+","+d1.eid+","+d1.sal);
		System.out.println(d2.ename+","+d2.eid+","+d2.sal);
		System.out.println(d3.ename+","+d3.eid+","+d3.sal);
		
		System.out.println("-------------------");
		
		tester t1 = new tester("sammmm", 101, 8000000);
		tester t2 = new tester("tommm", 102, 9000000);
		tester t3 = new tester("gammmm", 103, 7000000);
		
		System.out.println(t1.ename+","+t1.eid+","+t1.sal);
		System.out.println(t2.ename+","+t2.eid+","+t2.sal);
		System.out.println(t3.ename+","+t3.eid+","+t3.sal);
		
		
	}
	
}
