package Exception_handle;

public class p9 {
	
	public static void main(String[] args) {
		
		
		 int a =10,b=10;
		 System.out.println(a+","+b);
		 
		 try{
			int c =a/b;
			System.out.println(c);
		}
		catch (ArithmeticException e)
		{
			System.out.println("From catch ");
		}
		 finally {
			System.out.println("from finally");
		}
	}

}
