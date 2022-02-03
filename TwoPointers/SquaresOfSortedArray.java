package TwoPointers;

public class SquaresOfSortedArray {
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int left = 0;
        int right = nums.length-1;

        for(int i = nums.length-1; i >= 0; i--) {
            int square;
            if (Math.abs(nums[left]) < Math.abs(nums[right])) {
                square = nums[right];
                right--;
            } else {
                square = nums[left];
                left++;
            }
            result[i] = square * square;
        }
        return result;
    }
}

/*
    TESTING
    int[] nums = new int[] {-4, -1, 0, 3, 10};
    var sqr = new SquaresOfSortedArray();
    sqr.sortedSquares(nums);

    EXPLANATION
    - The whole point of the problem is to use the two pointer technique.
    - You want to use two pointers beacuse seeing that the numbers are sorted
      and you have negative numbers, those numbers squared will obviously be
      larger than then consecutive numbers i.e. -3 squared > -1 squared;
    - Because of that fact, you want to point from the two ends of the array
    - begining = left; and end = right; therefore you compare their absolute
      value and which ever absolute value is smaller the opposite goes
      at the end of the array 
      .i.e. [-8, -4, ..., 5, 7] 7 is smaller than abs(-8) therefore square(-8) => 64
      goes at nums[i] where i is the LAST index.
    
*/