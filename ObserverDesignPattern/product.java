package rkp;

import java.util.ArrayList;
import java.util.Iterator;

public class product extends Subject {

	String name,avail;
	ArrayList<Observer> al=new ArrayList<Observer>();
	public product(String name,String avail)
	{
		this.name=name;
		this.avail=avail;
	}
	
	public void setname(String name)
	{
		this.name=name;
	}
	public String getname()
	{
		return name;
	}
	public void setavail(String avail)
	{
		System.out.println("Availability changed");
		this.avail=avail;
		notify1();
	}
	public String getavail()
	{
		return avail;
	}
	
	@Override
	public void register(Observer o) {
		// TODO Auto-generated method stub
		al.add(o);
	}

	@Override
	public void unregister(Observer o) {
		// TODO Auto-generated method stub
		al.remove(o);
	}

	@Override
	public void notify1() {
		// TODO Auto-generated method stub
		System.out.println("Notifying all observers");
		Iterator<Observer> li=al.iterator();
		while(li.hasNext())
		{
			Observer o=li.next();
			o.update(avail);
		}
	}

}
