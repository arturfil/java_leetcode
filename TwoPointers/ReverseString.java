package TwoPointers;

public class ReverseString {
    public void reverseString(char[] s) {
        for(int i = 0, j = s.length-1; i <= (s.length-1)/2 && j >= (s.length-1)/2; i++, j--) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
        }
        for(char c : s) System.out.print(c);
    }
}

/*
    TESTING
    var rev = new ReverseString();
    char[] word = new char[] {'h', 'e', 'l', 'l', 'o'};
    rev.reverseString(word);
    
    EXPLANATION
    - In order to reverse a string you can iterate through
    the char[] and point to the beg. and end. that way
    you just switch chars until you reach the middle
*/
