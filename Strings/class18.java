package Strings;

public class class18 {

public static void main(String[] args) {
	String s="Malayalam";
	System.out.println(s);
	System.out.println(tolowercase(s));
	if(palindrome(s)) {
		System.out.println("palindrome");
	}else {
		System.out.println("not a palindrome");
	}
}
public static boolean  palindrome(String s) {
	s=tolowercase(s);
	int i=0;
	int j=s.length()-1;
	while(i<j) {
		char ch1=s.charAt(i);
		char ch2=s.charAt(j);
	
	if(ch1!=ch2) return false;
	i++;
	j--;

}return true;
} 

public static String tolowercase(String s) {
	String res="";
	for(int i=0;i<s.length();i++) {
		char ch=s.charAt(i);
		if(ch>=97&&ch<=122) {
			ch-=32;
			res+=ch;
		}else {
			res+=ch;
		}
	}return  res;
	
}

}

