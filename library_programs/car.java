package library_programs;


public class car implements Cloneable{

	
	String model;
	String color;
	double price;
	
	public String toString()
	{
		return "model="+this.model+" color="+this.color+" price="+this.price;
	}
	
	public car(String model,String color,double price)
	{
		this.model=model;
		this.color=color;
		this.price=price;
	}
	
	public static void main(String[] args) {
		
		car x = new car("bmw", "black", 10000);
		
		car[] ob = new car[3];
		
		for (int i = 0; i < ob.length; i++) {
			
			try {
				
				ob[i]=(car) x.clone();
				
			} catch (Exception e) {
				
			}
		}
			
			for (int j = 0; j < ob.length; j++) {
				System.out.println(ob[j]);
			}
			
		}
		
		
			
}
