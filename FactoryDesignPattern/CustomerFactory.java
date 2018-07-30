
public class CustomerFactory {

	public Customer getcustomer(String type)
	{
		if(type.equals("part time"))
		{
			return new Ptcustomer();
		}
		else if(type.equals("senior citizen"))
		{
			return new Sccustomer();
		}
		else if(type.equals("Full time"))
		{
			return new Sccustomer();
		}
		else
			return null;
			
	}
}
