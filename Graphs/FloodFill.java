package Graphs;

public class FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int color = image[sr][sc];
        if (color != newColor)
            dfs(image, sr, sc, color, newColor);
        return image;
    }

    public void dfs(int[][] image, int row, int col, int color, int newColor) {
        if (image[row][col] == color) {
            image[row][col] = newColor;
            if (row >= 1) dfs(image, row - 1, col, color, newColor);
            if (col >= 1) dfs(image, row, col - 1, color, newColor);
            if (row+1 < image.length) dfs(image, row + 1, col, color, newColor);
            if (col+1 < image[0].length) dfs(image, row, col + 1, color, newColor);
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

    // for printing the image after change if any -> ->
    for(int[] row: image) {
        for (int col: row) {
            System.out.print(String.format("%s ", col));
        }
        System.out.println();
    }

    EXPLANATION
    - This would be the same as changing the color of a single
    pixel in photoshop, paint etc.
    - You are choosing an existing pixel and where it is at (cordinates => row an
    col)
    and you want to change all the pixels that match that color
    - When you look for that pixel, you check for neighbouring pixels with the
    same colour
    BUT as long as they are 4 directionally connected (up, down, left, right) NOT
    diagonally
 */