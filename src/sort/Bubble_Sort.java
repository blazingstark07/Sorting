package sort;
import java.util.Scanner;

public class Bubble_Sort {

	public static void main(String[] args) {
		
		// Creating object of scanner class for taking input from user
		Scanner sc=new Scanner(System.in);
		
		//taking input from the user about the size of the array
		System.out.println("Enter size of the array: ");
		int size=sc.nextInt();
		
		
		int arr[]=new int[size]; //array initialization
		
		//taking input in the array
		System.out.println("Enter numbers of the array one by one: ");
		for (int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Original array is: ");
		for (int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}
		
		//using bubble sort algorithm to sort the array
		for (int i=0;i<size;i++) {
			for (int j=i+1;j<size;j++) {
				if (arr[i]>=arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		// displaying array elements after sorting
		System.out.println("\nSorted array is: ");
		for (int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}
		sc.close();
	}

}

