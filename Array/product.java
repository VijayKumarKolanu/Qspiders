package Array;

import java.util.ArrayList;

public class product {
	String pname;
	int pid;
	int price;
	double Rating;
	
	product(String pname,int pid,int price,double Rating){
		this.pname=pname;
		this.pid=pid;
		this.price=price;
		this.Rating=Rating;
	}

	
	public static void main(String[] args) {
product[] p=new product[5];
p[0]=new product("ponds",01,20,4);
p[1]=new product("soap", 02, 40, 9);
p[2]=new product("toothpaste",03,10,5);
p[3]=new product("bresh", 04, 40, 10);
p[4]=new product("hair oil",05,30.5);
	}
}
