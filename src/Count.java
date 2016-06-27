
public class Count {
	void sort(int[] arr){
		int size=arr.length;
		int[] result=new int[size];
		int k=getMax(arr);
		int[] c=new int[k];
		for(int i=0;i<=k;i++){
			c[i]=0;
		}
		for(int i=0;i<arr.length;i++){
			c[arr[i]]=c[arr[i]]+1;
		}
		for(int i=1;i<=k;i++){
			c[i]=c[i]+c[i-1];
		}
		for(int i=(arr.length-1);i>=0;i--){
		System.out.printf("\n%d,%d",arr[i],c[arr[i]]);
			//result[c[arr[i]]]=arr[i];
			c[arr[i]]=c[arr[i]]-1;
		}
		
	//	for(int i=0;i<result.length;i++)
	//		System.out.print(" "+result[i]);
	}
	
	public int getMax(int[] array){
		int max=array[0];
		for(int i=1;i<array.length;i++){
			if(array[i]>max){
				max=array[i];
			}
		}
		return max;
	}
}
