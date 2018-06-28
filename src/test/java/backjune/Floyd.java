package backjune;
import java.util.*;
/* https://www.acmicpc.net/problem/11404 */
public class Floyd {
	// 정점의 개수.
	static int V;
	// 그래프의 인접 행렬 표현.
	// 간선이 없으면 아주 큰 값을 넣는다.
	static int adj[][];
	static int C[][][];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		V = sc.nextInt();
		adj = new int[V][V];
		// 인접 행렬 초기화.
		java.util.Arrays.fill(adj, 1000000);
		int m = sc.nextInt();
		for(int i=0; i < V; i++) {
			adj[i][i] = 0;
		}
		for(int i=0; i < m; i++) {
			String s = sc.next();
			String[] sArr = s.split(" ");
			int[] data = new int[sArr.length];
			for(int j = 0; j < data.length; j++) {
				data[i] = Integer.parseInt(sArr[i]);
			}
			// 
			adj[data[0]][data[1]] = data[2];
		}
		C = new int[V][V][V];
		
	}
	
	static void shortestPath() {
		// C[0] 을 초기화
		// 0
		for(int i=0; i < V; i ++) {
			for(int j=0; j <V; j++) {
				if(i == j) C[0][i][j] = 0;
				else {
					C[0][i][j];
				}
			}
		}
		
	}

}
