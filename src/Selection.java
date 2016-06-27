
public class Selection {
	void sort(int[] arr){
		int smallest,temp;
		for(int i=0;i<arr.length;i++){
			smallest=i;
			for(int j=i+1;j<arr.length;j++){
				if(arr[smallest]>arr[j])
					smallest=j;
			}
			temp=arr[i];
			arr[i]=arr[smallest];
			arr[smallest]=temp;
		}
		
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
}
