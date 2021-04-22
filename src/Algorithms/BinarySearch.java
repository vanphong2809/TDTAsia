package Algorithms;

import java.lang.reflect.Array;
import java.util.Scanner;

public class BinarySearch {
	public BinarySearch() {
		
	}
	public int binarySearch(int array[], int l, int r, int x) {
		if(r>=l) {
			int mid=(l+r)/2;
			if(array[mid]==x) {
				return mid;
			}
			if(array[mid]>x) {
				return binarySearch(array, 0, mid-1, x);
			}
			if(array[mid]<x) {
				return binarySearch(array, mid+1, r, x);
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Nhap so can tim: ");
		int x=sc.nextInt();
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		BinarySearch bs=new BinarySearch();
		int position =bs.binarySearch(a, 0, a.length-1, x);
		if(position==-1) {
			System.out.println("Khong tim thay "+x);
		}else {
			System.out.println("So can tim nam o vi tri thu "+position);
		}
	}
}
