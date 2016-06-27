
public class Bubble {
	void sort(int[] arr){
		for(int i=0;i<arr.length;i++){
			for(int j=arr.length-1;j>=i+1;j--){
				if(arr[j]<arr[j-1]){
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
			}
		}
		
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
}
