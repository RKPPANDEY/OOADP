package rkp;

import java.util.Scanner;

public class sport2000 {
boolean gc;
int qty;
int amount;
Scanner sc=new Scanner(System.in);
public sport2000(boolean gc,int qty,int amount)
{
	this.amount=amount;
	this.gc=gc;
	this.qty=qty;
}

public void printbill()
{
	int value;
	if(this.gc==false) {
	System.out.println("You dont have any giftcard Amount payable="+amount);
	}
	else
	{
		System.out.println("Enter gift card value");
		value=sc.nextInt();
		
		if(qty<=0)
		{
			System.out.println("No items in your bag");
		}
		else if(qty>1)
		{
			System.out.println("Item count is more than one cannot apply gc amount payable="+(amount));	
		}
		else if(value>amount)
		{
			System.out.println("amount is less than gc value cannot apply gc amount payable"+amount);
			
		}
		else
			System.out.println("GC applied amount payable="+(amount-value));
	}
	
}

}
