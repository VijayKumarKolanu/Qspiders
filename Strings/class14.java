package Strings;

public class class14 {
	public static void main(String[] args) {
		String s="abc234587";
		int sum=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='0'&&ch>='9') {
				ch-=48;
				
				sum=sum+ch;
			}
		}
		System.out.println(sum);
	}

}
