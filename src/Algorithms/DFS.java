package Algorithms;

import java.util.Scanner;

public class DFS {
	
	public static void Init (int n, int[][] array) {
		Scanner sc=new Scanner(System.in);	
		System.out.println("Nhap mang: ");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				array[i][j]=sc.nextInt();
			}
		}
	}
	public static void dfs(int[][] array, boolean[] duyet, int n, int v) {
		duyet[v]=true;
		System.out.print(v+" ");
		for(int i=0;i<n;i++) {
			if(array[v][i]==1 && duyet[i]==false) {
				dfs(array, duyet, n, i);
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=4,v;
		int [][] array = new int[n][n];
		boolean[] duyet=new boolean[n];
		Init(4, array);
		for(int i=0;i<n;i++) {
			duyet[i]=false;
		}
		System.out.print("Nhap dinh bat dau duyet: ");
		v=sc.nextInt();
		dfs(array, duyet, n, v);
	}
}
