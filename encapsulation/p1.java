package encapsulation;

public class p1 {

	private int a =10;
	
	public int read()
	{
		System.out.println(a);
		return this.a;
	}
	
	public void write(int x)
	{
		this.a=x;
	}
	
}
