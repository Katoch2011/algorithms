
public class Insertion {
	void sort(int[] arr){
		int key,j;
		for(int i=1;i<arr.length;i++){
			key=i;
			j=i-1;
			while((j>=0) && (arr[j]>arr[key])){
				arr[j+1]=arr[j];
				j=(j-1);
			}
			arr[j+1]=arr[key];
			
		}
		
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
}
