package Alphabets;

public class class6 {
public static void main(String[] args) {
	int num=3;
	char ch='A';
	for(int i=1;i<2*num;i++) {
		for(int j=1;j<2*num;j++) {
			if(i<=j&&i+j<=2*num||i+j>=2*num&&i>=j) {
				System.out.print(ch++ +" ");
			}else {
				System.out.print("  ");
			}
		}System.out.println();
	}
}
}
