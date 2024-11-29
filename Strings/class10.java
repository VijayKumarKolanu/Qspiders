package Strings;

public class class10 {
public static void main(String[] args) {
	String s="hello world";
	char ch='d';
	System.out.println(contains(s,ch));
	}

	public static boolean contains(String s,char ch) {
	for(int i=0;i<s.length();i++) {
		if(ch==s.charAt(i)) {
		return true;
			
		}
	}
	return false;
}

}