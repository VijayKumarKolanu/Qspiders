package Strings;

public class class11 {
public static void main(String[] args) {
	String s="programe";
	for(int i=0;i<s.length();i++) {
		char ch=s.charAt(i);
		switch(ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':System.out.println(ch);
		}
		
	}
}
}
