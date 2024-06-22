package strings;

public class p13 extends Thread{

	public static void main(String[] args) {
		
		p12 t = new p12();
		
		t.start();
		
		for (int i = 0; i < 10; i++) {
			
			System.out.println("main thread");
		}
		
		
	}
	
}
