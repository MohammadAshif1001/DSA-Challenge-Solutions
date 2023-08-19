# MaxMin Magician 🎩✨

Unveil the secrets of array manipulation with a touch of magic! 🪄✨ Dive into the realm of algorithms as we embark on a journey to decipher the sum of sorcery - the minimum and maximum elements of an array! 🔮

## 🚀 Problematic Puzzles

**Problem Title:** Max Min 📊
**Platform:** GeeksforGeeks 👾
**Difficulty:** Easy peasy 🍭
**Language:** Java ☕

---

## 🌌 Problem Description

Prepare to be amazed by the enigmatic array manipulation challenge! Given an array `A` of size `N` filled with integers, your mystical task is to conjure the sum of the smallest and largest elements within the array. 🪄

**Example Spell 🪄:**
_Input:_
N = 5
A[] = {-2, 1, -4, 5, 3}
_Output:_
min = -4, max =  5. Sum = -4 + 5 = 1

---

## 🔮 The Magical Approach

Behold, the arcane algorithmic approach! 🧙‍♂️

🌟 Introducing two enchanting variables, `min` and `max`, guardians of the minimum and maximum elements in the array.
🌟 As we traverse the mystical array, we update these variables to ensure their power remains unmatched.
🌟 Upon completing our journey, we unveil the wondrous sum of `min` and `max`.

**Time Complexity Spell ⏳:** The algorithm unfolds in linear time, gracefully dancing through the array's elements. O(N) it proclaims, as N signifies the number of elements in the array.

**Space Complexity Chant 🔮:** Fear not the burden of space! The algorithm's magic sustains itself with mere constants. O(1) it whispers, for the variables `min` and `max` stand vigilant with no room for excess.

---

## 🪄 The Spellbinding Experience

Join this mystical quest and cast your eyes upon the ethereal world of coding sorcery! Witness the harmony of algorithms, the dance of elements, and the power of efficient computation. 🌀✨

Prepare your coding wand and unravel the hidden truths within arrays, as you embrace the art of problem-solving, guided by the rhythm of logic and the allure of mathematics.

🌟 **Spell of Code Invocation 🪄:**

```java
//{ Driver Code Starts
import java.io.*;
import java.util.*;


class Array {
	public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int a[] = new int[n];
            
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
            }
            
            Solution ob = new Solution();
            
            System.out.println(ob.findSum(a,n));
        }
        
	}
}
// } Driver Code Ends


//User function Template for Java
class Solution
{ 
    public static int findSum(int A[],int N) 
    {
        //code here
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<N; i++){
            min = Math.min(min,A[i]);
            max = Math.max(max,A[i]);
        }
        return min + max;
    }
}


