# Stock Profit Sorcerer 📈✨

Delve into the world of stock market sorcery with the enchanting array of prices! 🪄 Unleash your financial prowess as you embark on a journey to maximize your profit by buying and selling stocks on the perfect days! 💰🔮

## 🚀 Problematic Puzzles

**Problem Title:** Stock Profit Maximization 📊  
**Platform:** LeetCode 👾 [?](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/)  
**Difficulty:** Easy peasy 🍭  
**Language:** Java ☕  

---

## 🌌 Problem Description

Step into the world of trading enchantment! You're given an array `prices` where `prices[i]` represents the price of a given stock on the `i`th day.

Your mystical task is to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock. Return the maximum profit you can achieve from this transaction. If no profit can be achieved, return 0.

**Example:**  
_Input:_
prices = [7,1,5,3,6,4]  
_Output:_
5  
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.

---

## 🔮 The Magical Approach

Behold, the arcane algorithmic approach! 🧙‍♂️

🌟 Introducing the mystic variables, `buyPrice` and `maxProfit`, guiding you through the realm of financial magic.  
🌟 As we traverse the mystical array of prices, `buyPrice` holds the lowest price observed so far.  
🌟 If a higher stock price is encountered, the potential profit from selling is calculated, and `maxProfit` is updated if the calculated profit is greater.  
🌟 If the current price is not greater than `buyPrice`, a better opportunity to buy might arise, so `buyPrice` is updated to the current price.  

**Time Complexity Spell ⏳:** The algorithm dances gracefully through the array's elements, conjuring profit at the right moments. O(N) it proclaims, as N signifies the number of stock prices in the input array.  

**Space Complexity Chant 🔮:** Fear not the burden of space! The algorithm's magic sustains itself with mere constants. O(1) it whispers, for the variables `buyPrice` and `maxProfit` stand vigilant with no room for excess.  

---

## 🪄 The Spellbinding Experience

Join this mystical quest and cast your eyes upon the ethereal world of stock profit sorcery! Witness the power of financial calculations, the dance of opportunities, and the allure of making the right decisions.

Prepare to wield your financial wand and unveil the hidden truths within stock prices, as you embrace the art of maximizing profits, guided by the rhythm of logic and the allure of mathematical intuition.

🌟 **Spell of Code Invocation 🪄:**

```java
class Solution {
    public int maxProfit(int[] prs) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0; i<prs.length; i++){
            if(buyPrice < prs[i]){
                int profit = prs[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = prs[i];
            }
        }
        return maxProfit;
    }
}
