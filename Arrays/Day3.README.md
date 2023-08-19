# Max Subarray Sorcerer 🎩✨

Delve into the realm of coding enchantment with the quest to find the subarray with the largest sum! 🪄✨ Embrace the challenge of unraveling the mysteries of algorithms as you journey through arrays and summon the power of Kadane's Algorithm to conquer this magical task! 🔮

## 🚀 Problematic Puzzles

**Problem Title:** Max Subarray Sum 📊
**Platform:** LeetCode 👾 [?](https://leetcode.com/problems/maximum-subarray/submissions/)
**Difficulty:** Medium 🌟
**Language:** Java ☕

---

## 🌌 Problem Description

Embark on a coding adventure as you seek the greatest power within subarrays! Given an array `nums` filled with integers, your quest is to find the subarray with the largest sum and return its sum. Unveil the hidden potential of subarrays as you conjure the ultimate sum!

**Example Spell 🪄:**
_Input:_
nums = [-2, 1, -3, 4, -1, 2, 1, -5, 4]
_Output:_
6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.

---

## 🔮 The Magical Approach

Behold the arcane Kadane's Algorithm, a spell woven to unveil the mightiest subarray sum! 🧙‍♂️

🌟 Introduce two enchanting variables, `cr_subArray` and `max`, guardians of the current subarray sum and the maximum subarray sum found so far.
🌟 Traverse the mystical array, unraveling the power of each element and the contiguous subarrays it forms.
🌟 As you traverse, add the current element to `cr_subArray` and update `max` with the greater of the two: `max` and `cr_subArray`.
🌟 If `cr_subArray` turns negative, release its grip and reset it to 0. Negative energy is best discarded to preserve the strength of the subarray.

**Time Complexity Spell ⏳:** The algorithm gracefully traverses the array's elements, whispering the time complexity as O(N), where N signifies the number of elements in the array.

**Space Complexity Chant 🔮:** Fear not the burden of space! The algorithm's magic sustains itself with mere constants. O(1) it echoes, for the variables `cr_subArray` and `max` stand vigilant with no room for excess.

---

## 🪄 The Spellbinding Experience

Embark on this mystical quest and dive into the realm of coding sorcery! Witness the harmony of algorithms, the dance of elements, and the power of efficient computation. 🌀✨

Embrace your coding wand and unlock the secrets hidden within arrays, as you hone the art of problem-solving, guided by the rhythm of logic and the allure of mathematics.

🌟 **Spell of Code Invocation 🪄:**

```java
class Solution {
    public int maxSubArray(int[] nums) {
        int cr_subArray = 0, max = nums[0];
        for(int i=0; i<nums.length; i++){
            cr_subArray += nums[i];
            max = Math.max(max, cr_subArray);
            if(cr_subArray < 0){
                cr_subArray = 0;
            }
        }
        return max;
    }
}
