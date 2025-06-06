package LeetCode;

/*
Example 1:

Input: word = "abcdefd", ch = "d"
Output: "dcbaefd"
Explanation: The first occurrence of "d" is at index 3.
Reverse the part of word from 0 to 3 (inclusive), the resulting string is "dcbaefd".
Example 2:

Input: word = "xyxzxe", ch = "z"
Output: "zxyxxe"
Explanation: The first and only occurrence of "z" is at index 3.
Reverse the part of word from 0 to 3 (inclusive), the resulting string is "zxyxxe".
Example 3:

Input: word = "abcd", ch = "z"
Output: "abcd"
Explanation: "z" does not exist in word.
You should not do any reverse operation, the resulting string is "abcd".
 */

public class ReversePrefixWord {
    public static void main(String[] args) {
        String s = "xyxzxe";
        char c = 'z';
        System.out.println(reversePrefix(s,c));

    }

    public static String reversePrefix(String word, char ch) {
        if(word.isBlank()) return "";
        int i = word.indexOf(ch);
        StringBuilder firstPart = new StringBuilder();
        if (i==-1) return word;
        else {
            firstPart.append(word.substring(0,i+1));
        }
        return firstPart.reverse().toString()+word.substring(i+1);
    }
}
