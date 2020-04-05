/**
 *
 * Given an array of integers, find
 if the array contains any duplicates.

 Your
 function should
 return true
 if any value appears at least twice in the array, and it should
 return false
 if every element is distinct.
 * 
 * 
 *  @param {number[]} nums
 * @return {boolean}
 */
var containsDuplicate = function(nums) {
    if (nums.length <= 1) {
        return false;
    }
    let storedNums = {};
    let isDupe = false;
    nums.forEach(num => {
        if (storedNums[num] == undefined) {
            storedNums[num] = num;
        } else {
            isDupe = true;
        }
    })
    
    return isDupe;
};