/**
 * 
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, two is written as II in Roman numeral, just two one's added together. Twelve is written as, XII, which is simply X + II. The number twenty seven is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9.
X can be placed before L (50) and C (100) to make 40 and 90.
C can be placed before D (500) and M (1000) to make 400 and 900.
Given an integer, convert it to a roman numeral. Input is guaranteed to be within the range from 1 to 3999.
 * 
 * @param {number} num
 * @return {string}
 */
var intToRoman = function(num) {
    
    let thousands = function() {
        let string = "";
        let count = 0;
        while(num >= 1000) {
            string += "M";
            num = num - 1000;
        }
        return string;
    }
    
    let fiveHundreds = function() {
        let string = "";
        let count = 0;
        if (num >= 900) {
            string = "CM";
            num = num - 900;
        } else {
            while(num >= 500) {
                string += "D";
                num = num - 500;
            }
        }
        return string;
    }
    
    let hundreds = function() {
        let string = "";
        let count = 0;
        while (num >= 100) {
            count++;
            num = num - 100;
            if (count > 3) {
                string = "CD";
            } else {
                string += "C";
            }
        }
        
        return string;
    }
    
    let fifties = function() {
        let string = "";
        if (num >= 90) {
            string = "XC";
            num = num - 90;
        } else {
            while (num >= 50) {
                string += "L";
                num = num - 50;
            }
        }
        return string;
    }
    
    let tens = function() {
        let string = "";
        let count = 0;
        while (num >= 10) {
            count++;
            num = num - 10;
            if (count > 3) {
                string = "XL";
            } else {
                string += "X";
            }
        }
        
        return string;
    }
    
    let fives = function() {
        let string = "";
        if (num == 9) {
            string = "IX";
            num = num - 9;
        } else {
            while (num >= 5) {
                string += "V";
                num = num - 5;
            }
        }
        return string;        
    }
    
    let ones = function() {
        let string = "";
        let count = 0;
        while (num >= 1) {
            count++;
            num = num - 1;
            if (count > 3) {
                string = "IV";
            } else {
                string += "I";
            }
        }
        
        return string;
    }
    
    return thousands() + fiveHundreds() + hundreds() + fifties() + tens() + fives() + ones();
    
};