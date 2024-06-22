package abstraction;

public  class acc_imp extends account{
	
	double bal=100;
	
	public double checkbal()
	{
		System.out.println(bal);
		return bal;
	}
	
	public void deposit(int x)
	{
		this.bal=bal+x;
		System.out.println(bal);
	}
	
	public void withdraw(int x)
	{
		this.bal=bal-x;
		System.out.println(bal);
	}

	public static void main(String[] args) {
		
		account ob1 = new acc_imp();
		
		ob1.checkbal();
		ob1.deposit(10000);
		ob1.withdraw(2000);
		
	}
	
}
