package Graphs;

import BinaryTree.TreeNode;

public class MergeTwoBinaryTrees {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null) return root2;
        if (root2 == null) return root1;

        root1.val += root2.val;
        root1.left = mergeTrees(root1.left, root2.left);
        root1.right = mergeTrees(root1.right, root2.right);
        return root1;
    }
}

/*
    TESTING
    TreeNode root1 = new TreeNode(1);
    TreeNode anode2 = new TreeNode(2);
    TreeNode anode3 = new TreeNode(3);
    TreeNode anode5 = new TreeNode(5);
    root1.left = anode3;
    root1.right = anode2;
    anode3.left = anode5;
    
    TreeNode root2 = new TreeNode(2);
    TreeNode bnode1 = new TreeNode(1);
    TreeNode bnode3 = new TreeNode(3);
    TreeNode bnode4 = new TreeNode(4);
    TreeNode bnode7 = new TreeNode(7);
    root2.left = bnode1;
    bnode1.right = bnode4;
    root2.right = bnode3;
    bnode3.right = bnode7;

    var bin = new MergeTwoBinaryTrees();

    EXPLANATION
    - You want to start in root1, though if root1 is null for some reason
    you just return the node from the other tree, same for the opposite
    - If you have to non-null nodes, then you add them up and then return
    both the most left side and the most right side.
    - That reasignment of left val and right val, 
    will account for all the tree.
*/