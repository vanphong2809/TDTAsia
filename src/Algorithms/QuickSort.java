package Algorithms;

public class QuickSort {
	
	public int partition(int arr[], int l, int r) {
		int temp, temp2;
		int left=l;
		int right=r-1;
		int pivot=arr[r];
		while (true) {	
			while(left<=right && arr[left]<pivot) left++;
			while(left<=right && arr[right]>pivot) right--;
			if(left>=right) break;
			temp=arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
			left++;
			right--;
		}
		temp2=arr[left];
		arr[left]=arr[r];
		arr[r]=temp2;
		return left;
		
	}
	public void quickSort(int arr[], int l, int r) {
		if(l<r) {		
			int partition=partition(arr, l, r);
			quickSort(arr, l, partition-1);
			quickSort(arr, partition+1, r);
		}
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	public static void main(String[] args) {
		QuickSort qs=new QuickSort();
		int array[]= {1,3,5,7,9,8,11,12,12,7};
		System.out.println("Mang sau khi sap xep");
		qs.quickSort(array,0, array.length-1);
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		
	}

}

