package easy;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static int arrayPairSum(int[] nums) {
        int n2 = nums.length;
        int n = n2/2;
        int sum=0;
        int k;
        for(int i=0; i<n; i++){
            k=1;
            if(n2==2){
                k=0;
            }
            if(nums[i]<=nums[n-i+k]){
                sum=sum+nums[i];
            }
            else{
                sum=sum+nums[n-i+k];
            }
        }
        return sum;
    }

    public static void reverseString(char[] s) {
        int len = s.length;
        char[] output = new char[len];

        for(int i=0; i<len; i++){
            output[i]=s[len-i-1];
        }
        System.out.println(output);
    }
    //#######################################################################################################################################
//        A self-dividing number is a number that is divisible by every digit it contains.
//
//        For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.
//
//        Also, a self-dividing number is not allowed to contain the digit zero.
//
//        Given a lower and upper number bound, output a list of every possible self dividing number, including the bounds if possible.
//
//Example 1:
//        Input:
//        left = 1, right = 22
//        Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]
//
//        Note:
//        The boundaries of each input argument are 1 <= left <= right <= 10000.
//#######################################################################################################################################

    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList();
        String temp;
        int intTemp;
        int count;
        for(int i = left; i<=right; i++){
            count = 0;
            temp = "" + i;;
            for(int j=0; j<temp.length(); j++){
                intTemp = Character.getNumericValue(temp.charAt(j));
                if(intTemp==0){
                    continue;
                }
                if(i%intTemp==0){
                    count++;
                }
                if(count==temp.length()){
                    result.add(i);
                }
            }
        }
        return result;
    }

    public static int singleNumber(int[] nums) {
        int len = nums.length;
        int count=0;
        int temp;
        for(int i=0; i<len; i++){
            count=0;
            temp=nums[i];
            for(int j=0; j<len; j++){
                if(temp==nums[j]){
                    count++;
                }
            }
            if(count==1){
                return temp;
            }
        }
        return 0;
    }
}
