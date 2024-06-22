package Exception_handle;

public class p3 {
	
	public static void main(String[] args) 
	{
		 int a =10,b=0;
		 System.out.println(a+","+b);
		 
		 try{
			int c =a/b;
			System.out.println(c);
		}catch (ArithmeticException e)
		 {
			System.out.println("From catch 1");
		}catch (RuntimeException e)
		 {
			System.out.println("From catch 2");
		}catch (Exception e)
		 {
			System.out.println("From catch 3");
		}
		 
		 
	}
}
