package encapsulation;

public class student_driver {

	public static void main(String[] args) {
		
		student s1 = new student("hary", 111, "cse");
		student s2 = new student("cary", 222, "ise");
		student s3 = new student("bary", 333, "ece");
		
		System.out.println(s1.get_name()+","+s1.get_id()+","+s1.get_branch());
		System.out.println(s2.get_name()+","+s2.get_id()+","+s2.get_branch());
		System.out.println(s3.get_name()+","+s3.get_id()+","+s3.get_branch());
		
		
		
		s1.set_name("rach");
		System.out.println(s1.get_name()+","+s1.get_id()+","+s1.get_branch());
		
	}
	
}
