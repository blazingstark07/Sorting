package sort;
import java.util.Scanner;

public class Selection_Sort {
	
	//function for selection sort
	void Sort(int arr[]) {
		int size=arr.length;
		for (int i=0;i<size-1;i++) {
			int pos=i;
			for (int j=i+1;j<size;j++) {
				if (arr[j]<arr[pos])
					pos=j;
			}
			int temp=arr[i];
			arr[i]=arr[pos];
			arr[pos]=temp;
		}	
	}
	//main function
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating object for scanner class
		Scanner sc=new Scanner(System.in);
		//taking user input of array size
		System.out.println("Enter size of the array: "); 
		int size=sc.nextInt();
		
		int arr[]=new int[size];
		//taking input in the array
		System.out.println("Enter numbers of the array one by one: ");
		for (int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		
		//displaying elements of array before sorting
		System.out.println("Original array is: ");
		for (int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}
		
		Selection_Sort ob1=new Selection_Sort();
		ob1.Sort(arr);
		
		// displaying array elements after sorting
		System.out.println("\nSorted array is: ");
		for (int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}
		sc.close();
		
	}

}
