package rkp;

import java.util.ArrayList;

public class Singleton {

	static Singleton sc=null;
	ArrayList<String> al=new ArrayList<String>();
	private Singleton() {
		// TODO Auto-generated constructor stub
		
	}
	
	public static Singleton getInstance()
	{
		if(sc==null)
		{
			sc=new Singleton();
			return sc;
		}
		return sc;
	}
	public void addUrl(String url)
	{
		al.add(url);
	}
	public void showUrl()
	{
		for(String u:al)
			System.out.println(u);
	}

}
