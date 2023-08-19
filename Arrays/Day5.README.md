# Chocolate Distribution Enigma 🍫🔮

Unveil the secrets of chocolate distribution with a touch of sweetness and strategic calculation! 🪄✨ Immerse yourself in the realm of algorithms as we embark on a journey to distribute chocolate packets among students in a way that conjures harmony and minimizes disparity. Witness the art of logic as we ensure each student receives their fair share of delight! 🎉🍬�

## 🚀 Problematic Puzzles

**Problem Title:** Chocolate Distribution 🍫  
**Platform:** GeeksforGeeks 👾  [?](https://practice.geeksforgeeks.org/problems/chocolate-distribution-problem3825/1?utm_source=geeksforgeeks&utm_medium=ml_article_practice_tab&utm_campaign=article_practice_tab)  
**Difficulty:** Easy peasy 🍭  
**Language:** Java ☕

---

## 🌌 Problem Description

Prepare to be captivated by the delicious challenge of chocolate distribution! Given an array `A` of size `N` filled with positive integers representing the number of chocolates in each packet, and `M` students waiting eagerly to receive their treats, your mystical task is to find the minimum difference between the maximum and minimum number of chocolates distributed to the students. 🪄

**Example 🪄:**  
_Input:_  
N = 8, M = 5  
A = {3, 4, 1, 9, 56, 7, 9, 12}  
_Output:_
The minimum difference is 6  
Explanation: The minimum difference between maximum chocolates and minimum chocolates is 9 - 3 = 6 by choosing following M packets :{3, 4, 9, 7, 9}.

---

## 🔮 The Magical Approach

Behold, the ingenious algorithmic approach for the `findMinDiff` function! 🧙‍♂️

🌟 **Sort the Array:** Start by sorting the array `A` in ascending order. Sorting the array allows us to easily identify the contiguous subarray of size `M` with the minimum difference between its maximum and minimum elements.

🌟 **Find Minimum Difference Subarray:** Initialize two pointers `i` and `j`, both pointing to the start of the array. `i` represents the start of the subarray, and `j` is used to identify the end of the subarray. The goal is to find a subarray of size `M` with the smallest difference between its maximum and minimum elements.

🌟 **Slide the Subarray Window:** Move the subarray window by incrementing both pointers `i` and `j`. Calculate the difference between `A[j]` (maximum element of the subarray) and `A[i]` (minimum element of the subarray). Keep track of the smallest difference encountered, updating `minDiff` if a smaller difference is found.

🌟 **Return Result:** After the loop completes, the value of `minDiff` will hold the smallest difference between the maximum and minimum elements of a subarray of size `M`. Return `minDiff` as the result.

**Time Complexity Spell ⏳:** The dominant factor in the time complexity of this approach is the sorting step, which has a time complexity of O(N log N), where N is the number of elements in the array. The sliding window approach used in the while loop runs in linear time, O(N), as each element is processed once. Therefore, the overall time complexity of the solution is O(N log N), where N is the length of the input array.

**Space Complexity Chant 🔮:** The space complexity is primarily determined by the sorting algorithm's memory usage. If a comparison-based sorting algorithm is used, the space complexity is O(1) as it doesn't require additional memory proportional to the input size. However, if a sorting algorithm with space complexity proportional to the input size is used, the space complexity could be higher.

---

## 🌟 **Spell of Code Invocation 🪄:**

```java
// { Driver Code Starts
import java.io.*;
import java.util.*;

class ChocolateDistribution {
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int a[] = new int[n];
            
            for(int i=0; i<n; i++){
                a[i] = sc.nextInt();
            }
            
            Solution ob = new Solution();
            
            System.out.println(ob.findMinDiff(a, n, m));
        }
        
    }
}
// } Driver Code Ends

class Solution
{ 
    public long findMinDiff (int A[], int N, int M) 
    {
        //code here
        Arrays.sort(A);
        long minDiff = Long.MAX_VALUE;
        
        for (int i = 0; i + M - 1 < N; i++) {
            long diff = A[i + M - 1] - A[i];
            minDiff = Math.min(minDiff, diff);
        }
        
        return minDiff;
    }
}
