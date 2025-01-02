package org.example.sorting;

import java.util.PriorityQueue;

/**
 * _922_Leetcode_Sort_Array_By_Parity_II
 * <p>
 * Version 1.0
 * <p>
 * Date:  1/2/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 1/2/2025    NhanDinhVan    Create
 */

public class _922_Leetcode_Sort_Array_By_Parity_II {
    public int[] sortArrayByParityII(int[] nums) {
        PriorityQueue<Integer> oldQ = new PriorityQueue<>();
        PriorityQueue<Integer> evenQ = new PriorityQueue<>();

        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 == 0){
                evenQ.add(nums[i]);
            }else{
                oldQ.add(nums[i]);
            }
        }
        for(int i = 0; i < nums.length; i++){
            if(i%2 == 0){
                nums[i] = evenQ.poll();
            }else{
                nums[i] = oldQ.poll();
            }
        }
        return nums;
    }
}
