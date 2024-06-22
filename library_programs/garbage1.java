package library_programs;

public class garbage1 {
	
	int a =10;
	int b = 20;
	

	protected void finalize() throws Throwable {
		
		System.out.println("created object");
	}
	
	public static void main(String[] args) {
		
		
		garbage1 ob1 = new garbage1();
		ob1 = new garbage1();
		
		garbage1 ob2 = new garbage1();
		ob2 = null;
		
		System.gc();
		
	}

}
