package strings;

public class p15 {

	public static void main(String[] args) {
		
		p14 r = new p14();
		Thread t = new Thread(r);
		
		t.start();
		
		for (int i = 0; i <10; i++) {
			
			System.out.println("main thread");
		}
		
		
	}
}
