package Array;

import java.util.HashMap;

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
//        HashMap<Integer, Integer> rawHashMap = new HashMap<>();
//        int k=0;
//        for (int i = 0; i < nums.length; i++) {
//            if (!rawHashMap.containsKey(nums[i])){
//                rawHashMap.put(nums[i],i);
//            }
//
//        }
//        k = rawHashMap.keySet().size();
//        int i=0;
//        for(int ele :rawHashMap.keySet() ){
//            nums[i] =  ele;
//            i++;
//        }
//        return k;

       int l = 0;
       int c = 0;
       int r = 0;
       while (r<nums.length){
           while (r<nums.length && nums[l]==nums[r]){
               r++;
           }
           nums[c]=nums[l];
           c++;
           r=l;
       }
       return c;
    }

}
