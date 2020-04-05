/**
 * Given a 32-bit signed integer, reverse digits of an integer.
 * 
 * Example 1:
 * 
 * Input: 123 Output: 321 Example 2:
 * 
 * Input: -123 Output: -321 Example 3:
 * 
 * Input: 120 Output: 21
 */

class Solution {
    public int reverse(int x) {
        boolean isNegative = false;
        // Check for negative
        if (x < 0) {
            isNegative = true;
            x = -1*x;
        }
        
        String strNum = "";
        strNum = strNum + x;
        int result;
        String strResult = "";
        
        for(int i = strNum.length() - 1; i >= 0; i--) {
            strResult = strResult + strNum.charAt(i);
        }
        
        try {
            result = Integer.parseInt(strResult);
        } catch (NumberFormatException e) {
            return 0;
        }
        
        if (isNegative == true) {
            result = -1 * result;
        }
        
        return result;
    }
}