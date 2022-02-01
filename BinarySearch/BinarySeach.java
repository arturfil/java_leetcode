package BinarySearch;

public class BinarySeach {
    public int search(int[] nums, int target) {
        // if the largest number in the array is less than target
        if (nums[nums.length-1] < target) return -1; 
        int min = 0;
        int max = nums.length;
        while (min <= max) {
            int mid = (min + max) / 2;
            System.out.println(String.format("Mid is %s", mid));
            if (target == nums[mid]) {
                System.out.println(String.format("Found target %s", nums[mid]));
                return mid; // you want to return the index of where the number is
            }
            if (target > nums[mid]) 
                min = mid + 1;
            else 
                max = mid - 1;
        }
        return -1;
    }
}


/*
    TEST:
    var bin = new BinarySeach();
    // create an array with a for loop;
    int[] nums = new int[100]; // here we are declaring the space avialable in the array
    for(int i = 0; i < nums.length; i++) nums[i] = i + 1;
    bin.search(nums, 55);

    EXPLANATION:
    - You are searching through an array of any length (k length, n length ... w/e you want to call it)
    - For this to work, the data has to be pre-ordered (as described in the problem).
    - Everytime you look in the "mid" you compare the mid to your target. if you are way past your target,
      then you can get rid of all the data past that mid. You create a new range where the min value stays
      the same but the max value now becomes what was your mid previously.
    - After that you recalculate the mid until the mid falls in the target, which it will.
    - In the case that the target number is larger than the last number in the array (the largest value).
      You just return -1. The last return is there in order to comply with the method return signature
 */