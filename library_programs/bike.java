package library_programs;

public class bike {

	int cc;
	float milage;
	
	
	public boolean equals(Object obj) 
	{
		bike temp = (bike) obj;
		
		if(this.cc==temp.cc && this.milage==temp.milage)
		{
			return true;
		}
		else 
		{
			return false;
		}
		
	}
	
	
	public bike(int cc,float milage)
	{
		this.cc=cc;
		this.milage=milage;
	}
	
	
	public static void main(String[] args) {
		
		bike bullet = new bike(650,30);
		bike duke = new bike(350,30);
		
		System.out.println(bullet.equals(duke));
		
		
		
		
	}
	
}
