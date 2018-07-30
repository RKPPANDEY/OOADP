
public abstract class Customer {
String id,name,type;
Discount d;

public Customer(String id,String name)
{
	this.name=name;
	this.id=id;
}

public void display(double amount)
{
	System.out.println("Name:->"+name);
	System.out.println("ID:->"+id);
	System.out.println("Gross Price:->"+amount);
	System.out.println("Typeofcust:->"+type);
	System.out.println("Amount payable:->"+(amount-d.discount(amount)));
}
}
