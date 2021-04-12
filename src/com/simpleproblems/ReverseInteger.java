package com.simpleproblems;

public class ReverseInteger {
  /*
   * 7. Reverse Integer
   * 
   * Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the
   * value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
   * 
   * Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
   * 
   * 
   * 
   * Example 1:
   * 
   * Input: x = 123 Output: 321 Example 2:
   * 
   * Input: x = -123 Output: -321 Example 3:
   * 
   * Input: x = 120 Output: 21 Example 4:
   * 
   * Input: x = 0 Output: 0
   * 
   * 
   * Constraints:
   * 
   * -231 <= x <= 231 - 1
   */
  public int reverse(int x) {
    int rev = 0;
    int xVal = Math.abs(x);
    String val = String.valueOf(xVal);
    if (xVal > (int) Math.pow(2, 31)) {
      return 0;
    } else {
      while (xVal != 0) {
        rev = rev * 10 + xVal % 10;
        xVal = xVal / 10;
      }
      try {
        if (rev != Integer.parseInt(new StringBuffer(val).reverse().toString())) {
          rev = 0;
        }
      } catch (Exception e) {
        rev = 0;
      }
      if (String.valueOf(x).contains("-") && rev != 0) {
        rev = -rev;
      }
    }
    return rev;
  }
}
