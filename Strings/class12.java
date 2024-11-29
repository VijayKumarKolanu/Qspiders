package Strings;

public class class12 {
public static void main(String[] args) {
	String s="programme";
	int count=0;
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
		case 'U':count++;
			
			
		
		}
	}
	System.out.println("Vowels---------->"+count);
}
}
