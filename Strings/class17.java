package Strings;

public class class17 {
public static void main(String[] args) {
	String s="ABCDEF";
	System.out.println(s);
	System.out.println(Reverse(s));
}

public static String Reverse(String s) {
	String res="";
	for(int i=s.length()-1;i>=0;i--) {
		char ch=s.charAt(i);
		res+=ch;
	}return res;
}
}
