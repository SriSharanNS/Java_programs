package polymorphism;

public class over_loading {

	public static void add(int a,int b)
	{
		System.out.println(a+b);
	}
	
	public static void add(float a , int b , double c)
	{
		System.out.println(a+b+c);
	
	}
	
	public static void main(String[] args) {
		
		System.out.println("from main");
		
		add(10,20);
		add(10.55f,2,44440);
		
	}
	
}
