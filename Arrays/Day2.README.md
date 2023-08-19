# String Reversal 🔮✨


Discover the enchantment of reversing words with a magical algorithm! 🪄✨ Unveil the hidden beauty within as words are turned backward.

## Problematic Puzzles

- **Problem Level:** Easy peasy 🍭
- **Language:** Java ☕
- **Platform:** GeeksforGeeks 👾 [?](https://practice.geeksforgeeks.org/problems/reverse-a-string/1)

## Problem Description

Prepare to witness the mystical reversal of strings! Given a string `s`, your quest is to conjure its reversed form. 🪄

**Example Spell 🪄:**
_Input:_
s = "fihsA"
_Output:_
Reversed: "Ashif"

## The Magical Approach

Behold, the arcane algorithmic approach! 🧙‍♂️

- Employ a simple loop that traverses the input string in reverse order.
- During each iteration, append characters to a new string `r_str`, thereby creating the reversed version.
- Bask in the glory of the reversed string, your newfound treasure.

**Time Complexity Spell ⏳:** The algorithm unfolds with the elegance of linear time, gracefully moving through each character of the string. O(N) it proclaims, where N is the length of the input string.

**Space Complexity Chant 🔮:** Fear not the mystic costs of space! The algorithm's magic weaves a new string `r_str` to hold the reversed form. O(N) it whispers, for N characters beckon within the new string.

## The Spellbinding Experience

**Spell of Code Invocation 🪄:**

```java
//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class Driver
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- >0)
        {
            String str = read.readLine();
            System.out.println(new Reverse().reverseWord(str));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        String r_str = "";
        int n = str.length()-1;
        for(int i=n; i>=0; i--){
           r_str += str.charAt(i);
        }
        return r_str;
    }
}
