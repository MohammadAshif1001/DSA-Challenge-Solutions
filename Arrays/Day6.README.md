# Rotated Sorted Array Sorcerer 🌀✨

Delve into the mystical realm of searching in rotated sorted arrays with the power of algorithms! 🪄✨ Embark on a quest to uncover the index of your desired target, even when the array has been enchanted with rotation. 🔮

## 🚀 Problematic Puzzles

**Problem Title:** Rotated Sorted Array Search 🔍  
**Platform:** LeetCode 👾 [?](https://leetcode.com/problems/search-in-rotated-sorted-array/description)  
**Difficulty:** Medium 🌟   
**Language:** Java ☕  

---

## 🌌 Problem Description

Embark on a journey through a rotated sorted array and unveil the secrets of target finding! You are given an array `nums` that has been rotated at an unknown pivot, and a target integer `target` that needs to be searched within the array. Your mystical task is to return the index of the target element if found, or -1 if it is not present. But beware, your algorithm must operate with O(log N) runtime complexity!

**Example Spells 🪄:**
_Input:_
nums = [4, 5, 6, 7, 0, 1, 2]  
target = 0  
_Output:_
Index of target 0: 4  

_Input:_
nums = [4, 5, 6, 7, 0, 1, 2]  
target = 3  
_Output:_
Index of target 3: -1  

---

## 🔮 The Magical Approach

Behold, the enigmatic algorithmic approach for searching in rotated sorted arrays! 🧙‍♂️

**Algorithm Steps 📜:**

1. Initialize two magical pointers, `start` and `end`, to mark the range of the array to be searched.
2. Perform a binary search within the specified range using the provided algorithmic steps.
3. Repeat the binary search steps until the `start` pointer is less than or equal to the `end` pointer.
4. If the target element is not found within the specified search range, return -1.

**Time Complexity Spell ⏳:** The algorithm performs binary search in a rotated sorted array, with each iteration reducing the search range by half. Hence, the time complexity is O(log N), where N is the number of elements in the array.

**Space Complexity Chant 🔮:** The algorithm uses only a constant amount of extra space for variables, resulting in a space complexity of O(1).

---

## 🪄 The Spellbinding Experience

Venture forth into the enchanting domain of rotated sorted arrays and unravel the art of efficient searching! Witness the convergence of binary search and rotation, as your code dances through the elements to reveal the hidden target. Embrace the challenges of algorithmic sorcery and let your code be guided by the rhythm of logic and the beauty of mathematical reasoning.

🌟 **Spell of Code Invocation 🪄:**

```java
class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;

        while(start<=end){
            int mid = start+(end-start)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] >= nums[start]){ 
                if(target >= nums[start] && target < nums[mid]){
                    end = mid-1;
                }else {
                    start = mid+1;
                }

            }else if (nums[mid] <= nums[end]){
                if(target > nums[mid] && target <= nums[end]){
                    start = mid+1;
                }else{
                    end = mid-1;
                }
            }

        }
        return -1;
    }
}
