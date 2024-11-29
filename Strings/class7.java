package Strings;

public class class7 {
public static void main(String[] args) {
	String s1="java";
	System.out.println(s1);
	String s2="programme";
	System.out.println(s2);
	s1="core "+s1;
	System.out.println(s1==s2);
	s1=s1+s2;
	s2="core java"+"programme";
	System.out.println(s1==s2);
}
}
