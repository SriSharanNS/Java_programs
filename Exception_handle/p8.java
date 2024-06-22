package Exception_handle;

public class p8 {

	
	public static void main(String[] args) throws ClassNotFoundException{
		
		System.out.println("From main");
		
		try {
			
			Class.forName("Exception_handle.p11");
			
		} catch (Exception e) {
			
			System.out.println("From catch");
		}
	}
}
