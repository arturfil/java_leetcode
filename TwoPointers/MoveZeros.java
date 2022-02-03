package TwoPointers;

public class MoveZeros {
    public void moveZeros(int[] nums) {
        int lastNonZero = 0;
        
        for(int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[lastNonZero++] = nums[i]; 
            }
        }

        for (int i = lastNonZero; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}

/*
    TEST
    int[] test = new int[] {0,1,0,3,12};
    var move = new MoveZeros();
    move.moveZeros(test);

    EXPLANATION
    - This is another type of two pointers
    - we need to point to the last index where we found a non-zero
    - if nums[i] != 0 => then we can place it INFRONT of the lastNonZero value
      hence lastNonZero++. after we are with the for loop, there will be 
      overidden values all over the array.
    - Because of that we need to place the 0's after the last non zero val.
    - This is why we run a second forloop startin at lastNonZero (one index next to the lastNZero)
*/
