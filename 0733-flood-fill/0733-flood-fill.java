class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int org = image[sr][sc];
        if(org == color)
        {
            return image;
        }
        fill(image,sr,sc,org,color);
        return image;
    }
    public void fill(int[][] image, int sr, int sc,int org, int color)
    {
        if(sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length)
        {
            return;
        }
        if(org != image[sr][sc])
        {
            return;
        }
        image[sr][sc] = color;
        
        fill(image,sr + 1,sc,org,color);
        fill(image,sr - 1,sc,org,color);
        fill(image,sr,sc + 1,org,color);
        fill(image,sr,sc - 1,org,color);
    }
}