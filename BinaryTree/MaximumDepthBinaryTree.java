package BinaryTree;

public class MaximumDepthBinaryTree {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        int leftMax = 1 + maxDepth(root.left);
        int rightMax = 1 + maxDepth(root.right);
        return leftMax > rightMax ? leftMax : rightMax;
    }
}

/*
    TESTING
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

    EXPLANATION
    - You are trying to recurse on every for of the tree.
    - As long as it's not null, you call the recursion and add 1;
    - Afterwards you are going to have leftSide & rightSide;
    - You compare which side is larger and return that side depth
*/