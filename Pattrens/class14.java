package Pattrens;

public class class14 {
public static void main(String[] args) {
	int num=3;
	for(int i=1;i<2*num;i++) {
		for(int j=1;j<=num;j++) {
			if(i+j>num&&i-j<num) {
				System.out.print("* ");
			}else {
				System.out.print("  ");
			}
		}
		System.out.println();
		
	}
}
}
