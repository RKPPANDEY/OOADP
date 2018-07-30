package rkp;

public class Person extends Observer {
	String name;
	public Person(Subject s,String name)
	{
		s.register(this);
		this.name=name;
	}
	public void setname(String name)
	{
		this.name=name;
	}
	public String getname()
	{
		return name;
	}
	@Override
	public void update(String avail) {
		// TODO Auto-generated method stub
		
		System.out.println(name+" the product you registered for is now "+avail);
	}

}