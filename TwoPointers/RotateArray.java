package TwoPointers;

public class RotateArray {
    public void rotate(int[] nums, int k) {
        int[] temp = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            temp[(i + k) % nums.length] = nums[i];
            System.out.println(temp[i]);
        }
        for(int i = 0; i < nums.length; i++)  {
            nums[i] = temp[i];
        }
    }
}

/*
    TESTING
    var rotate = new RotateArray();
    int[] nums = new int[] {1,2,3,4,5,6,7};
    rotate.rotate(nums, 3);
    
    EXPLANATION
    - You create an array that is the same length as the nums array
    - You iterate through the array but adding k to the index "i" and also
    adding a "% nums.length" to the temp[i], like so: => temp[ (i + k) % nums.length]
    - What that does is that you start at i + k (where you want to start the shift)
    so k = 3  and i = 0, so it would be index 3. 
    - In this case and then once it reaches i = 4 + k => which is 7 and alos nums.length
    then it returns 0 because 7 % 7 = 0; and therefore you start placing the numbers
    you want shifted in the begining of the array;
    - console.log or use the debuger to print temp[i] in the first for loop to see 
    the result
*/