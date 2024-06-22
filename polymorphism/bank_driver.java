package polymorphism;

public class bank_driver {

	public static void main(String[] args) {
		
		bank ob1 = new icici();
		bank ob2 = new sbi();
		bank ob3 = new axis();
		

		
		ob1.roi();
		ob2.roi();
		ob3.roi();
	}
	
}
