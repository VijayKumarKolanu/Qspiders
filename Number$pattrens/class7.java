package Number$pattrens;

public class class7 {
public static void main(String[] args) {
	int num=3;

	for(int i=1;i<=num;i++) {
		int n=1;
		int m=i;
		for(int j=1;j<2*num;j++) {
			if(i+j>num&& j-i<num) {
			if(j>=num) {
				System.out.print(n++ +" ");
				
			}else {
				System.out.print(m-- +" ");
				
			}
			}else {
				System.out.print("  ");
			}
			
		}System.out.println();
	}
}
}
