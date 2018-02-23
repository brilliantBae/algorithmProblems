package backjune;
import java.util.*;
/* https://www.acmicpc.net/problem/1260 */

public class DFSandBFS {
	// 그래프의 인접 리스트 표현
	static List<List<Integer>> dfsAdj = new ArrayList<>();
	static List<List<Integer>> bfsAdj = new ArrayList<>();
	static boolean[] visited;
	
	// start 에서 시작해 그래프를 너비 우선 탐색하고 각 정점의 방문 순서를 반환한다.
	public static List<Integer> bfs(int start) {
		// 각 정점의 방문여부
		boolean[] discovered = new boolean[bfsAdj.size()];
		java.util.Arrays.fill(discovered, false);
		// 방문할 정점 목록을 유지하는 큐.
		Queue<Integer> q = new LinkedList<>();
		List<Integer> order = new ArrayList<>();
		// 시작정점을 방문하고 큐에 넣는다.
		discovered[start] = true;
		q.add(start);
		while(!q.isEmpty()) {
			// queue 에 첫번째로 들어있는 원소를 꺼낸다.
			int here = q.remove();
			// 큐에서 꺼낸 정점을 방문한다.
			order.add(here);
			// 인접한 정점중 아직 미방문인 정점을 방문하고 큐에 넣는다.
			for(int i=0; i < bfsAdj.get(here).size(); i++) {
				int there = bfsAdj.get(here).get(i);
				if(!discovered[there]) {
					discovered[there] = true;
					q.add(there);
				}
			}
		}
		return order;
	}
	
	// start 에서 시작해 그래프를 너비 우선 탐색하고 시작점부터 각 정점까지의
	// 최단거리와 너비우선탐색 스패닝 트리를 계산한다.
	// distance[i] = start 부터 i까지의 최단거리
	// parent[i] = 너비 우선 탐색 스패닝 트리에서 i의 부모의 번호, 루트인 경우 자신의 번호
	void bfs2(int start, int[] distance, int[] parent) {
		distance = new int[bfsAdj.size()];
		// -1 로 초기화
		java.util.Arrays.fill(distance, -1);
		parent = new int[bfsAdj.size()];
		java.util.Arrays.fill(parent, -1);
		// 방문할 정점 목록을 유지하는 큐
		Queue<Integer> q = new LinkedList<>();
		distance[start] = 0;
		parent[start] = start;
		q.add(start);
		while(!q.isEmpty()) {
			int here = q.remove();
			// here의 모든 인접 정점을 검사한다.
			for(int i=0; i < bfsAdj.get(here).size(); i++) {
				int there = bfsAdj.get(here).get(i);
				// 처음보는 정점이면 큐에 집어넣는다.
				if(distance[there] == -1) {
					q.add(there);
					// 최단거리를 계산.
					distance[there] = distance[here] + 1;
					parent[there] = here;
				}
			}
		}
	}
	// 스패닝 트리를 이용해서 
	// v로부터 시작점까지의 최단 경로를 계산한다.
	List<Integer> shortestPath(int v, int[] parent){
		List<Integer> path = new ArrayList<>();
		// path 에 v를 넣는다.
		path.add(v);
		// 루트 노드에 도달할때까지 수행.
		while(parent[v] != v) {
			v = parent[v];
			path.add(v);
		}
		Collections.reverse(path);
		return path;
	}
	public static void dfs(int here) {
		// 해당 정점을 방문했다고 표시.
		visited[here] = true;
		// 모든 인접정점에 대해
		for(int there : dfsAdj.get(here)) {
			// 방문하지 않았으면 dfs 를 수행.
			if(!visited[there]) 
				dfs(there);
		}
		// 더 이상 방문할 정점이 없으므로, 재귀호출을 종료하고 이전 정점으로 돌아간다.	
	}
	
	// 모든 정점을 방문한다.
	public static void dfsAll() {// 그래프의 컴포넌트가 2개 이상일 경우가 있기 때문에 필요.
		// visited 를 모두 false 로 초기화한다.
		visited = new boolean[dfsAdj.size()];
		java.util.Arrays.fill(visited, false);
		// 모든 정점을 돌면서 아직 방문하지 않은 정점에 대해 dfs 실행.
		for(int i=0 ; i < dfsAdj.size(); i++) {
			if(!visited[i])
				dfs(i);
		}
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String[] arr = s.split(" ");
		int[] input = new int[3];
		for(int i=0; i < arr.length; i++) {
			input[i] = Integer.parseInt(arr[i]);
		}
	}
	
}
