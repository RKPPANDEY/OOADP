
public class CustomerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerFactory c=new CustomerFactory();
		
		Customer c1=c.getcustomer("part time");
		c1.gettype();
		
		Customer c2=c.getcustomer("Full time");
		c2.gettype();
	}

}
