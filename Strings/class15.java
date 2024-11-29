package Strings;

public class class15 {
public static void main(String[] args) {
	String S="ABCDefg";
	String res="";
	for(int i=0;i<S.length();i++) {
		char ch=S.charAt(i);
		if(ch>=97&& ch<=112) {
			ch-=32;
			
			res=res+ch;
		}else {
			res=res+ch;
		}
	}
	System.out.println(res);
}
}
