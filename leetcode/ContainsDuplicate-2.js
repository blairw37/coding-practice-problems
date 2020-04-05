/**
 * Given an array of integers and an integer k, 
 * find out whether there are two distinct indices i and j in the array such that nums[i] = nums[j] 
 * and the absolute difference between i and j is at most k.
 * @param {number[]} nums
 * @param {number} k
 * @return {boolean}
 */
var containsNearbyDuplicate = function(nums, k) {
    
    let containsNearbyDupe = false;

    for (let i = nums.length - 1; i > 0; i--) {
        for(let j = 0; j < nums.length; j++) {
            if (i !== j) {
                if (nums[i] == nums[j]) {
                    containsNearbyDupe = compareIndeces(i, j);
                    if (containsNearbyDupe == true) {
                        break;
                    }
                }
            }
        }
        if (containsNearbyDupe == true) {
            break;
        }
    }
    
    function compareIndeces(i1, i2) {
        return Math.abs(i1 - i2) <= k ? true : false;
    }
    
    return containsNearbyDupe;
};