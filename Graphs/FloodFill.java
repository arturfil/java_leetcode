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
