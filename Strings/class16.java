package Strings;

public class class16 {
public static void main(String[] args) {
	String s="abcDeFGHIJKL";
	String res="";
	for(int i=0;i<s.length();i++) {
		char ch=s.charAt(i);
		if(ch>=65&&ch<=90) {
			ch+=32;
			res=res+ch;
			
		}
		else {
			res=res+ch;
		}
	}
	System.out.println(res);
}
}
