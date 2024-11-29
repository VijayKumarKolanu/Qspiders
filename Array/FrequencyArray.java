package Array;
import java.util.ArrayList;

public class FrequencyArray {
public static void main(String[] args) {
	int[] arr= {1,2,3,4,1,2,3};
	
//	int[] res=new int[arr.length];
	//int k=0;
	for(int i=0;i<arr.length;i++)
	{
		int count=0;
		 int arr1=arr[i];
		 for(int j=0;j<arr.length;j++)
		 {
			 int arr2=arr[j];
			 if(arr1==arr2)
			 {
				 count++;
				 arr.removeAll();
				 
			 }
		 }
		 System.out.println(count);
	}
}
}
//	for(int i=0;i<arr.length;i++)
//	{
//		int count=0;
//		for(int j=i+1;j<arr.length;j++)
//		{
//			if(arr[i]==arr[j])
//			{
//				count++;
//			}
//		}
//		if(count==0)
//		{
//			res[k++]=arr[i];
//		}
//	}
//System.out.println(res);
//}
//}

 