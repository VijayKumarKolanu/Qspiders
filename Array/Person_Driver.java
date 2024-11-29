package Array;

public class Person_Driver {
	public static void main(String[] args) {
		Person p1=new Person("vijay",22,'m');
		Person p2=new Person("jay",23,'f');
		Person p3=new Person("ajay",24,'m');
		Person p4=new Person("jayram",25,'f');
		Person p5=new Person("abhiram",34,'m');
		
		Person []p=new Person[5];
		p[0]=p1;
		p[1]=p2;
		p[2]=p3;
		p[3]=p4;
		p[4]=p5;
		for(int i=0;i<p.length;i++) {
			System.out.println(p[i].name);
		}
}}