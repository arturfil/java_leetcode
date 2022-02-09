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

    public TreeNode printTree(TreeNode root) {
        System.out.println(root.val);
        if (root.left == null) return root;
        else printTree(root.left);
        if (root.right == null) return root;
        else printTree(root.right);
        return root;
    }
}
