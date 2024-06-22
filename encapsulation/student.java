package encapsulation;

public class student {

	private String sname;
	private int sid;
	private String branch;
	
	public String get_name()
	{
		return sname;
	}
	
	public int get_id()
	{
		return sid;
	}
	
	public String get_branch()
	{
		return branch;
	}
	
	public void set_name(String sname)
	{
		this.sname=sname;
	}
	
	public student(String sname,int sid, String branch)
	{
		this.sname=sname;
		this.sid=sid;
		this.branch=branch;
	}
	
	
}
