/**
 * 
 * Given a sorted array nums, remove the duplicates in -place such that each element appear only once and
 return the new length.

 Do not allocate extra space
 for another array, you must do this by modifying the input array in -place with O(1) extra memory.
 * 
 * @param {number[]} nums
 * @return {number}
 */
var removeDuplicates = function(nums) {
    
    let indexCounter = 0;

    for (let i = 1; i < nums.length; i++) {
        if (isPrevNumDifferent(nums[i-1], nums[i])) {
            indexCounter++;
            nums[indexCounter] = nums[i];
        }
    }
    
    nums.splice(indexCounter + 1);
};

function isPrevNumDifferent(prevNum, currentNum) {
    return prevNum === currentNum ? false : true;
}