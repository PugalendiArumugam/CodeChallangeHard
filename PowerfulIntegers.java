package LeetCode.Medium;

import java.util.*;

/*
Given three integers x, y, and bound, return a list of all the powerful integers that have a value less than or equal to bound.
An integer is powerful if it can be represented as xi + yj for some integers i >= 0 and j >= 0.
You may return the answer in any order. In your answer, each value should occur at most once.

Example 1:
Input: x = 2, y = 3, bound = 10
Output: [2,3,4,5,7,9,10]
Explanation:
2 = 2^0 + 3^0
3 = 2^1 + 3^0
4 = 2^0 + 3^1
5 = 2^1 + 3^1
7 = 2^2 + 3^1
9 = 2^3 + 3^0
10 = 2^0 + 3^2

Example 2:
Input: x = 3, y = 5, bound = 15
Output: [2,4,6,8,10,14]
 */
public class PowerfulIntegers {
    public static void main(String[] args) {
        PowerfulIntegers pi = new PowerfulIntegers();
        System.out.println(pi.powerfulIntegers(2,3,10));
        System.out.println(pi.powerfulIntegers(5,3,15));
        System.out.println(pi.powerfulIntegers(2,1,10));   // [9,2,3,5]
    }

    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        Set<Integer> set = new HashSet<>();
        for (int i=1; i<=bound; i*=x){
            for(int j=1;(i+j)<=bound;j*=y){
                set.add(i+j);
                if(y==1) break;
            }
            if(x==1) break;
        }
        return new ArrayList<>(set);
    }


}
