import java.util.Scanner;
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of array.");
		int size=s.nextInt();
		int[] array=new int[size];
		System.out.println("Enter the elements in the array of size: "+size);
		for(int i=0;i<size;i++){
			array[i]=s.nextInt();
		}
		
		//bubble sort
		Bubble bubble=new Bubble();
		System.out.println("Sorting by Bubble sort algorithm: ");
	//	bubble.sort(array);
		
		//selection sort
		Selection selection=new Selection();
		System.out.println("\nSorting by Selection sort algorithm: ");
	//	selection.sort(array);
		
		//Insertion sort
		Insertion insertion=new Insertion();
		System.out.println("\nSorting by Insertion sort algorithm: ");
	//	insertion.sort(array);
		
		//count sort
		Count count=new Count();
		System.out.println("\nSorting by Count sort algorithm: ");
		count.sort(array);
		
	}

}
