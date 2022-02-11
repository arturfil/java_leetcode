package BinaryTree;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode() {}
    public TreeNode(int val) {this.val = val; }
    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    // not really exact print method (not perfect)
    public TreeNode printTree(TreeNode root) {
        System.out.println(root.val);
        if (root.left != null)
            printTree(root.left);
        if (root.right != null)
            printTree(root.right);
        return root;
    }
}
