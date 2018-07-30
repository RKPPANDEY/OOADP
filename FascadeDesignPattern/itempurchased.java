package rkp;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class itempurchased {

	HashMap<String,Integer> hm;
	int type;
	Scanner sc=new Scanner(System.in);
	public itempurchased()
	{
		hm=new HashMap<String,Integer>();
		storepurchase();
	}
	public void storepurchase()
	{
		System.out.println("enter how many types of items have u bought");
		type=sc.nextInt();
		
		for(int i=0;i<type;i++)
		{
			System.out.println("Enter name of the product");
			String name=sc.next();
			System.out.println("Enter id of the product");
			int qty=Integer.parseInt(sc.next());
			hm.put(name, qty);
		}
	}
	
	public int gettype()
	{
		return type;
	}
	
	public void showitems()
	{
		Set<Entry<String, Integer>> s=hm.entrySet();
		for(Entry<String, Integer> s1:s)
		{
			System.out.println(""+s1.getKey()+" "+s1.getValue());
		}
		
	}
}

