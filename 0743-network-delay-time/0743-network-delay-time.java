class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        HashMap<Integer,List<int[]>> adjList = new HashMap<>();
        int dist[] = new int[n+1];
        Arrays.fill(dist,Integer.MAX_VALUE);
        for(int i = 1;i <= n;i++)
        {
            adjList.put(i,new ArrayList<>());
        }
        for(int edge[] : times)
        {
            adjList.get(edge[0]).add(new int[] {edge[1],edge[2]});
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[1] - b[1]);
        pq.offer(new int[] {k,0});
        dist[k] = 0;
        while(!pq.isEmpty())
        {
            int[] curr = pq.poll();
            int node = curr[0];
            int cost = curr[1];
            if(dist[node] < cost)
            continue;
            for(int nei[] : adjList.get(node))
            {
                int newDist = nei[1] + cost;
                if(newDist < dist[nei[0]])
                {
                    pq.offer(new int[] {nei[0] , newDist});
                    dist[nei[0]] = newDist;
                }
            }
        }
        int res = 0;
        for(int i = 1;i <= n;i++)
        {
            if(dist[i] == Integer.MAX_VALUE)
            return -1;
            res = Math.max(res,dist[i]);
        }
        return res;
    }
}