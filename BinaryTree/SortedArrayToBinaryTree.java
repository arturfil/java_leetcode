package BinaryTree;

public class SortedArrayToBinaryTree {
    int[] nums;
    
    public TreeNode sortedArrayToBST(int[] nums) {
        this.nums = nums;
        return helper(0, nums.length-1);
    }

    public TreeNode helper(int left, int right) {
        if (left > right) return null;
        int p = (left + right) / 2;
        TreeNode root = new TreeNode(nums[p]);
        root.left = helper(left, p - 1);
        root.right = helper(p + 1, right);
        return root;
    }
}

/*
    TESTING
    int[] arr = new int[] {-10, -3, 0, 5, 9};
    var arrayToBts = new SortedArrayToBinaryTree();
    arrayToBts.sortedArrayToBST(arr);

    EXPLANATION
    - You are choosing the middle of the array. 
    - From there you are return a recursive function that assigns 
      both left and right nodes from each half.
*/