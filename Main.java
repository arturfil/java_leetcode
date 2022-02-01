import BinarySearch.BinarySeach;

public class Main {
    public static void main(String[] args) {
        var bin = new BinarySeach();
        // create an array with a for loop;
        int[] nums = new int[100]; // here we are declaring the space avialable in the array
        for(int i = 0; i < nums.length; i++) nums[i] = i + 1;
        bin.search(nums, 55);
    }

}