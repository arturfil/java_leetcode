import Graphs.FloodFill;
import LinkedLists.ListNode;
import TwoPointers.MiddleOfTheLinkedList;

public class Main {
    public static void main(String[] args) {
        int[][] image = {
            {1,1,1},
            {1,1,0},
            {1,0,1}
        };
        var flood = new FloodFill();
        flood.floodFill(image, 1, 1, 2);

        for(int[] row: image) {
            for (int col: row) {
                System.out.print(String.format("%s ", col));
            }
            System.out.println();
        }

    }

}