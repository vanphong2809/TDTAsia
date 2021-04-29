package Algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;

public class DFS {

	static int[][] graph = { { 0, 1, 1, 0 }, { 0, 0, 1, 0 }, { 1, 0, 0, 1 }, { 0, 0, 0, 1 } };

	static int[] trace = { 0, 0, 0, 0 };
	static int n = 4;
	
	static Stack<Integer> stack = new Stack<>(); 
	public void Init(int[][] G, int n) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("G[" + i + "][" + j + "]=");
				G[i][j] = sc.nextInt();
			}
		}
	}

	public static void dfs(int vertex) {
		trace[vertex] = 1;
		System.out.print(vertex + "->");
		for (int i = 0; i < n; i++) {
			if (graph[vertex][i] == 1 && trace[i] == 0) {
				dfs(i);
			}
		}

	}
	
	public static void dfsStack() {
		
		stack.push(1);
		while(stack.isEmpty()!=true)
		{
			int vertex=stack.pop();
			System.out.println(vertex+" ");
			trace[vertex]=1;
			for(int i = 0 ; i<n ; i++)
			{
				if(graph[vertex][i]==1&&trace[i]==0)
				{
					stack.push(i);
				}
			}			
		}
		
	}
	Vector a = new Vector();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//dfs(0);
		dfsStack();
	}

}
