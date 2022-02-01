import Graphs.FloodFill;

public class Main {
    public static void main(String[] args) {
        int[][] image = {
            {1,1,1},
            {1,1,0},
            {1,0,1}
        };
        var flood = new FloodFill();
        flood.floodFill(image, 1, 1, 4);
        for(int[] row : image) {
            System.out.print("[");
            for (int pixel : row) {
                System.out.print(pixel);
            }
            System.out.println("]");
        }
    }

}