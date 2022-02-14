import BinaryTree.MaximumDepthBinaryTree;
import BinaryTree.TreeNode;

public class Main {
    public static void main(String[] args) {

        TreeNode root = new TreeNode(3);
        TreeNode nl = new TreeNode(9);

        TreeNode nr = new TreeNode(20);
        TreeNode n2r = new TreeNode(15);
        TreeNode n3r = new TreeNode(7);

        root.left = nl;
        root.right = nr;
        nr.left = n2r;
        nr.right = n3r;

        var max = new MaximumDepthBinaryTree();
        max.maxDepth(root);
    }

}