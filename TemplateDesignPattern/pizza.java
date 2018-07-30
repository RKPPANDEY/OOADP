
public abstract class pizza {
public final void makepizza()
{
	makedough();
	addsauce();
	addcheese();
	addtoppings();
}
public void makedough()
{
	System.out.println("worked on dough");
}
public void addsauce()
{
	System.out.println("tomato sauce added");
}
public void addcheese()
{
	System.out.println("cheese added");
}
public abstract void addtoppings();
}

