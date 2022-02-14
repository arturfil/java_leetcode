import BinaryTree.SortedArrayToBinaryTree;
import BinaryTree.TreeNode;

public class Main {
    public static void main(String[] args) {

        int[] arr = new int[] {-10, -3, 0, 5, 9};

        var arrayToBts = new SortedArrayToBinaryTree();
        arrayToBts.sortedArrayToBST(arr);
        
    }

}