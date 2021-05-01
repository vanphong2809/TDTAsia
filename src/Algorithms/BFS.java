package Algorithms;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {

	public static int[][] array = { { 0, 1, 1, 0 }, { 0, 0, 1, 0 }, { 1, 0, 0, 1 }, { 0, 0, 0, 1 } };
	public static int[] visited = { 0, 0, 0, 0 };
	static int n = 4;

	public static void BFS(int v) {
		visited[v] = 1;
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(v);
		while (queue.size() != 0) {
			v = queue.poll();
			System.out.print(v + " ");
			for (int i = 0; i < n; i++) {
				if (array[v][i] == 1 && visited[i] == 0) {
					visited[i]=1;
					queue.add(i);
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BFS(2);
	}

}
