package rkp;

public class SingletonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton s1=Singleton.getInstance();
		s1.addUrl("www.google.com");
		System.out.println(s1);
		Singleton s2=Singleton.getInstance();
		System.out.println(s2);
		s2.addUrl("www.github.com");
		s2.showUrl();

	}

}
