/*A happy number is a number defined by the following process:

Starting with any positive integer, replace the number by the sum of the squares of its digits.
Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
Those numbers for which this process ends in 1 are happy.
Return true if n is a happy number, and false if not.
 */ package linkedlist;

public class happynumber {
     public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        do
        {
            slow=findSquare(slow);
            fast=findSquare((findSquare(fast)));
            
        }while(fast!=slow); //first comparison must happen, therefore dowhile as both slow and fast==n
        if (slow == 1) {
            return true;
        }
        return false;
        
     }
     public int findSquare(int number) {
        int ans = 0;
        while (number > 0) {
            int rem = number % 10 ;
            ans =ans+( rem * rem);
            number /= 10;
        }
        return ans;
    }
     public static void main(String[] args) 
     {
        happynumber obj = new happynumber();
        System.out.println(obj.isHappy(19));
        System.out.println(obj.isHappy(2));
     }
    }
