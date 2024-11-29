package Number$pattrens;

public class class4 {
public static void main(String[] args) {
	int num=3;
	for(int i=1;i<2*num;i++) {
		int n=1;
		int m=2*num-i;
		for(int j=1;j<2*num;j++) {
			if(i<=j) {
				System.out.print(n++ +" ");
				}else {
					System.out.print(++m+" ");
				}
		}System.out.println();
	}
}
}
