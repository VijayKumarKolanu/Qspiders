package Number$pattrens;

public class class1 {
public static void main(String[] args) {
	int num=3;
	for(int i=1;i<2*num;i++) {
		for(int j=1;j<2*num;j++) {
			if(i+j<=2*num)
			{
				System.out.print(j+" ");
				
			}else {
				System.out.print("  ");
			}
		}System.out.println();
	}
}
}
