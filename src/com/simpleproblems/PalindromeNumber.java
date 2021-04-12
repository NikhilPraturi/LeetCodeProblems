package com.simpleproblems;

public class PalindromeNumber {

  /*
   * Given an integer x, return true if x is palindrome integer.
   * 
   * An integer is a palindrome when it reads the same backward as forward. For example, 121 is
   * palindrome while 123 is not.
   * 
   * 
   * 
   * Example 1:
   * 
   * Input: x = 121 Output: true Example 2:
   * 
   * Input: x = -121 Output: false Explanation: From left to right, it reads -121. From right to
   * left, it becomes 121-. Therefore it is not a palindrome. Example 3:
   * 
   * Input: x = 10 Output: false Explanation: Reads 01 from right to left. Therefore it is not a
   * palindrome. Example 4:
   * 
   * Input: x = -101 Output: false
   * 
   * 
   * Constraints:
   * 
   * -231 <= x <= 231 - 1
   */
  public boolean isPalindrome(int x) {
    int rev = 0;
    int xVal = Math.abs(x);
    String val = String.valueOf(xVal);
    if (xVal > (int) Math.pow(2, 31)) {
      return false;
    } else {
      while (xVal != 0) {
        rev = rev * 10 + xVal % 10;
        xVal = xVal / 10;
      }

      if (String.valueOf(x).contains("-") && rev != 0) {
        return false;
      }
      if (rev == x) {
        return true;
      }
    }
    return false;
  }
}
