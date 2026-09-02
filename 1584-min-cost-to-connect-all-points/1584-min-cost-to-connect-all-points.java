class Solution {
    public int minCostConnectPoints(int[][] points) {
        HashMap<Integer,List<List<Integer>>> adjList = new HashMap<>();
        int v = points.length;
        for(int i = 0; i < v;i++)
        adjList.put(i,new ArrayList<>());

        for(int i = 0;i < v;i++)
        {
            for(int j = i + 1;j < v;j++)
            {
                int w = Math.abs(points[i][0] - points[j][0])  + Math.abs(points[i][1] - points[j][1]);
                adjList.get(i).add(new ArrayList<>(Arrays.asList(j,w)));
                adjList.get(j).add(new ArrayList<>(Arrays.asList(i,w)));
            }
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[1] - b[1]);
        boolean visited[] = new boolean[v];
        pq.offer(new int[] {0,0});
        int res = 0;

        while(!pq.isEmpty())
        {
            int curr[] = pq.poll();
            if(visited[curr[0]])
            continue;

            visited[curr[0]] = true;
            res += curr[1];

            for(List<Integer> nei : adjList.get(curr[0]))
            {
                if(visited[nei.get(0)])
                continue;

                pq.offer(new int[] {nei.get(0),nei.get(1)});
            }
        }
        return res;
    }
}