package Graphs;

public class FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int color = image[sr][sc]; // startin point
        if (color != newColor) dfs(image, sr, sc, color, newColor);
        return image;
    }
    // where r = row, c = col
    private void dfs(int[][] image, int r, int c, int color, int newColor) {
        if (image[r][c] == color) {
            image[r][c] = newColor; // change to new color;
            if (r >= 1) dfs(image, r-1, c, color, newColor); // valid pixel upwards boundary
            if (c >= 1) dfs(image, r, c-1, color, newColor); // valid pixel leftwards boundary
            if (r+1 < image.length) dfs(image, r+1, c, color, newColor); // valid pixel right boundary
            if (c+1 < image[0].length) dfs(image, r, c+1, color, newColor); // valid pixel downwards boundary
        }
    }
}

/*
    TESTING
    int[][] image = {
        {1,1,1},
        {1,1,0},
        {1,0,1}
    };
    var flood = new FloodFill();
    flood.floodFill(image, 1, 1, 4);

    EXPLANATION
    - This would be the same as changing the color of a single 
      pixel in photoshop, paint etc.
    - You are choosing an existing pixel and where it is at (cordinates => row an col)
      and you want to change all the pixels that match that color
    - When you look for that pixel, you check for neighbouring pixels with the same colour
      BUT as long as they are 4 directionally connected (up, down, left, right) NOT diagonally
*/