import BinarySearch.BinarySeach;
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
    }

}