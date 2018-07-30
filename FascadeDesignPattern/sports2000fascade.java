package rkp;

public class sports2000fascade {
itempurchased i;
sport2000 s;

public sports2000fascade(boolean g,int amount)
{
	i=new itempurchased();
	s=new sport2000(g,i.gettype(),amount);
}

public void display()
{
	i.showitems();
}
public void print()
{
	s.printbill();
}
}
