class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> q = new LinkedList<>();
        int freshOrange = 0;
        for(int i = 0;i < grid.length;i++)
        {
            for(int j = 0;j < grid[0].length;j++){
                if(grid[i][j] == 2)
                q.offer(new int[] {i,j});
                if(grid[i][j] == 1)
                freshOrange++;
            }
        }
        if(freshOrange == 0)
        return 0;
        if(q.isEmpty())
        return -1;

        int minutes = -1;
        int[][] dir = {{1,0},{-1,0},{0,-1},{0,1}};
        while(!q.isEmpty())
        {
            int size = q.size();
            while(size --> 0)
            {
                int cell[] = q.poll();
                int x = cell[0];
                int y = cell[1];
                for(int[] d:dir)
                {
                    int i = x + d[0];
                    int j = y + d[1];
                    if(i >= 0 && i < grid.length && j >=0 && j < grid[0].length && grid[i][j] == 1)
                    {
                        grid[i][j] = 2;
                        freshOrange--;
                        q.offer(new int[] {i,j});
                    }
                }
            }
            minutes++;
        }
        if(freshOrange == 0)
        {
            return minutes;
        }
        return -1;
    }
}