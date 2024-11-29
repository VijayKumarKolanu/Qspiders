
public class class19 {
public static void main(String[] args) {
	String s="java";
System.out.println(s);
	
	for (int i=0;i<s.length();i++) {
		char ch=s.charAt(i);
		int count =0;
		for(int j=0;j<=s.length()-1;j++) {
			char ch1=s.charAt(j);
			if(ch==ch1) {
				count++;
			}
			
}
		System.out.println(ch+"------->"+count);

}
		
}

}