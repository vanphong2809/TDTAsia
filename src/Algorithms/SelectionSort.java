package Algorithms;

import java.util.Scanner;

public class SelectionSort {
	public SelectionSort() {

	}
	public void SelectionSort(int arr[], int n) {
		int i, j, min_idx;
		for (i = 0; i < n - 1; i++) {
			min_idx = i;
			for (j = i + 1; j < n; j++) {
				if (arr[j] < arr[min_idx])
					min_idx = j;
			}
			int temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp;
		}
	}

	public void printArray(int arr[]) {
		int i;
		for (i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Nhap so luong phan tu ben trong mang");
			n = sc.nextInt();
		} while (n <= 0);
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("a[" + i + "]= ");
			a[i] = sc.nextInt();
		}
		;
		SelectionSort ss = new SelectionSort();
		ss.SelectionSort(a, n);

		System.out.println("Mang sau khi duoc sap xep: ");
		ss.printArray(a);

	}

}
