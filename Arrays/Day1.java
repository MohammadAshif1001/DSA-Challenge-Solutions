Problem Title: [Max Min]
Platform: [GFG]
Difficulty: [Easy]
Language: [Java]

---

## Problem Description

[Given an array A of size N of integers. Your task is to find the sum of minimum and maximum element in the array.]

[Example 1:
Input:
N = 5
A[] = {-2, 1, -4, 5, 3}
Output: 1
Explanation: min = -4, max =  5. Sum = -4 + 5 = 1]

## Approach

[The approach uses two variables, min and max, to keep track of the minimum and maximum elements encountered in the array. By updating these variables during the loop, we ensure that we find the minimum and maximum elements efficiently.

After iterating through the entire array, we return the sum of min and max, which gives us the desired result.

Time Complexity:
The algorithm iterates through the array once, performing constant-time operations in each iteration. Therefore, the time complexity of this approach is O(N), where N is the number of elements in the array.

Space Complexity:
The algorithm uses a constant amount of extra space for the min and max variables. Hence, the space complexity is O(1).]

## Code

```[Java]
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

