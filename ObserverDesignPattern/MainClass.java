package rkp;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		product s=new product("SAMSUNGTV","notavail");
		Person p=new Person(s,"rupesh");
		//System.out.println(s.getavail());
		//System.out.println(p.getname());
		Person p1=new Person(s,"kumar");
		Person p2=new Person(s,"pandey");
		
		s.setavail("avail");
		
		s.unregister(p1);
		
		s.setavail("notavail");
	}

}
