package Array;

public class Person {
	String name;
	int age;
	char gender;
	Person(String name,int age,char gender){
		this.name=name;
		this.age=age;
		this.gender=gender;
	}
	@Override
	public String toString () {
		return "Name:"+name +"  age:"+age+"  gender:"+gender;
	}
	

}
